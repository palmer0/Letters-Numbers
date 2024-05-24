package es.ulpgc.eite.da.letters_numbers.app;


import es.ulpgc.eite.da.letters_numbers.data.LetterData;

public class LettersToNumbersState {

  public LetterData data;
  public Integer number;

  public LettersToNumbersState(LetterData data, Integer number) {
    this.data=data;
    this.number=number;
  }
}
