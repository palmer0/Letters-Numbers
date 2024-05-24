package es.ulpgc.eite.da.letters_numbers.app;


import es.ulpgc.eite.da.letters_numbers.letters.LetterListState;
import es.ulpgc.eite.da.letters_numbers.numbers.NumberListState;

public class AppMediator  {

  private static AppMediator instance;

  private LetterListState letterListState;
  private NumberListState numberListState;

  private LettersToNumbersState lettersToNumbersState;
  private NumbersToLettersState numbersToLettersState;

  private AppMediator() {
    //numberListState=new NumberListState();
    //letterListState=new LetterListState();
  }

  public static AppMediator getInstance(){
    if(instance==null){
      instance= new AppMediator();
    }

    return instance;
  }

  public static void resetInstance(){
    instance=null;
  }

  public LetterListState getLetterListState() {
    return letterListState;
  }

  public NumberListState getNumberListState() {
    return numberListState;
  }

  public void setLetterListState(LetterListState state) {
    letterListState= state;
  }

  public void setNumberListState(NumberListState state) {
    numberListState= state;
  }

  /*
  public void resetLetterListState() {
    letterListState= null;
  }

  public void resetNumberListState() {
    numberListState= null;
  }
  */

  public void setNextLetterListScreenState(LettersToNumbersState state) {
    lettersToNumbersState=state;

  }

  public NumbersToLettersState getNextLetterListScreenState() {
    NumbersToLettersState state=numbersToLettersState;
    numbersToLettersState = null;
    return state;
  }

  public void setPreviousNumberListScreenState(NumbersToLettersState state) {
    numbersToLettersState=state;
  }

  public LettersToNumbersState getPreviousNumberListScreenState() {
    LettersToNumbersState state=lettersToNumbersState;
    lettersToNumbersState = null;
    return state;
  }
}
