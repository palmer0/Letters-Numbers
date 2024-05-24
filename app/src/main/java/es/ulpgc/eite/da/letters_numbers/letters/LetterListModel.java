package es.ulpgc.eite.da.letters_numbers.letters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.da.letters_numbers.data.LetterData;


public class LetterListModel implements LetterListContract.Model {

  public static String TAG = "Letters-Numbers.LetterListModel";

  private String[] letters = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
      "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

  private List<LetterData> datasource;
  private Integer index;
  private Integer number;

  public LetterListModel() {
    datasource= new ArrayList<>();
    index=0;
    number=1;
  }

  @Override
  public void updateDataOnRestartScreen(
      List<LetterData> datasource, Integer index, Integer number
  ) {

    // Log.e(TAG, "updateDataOnRestartScreen");

    this.datasource = datasource;
    this.index=index;
    this.number=number;
  }

  @Override
  public List<LetterData> getStoredDatasource() {
    return datasource;
  }


  @Override
  public void onAddLetter() {
    LetterData data = new LetterData();
    data.letter=letters[index++];
    datasource.add(data);
  }

  @Override
  public Integer getStoredIndex() {
    return index;
  }

  @Override
  public Integer getStoredNumber() {
    return number;
  }

  @Override
  public void updateDataFromNextScreen(LetterData data, Integer number) {
    // Log.e(TAG, "updateDataFromNextScreen");

    Log.e(TAG, "datasource: "+datasource);

    this.number=number;
    datasource.set(datasource.indexOf(data), data);
  }

}
