package es.ulpgc.eite.da.letters_numbers.letters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import es.ulpgc.eite.da.letters_numbers.R;
import es.ulpgc.eite.da.letters_numbers.data.LetterData;
import es.ulpgc.eite.da.letters_numbers.numbers.NumberListActivity;


public class LetterListActivity
    extends AppCompatActivity implements LetterListContract.View {


  public static String TAG = "Letters-Numbers.LetterListActivity";

  private LetterListContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_letter_list);
    setTitle(R.string.letters_title);


    /*
    // don't touch, necessary for testing
    if (savedInstanceState == null) {
      AppMediator.resetInstance();
    }
    */

    // do the setup
    LetterListScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @SuppressWarnings("deprecation")
  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }


  public void onClickLetterListButton(View view) {
    presenter.onClickLetterListButton();
  }

  @Override
  public void refreshWithDataUpdated(LetterListViewModel viewModel) {
    //Log.e(TAG, "refreshWithDataUpdated");

    List<LetterData> datasource = viewModel.datasource;

    // deal with the datasource
    ((ListView) findViewById(R.id.letterList)).setAdapter(
        new LetterListAdapter(this, datasource, new View.OnClickListener() {

          @Override
          public void onClick(View view) {
            LetterData data = (LetterData) view.getTag();
            presenter.onClickLetterListCell(data);
          }
        })
    );
  }


  @Override
  public void navigateToNextScreen() {
    Intent intent = new Intent(this, NumberListActivity.class);
    startActivity(intent);
  }

  @Override
  public void injectPresenter(LetterListContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
