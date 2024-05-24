package es.ulpgc.eite.da.letters_numbers.letters;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.da.letters_numbers.data.LetterData;


public interface LetterListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void refreshWithDataUpdated(LetterListViewModel viewModel);
    void navigateToNextScreen();

  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickLetterListButton();
    void onClickLetterListCell(LetterData data);
  }

  interface Model {

    Integer getStoredNumber();
    void updateDataFromNextScreen(LetterData data, Integer number);

    void updateDataOnRestartScreen(
        List<LetterData> datasource, Integer index, Integer number
    );

    List<LetterData> getStoredDatasource();
    void onAddLetter();
    Integer getStoredIndex();
  }


}
