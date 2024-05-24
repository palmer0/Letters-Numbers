package es.ulpgc.eite.da.letters_numbers.numbers;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.data.LetterData;
import es.ulpgc.eite.da.letters_numbers.data.NumberData;


public interface NumberListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void refreshWithDataUpdated(NumberListViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);
    //void injectRouter(Router router);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickNumberListButton();
    void onClickNumberListCell(NumberData data);
  }

  interface Model {
    LetterData getStoredData();
    Integer getStoredNumber();
    void updateDataOnRestartScreen(LetterData data, Integer number);
    void updateDataFromPreviousScreen(LetterData data, Integer number);

    void onAddNumber();
  }

  /*
  interface Router {

    LettersToNumbersState getStateFromPreviousScreen();

    void passStateToPreviousScreen(NumbersToLettersState state);
  }
  */
}
