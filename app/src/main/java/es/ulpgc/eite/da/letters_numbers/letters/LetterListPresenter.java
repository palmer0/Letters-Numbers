package es.ulpgc.eite.da.letters_numbers.letters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.app.LettersToNumbersState;
import es.ulpgc.eite.da.letters_numbers.app.NumbersToLettersState;
import es.ulpgc.eite.da.letters_numbers.data.LetterData;


public class LetterListPresenter implements LetterListContract.Presenter {

  public static String TAG = "Letters-Numbers.LetterListPresenter";

  private WeakReference<LetterListContract.View> view;
  private LetterListState state;
  private LetterListContract.Model model;
  private AppMediator mediator;

  public LetterListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    //state = mediator.getLetterListState();
  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state
    state = new LetterListState();

    /*
    if (state == null) {
      state = new LetterListState();
    }
    */

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // get back the state
    state = mediator.getLetterListState();

    // update the model if is necessary
    model.updateDataOnRestartScreen(
        state.datasource,
        state.index,
        state.number
    );
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // use passed state if is necessary
    NumbersToLettersState savedState = getStateFromNextScreen();
    if (savedState != null) {

      Log.e(TAG, "number: "+savedState.number);
      Log.e(TAG, "data: "+savedState.data);
      Log.e(TAG, "datasource: "+state.datasource);

      // update the model if is necessary
      model.updateDataFromNextScreen(
          savedState.data,
          savedState.number
      );
    }

    // call the model and update the state
    state.datasource = model.getStoredDatasource();
    state.index=model.getStoredIndex();
    state.number=model.getStoredNumber();

    Log.e(TAG, "index: "+state.index);
    Log.e(TAG, "number: "+state.number);
    Log.e(TAG, "datasource: "+state.datasource);

    // update the view
    view.get().refreshWithDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // save the state
    mediator.setLetterListState(state);
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onClickLetterListButton() {
    Log.e(TAG, "onClickLetterListButton()");

    model.onAddLetter();
    onResume();
  }

  @Override
  public void onClickLetterListCell(LetterData data) {
    Log.e(TAG, "onClickLetterListCell()");

    LettersToNumbersState nextState =
        new LettersToNumbersState(data, state.number);
    passStateToNextScreen(nextState);

    view.get().navigateToNextScreen();
  }

  private void passStateToNextScreen(LettersToNumbersState state) {
    mediator.setNextLetterListScreenState(state);
  }


  private NumbersToLettersState getStateFromNextScreen() {
    return mediator.getNextLetterListScreenState();
  }

  @Override
  public void injectView(WeakReference<LetterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(LetterListContract.Model model) {
    this.model = model;
  }

}
