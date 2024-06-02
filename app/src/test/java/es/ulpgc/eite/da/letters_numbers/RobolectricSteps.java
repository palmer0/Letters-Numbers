package es.ulpgc.eite.da.letters_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import android.os.Bundle;
import android.widget.ListView;

import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;

import es.ulpgc.eite.da.letters_numbers.data.LetterData;
import es.ulpgc.eite.da.letters_numbers.data.NumberData;
import es.ulpgc.eite.da.letters_numbers.letters.LetterListActivity;
import es.ulpgc.eite.da.letters_numbers.letters.LetterListAdapter;
import es.ulpgc.eite.da.letters_numbers.numbers.NumberListActivity;
import es.ulpgc.eite.da.letters_numbers.numbers.NumberListAdapter;


/**
 * Created by Luis on junio, 2022
 */
public class RobolectricSteps {

  private ActivityController<LetterListActivity> lTestCtrl;
  private ActivityController<NumberListActivity> nTestCtrl;

  public void iniciamosPantalla(String scr) {

    if(scr.equals("Letters")) {

      lTestCtrl = Robolectric.buildActivity(LetterListActivity.class);
      lTestCtrl.create().resume().visible();

    }

    if(scr.equals("Numbers")) {
      lTestCtrl.pause();

      nTestCtrl = Robolectric.buildActivity(NumberListActivity.class);
      nTestCtrl.create().resume().visible();

    }

  }
  
  public void mostramosListaDeLetras(String dim) {
    //onView (withId (R.id.letterList)).check (matches (withListSize (p1)));

    int size = Integer.parseInt(dim);

    LetterListActivity activity = lTestCtrl.get();

    ListView list = activity.findViewById(R.id.letterList);
    LetterListAdapter adapter = (LetterListAdapter) list.getAdapter();


    //assertThat(String.valueOf(adapter.getCount()), equalTo(p1));
    assertThat(adapter.getCount(), equalTo(size));
  }

  public void pulsamosBotonDeListaDeLetras() {
    //onView(withId(R.id.letterListButton)).perform(click());

    LetterListActivity activity = lTestCtrl.get();
    activity.findViewById(R.id.letterListButton).performClick();
  }

  public void pulsamosBotonDeListaDeNumeros() {
    //onView(withId(R.id.numberListButton)).perform(click());

    NumberListActivity activity = nTestCtrl.get();
    activity.findViewById(R.id.numberListButton).performClick();
  }

  public void mostramosLetraEnLista(String pos, String val) {
    /*
    onView(withId (R.id.letterList))
        .check(matches(withValueAtPosition(p2, p1)));
        
    */

    int position = Integer.parseInt(pos);

    LetterListActivity activity = lTestCtrl.get();

    ListView list = activity.findViewById(R.id.letterList);
    LetterListAdapter adapter = (LetterListAdapter) list.getAdapter();
    LetterData item = adapter.getItem(position);

    assertThat(item.letter, equalTo(val));
  }

  public void pulsamosLetraEnLista(String pos) {
    /*
    onData(allOf())
        .inAdapterView(withId(R.id.letterList))
        .atPosition(Integer.valueOf(p1))
        .perform(click());
    */

    int position = Integer.parseInt(pos);

    LetterListActivity activity = lTestCtrl.get();
    ListView list = activity.findViewById(R.id.letterList);

    list.measure(0,0);
    list.layout(0,0,100,1000);

    //list.smoothScrollToPosition(pos);
    list.getChildAt(position).performClick();
    //shadowOf(list).performItemClick(pos);
  }

  public void mostramosListaDeNumeros(String dim) {
    //onView (withId (R.id.numberList)).check (matches (withListSize (p1)));

    int size = Integer.parseInt(dim);

    NumberListActivity activity = nTestCtrl.get();

    ListView list = activity.findViewById(R.id.numberList);
    NumberListAdapter adapter = (NumberListAdapter) list.getAdapter();


    assertThat(adapter.getCount(), equalTo(size));
  }



  public void mostramosNumeroEnLista(String pos, String val) {
    /*
    onView(withId (R.id.numberList))
        .check(matches(withValueAtPosition(p2, p1)));
    */


    int position = Integer.parseInt(pos);
    int number = Integer.parseInt(val);

    NumberListActivity activity = nTestCtrl.get();

    ListView list = activity.findViewById(R.id.numberList);
    NumberListAdapter adapter = (NumberListAdapter) list.getAdapter();
    NumberData item = adapter.getItem(position);

    assertThat(item.number, equalTo(number));
  }

  public void pulsamosBackEnListaDeNumeros() {
    //pressBack();

    //NumberListActivity activity = nTestCtrl.get();
    //activity.finish();

    nTestCtrl.pause().destroy();
    lTestCtrl.resume().visible();
  }

  public void rotarPantalla(String scr) {

    Bundle bundle = new Bundle();

    if(scr.equals("Letters")) {
      lTestCtrl
          .saveInstanceState(bundle)
          .pause()
          .stop()
          .destroy();

      lTestCtrl = Robolectric.buildActivity(LetterListActivity.class)
          .create(bundle)
          .restoreInstanceState(bundle)
          .resume()
          .visible();
    }

    if(scr.equals("Numbers")) {
      nTestCtrl
          .saveInstanceState(bundle)
          .pause()
          .stop()
          .destroy();

      nTestCtrl = Robolectric.buildActivity(NumberListActivity.class)
          .create(bundle)
          .restoreInstanceState(bundle)
          .resume()
          .visible();

    }

  }

 
}
