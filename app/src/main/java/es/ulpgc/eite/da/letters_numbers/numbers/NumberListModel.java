package es.ulpgc.eite.da.letters_numbers.numbers;


import es.ulpgc.eite.da.letters_numbers.data.LetterData;
import es.ulpgc.eite.da.letters_numbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = "Letters-Numbers.NumberListModel";

  private LetterData data;
  private Integer number;

  @Override
  public LetterData getStoredData() {
    // Log.e(TAG, "getStoredData");
    return data;
  }


  @Override
  public Integer getStoredNumber() {
    return number;
  }


  @Override
  public void updateDataOnRestartScreen(LetterData data, Integer number) {
    // Log.e(TAG, "updateDataOnRestartScreen");
    this.data=data;
    this.number =number;
  }


  @Override
  public void updateDataFromPreviousScreen(LetterData data, Integer number) {
    // Log.e(TAG, "updateDataFromPreviousScreen");
    this.data=data;
    this.number =number;
  }

  @Override
  public void onAddNumber() {
    NumberData data1 = new NumberData();
    data1.number= number++;
    this.data.numbers.add(data1);
  }

}
