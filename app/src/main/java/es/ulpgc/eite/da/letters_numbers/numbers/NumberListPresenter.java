package es.ulpgc.eite.da.letters_numbers.numbers;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.app.LettersToNumbersState;
import es.ulpgc.eite.da.letters_numbers.app.NumbersToLettersState;
import es.ulpgc.eite.da.letters_numbers.data.NumberData;


public class NumberListPresenter implements NumberListContract.Presenter {

  public static String TAG = "Letters-Numbers.NumberListPresenter";

  private WeakReference<NumberListContract.View> view;
  private NumberListState state;
  private NumberListContract.Model model;
  private AppMediator mediator;

  public NumberListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    //state = mediator.getNumberListState();
  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    state = new NumberListState();

    /*
    if (state == null) {
      state = new NumberListState();
    }
    */


    // use passed state if is necessary
    LettersToNumbersState savedState = getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.updateDataFromPreviousScreen(
          savedState.data,
          savedState.number
      );
    }
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // get back the state
    state = mediator.getNumberListState();

    // update the model if is necessary
    model.updateDataOnRestartScreen(
        state.data,
        state.number
    );
    //model.updateDataOnRestartScreen(state.data);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // call the model and update the state
    state.data = model.getStoredData();
    state.number = model.getStoredNumber();

    Log.e(TAG, "number: "+state.number);
    Log.e(TAG, "data: "+state.data);

    // update the view
    view.get().refreshWithDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    NumbersToLettersState prevState =
        new NumbersToLettersState(state.data, state.number);
    passStateToPreviousScreen(prevState);

  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // save the state
    mediator.setNumberListState(state);

  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");
  }


  @Override
  public void onClickNumberListButton() {
    Log.e(TAG, "onClickNumberListButton()");

    model.onAddNumber();
    onResume();
  }

  @Override
  public void onClickNumberListCell(NumberData data) {
    Log.e(TAG, "onClickNumberListCell()");
  }

  private void passStateToPreviousScreen(NumbersToLettersState state) {
    mediator.setPreviousNumberListScreenState(state);
  }

  private LettersToNumbersState getStateFromPreviousScreen() {
    return mediator.getPreviousNumberListScreenState();
  }

  @Override
  public void injectView(WeakReference<NumberListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(NumberListContract.Model model) {
    this.model = model;
  }


}
