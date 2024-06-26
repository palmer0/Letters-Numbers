package es.ulpgc.eite.da.letters_numbers;


import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import es.ulpgc.eite.da.letters_numbers.app.AppMediator;
import es.ulpgc.eite.da.letters_numbers.letters.LetterListActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SuppressWarnings("ALL")
public class EspressoTests {


    @Rule
    public ActivityTestRule<LetterListActivity> rule =
        new ActivityTestRule<>(LetterListActivity.class);

    public EspressoRobot robot = new EspressoRobot();


    @After
    public void resetTest() {
        AppMediator.resetInstance();
    }

    /*
    public void rotateScreen() {

        Context context = ApplicationProvider.getApplicationContext();
        int orientation = context.getResources().getConfiguration().orientation;
        Activity activity = rule.getActivity();

        if(orientation  == Configuration.ORIENTATION_PORTRAIT) {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            );

        } else {
            activity.setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            );
        }

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) { }
    }
    */



    public void rotateScreen() {

        try {

            UiDevice device = UiDevice.getInstance(getInstrumentation());

            Thread.sleep(700);
            device.setOrientationLeft();
            Thread.sleep(700);
            device.setOrientationNatural();
            Thread.sleep(700);

        } catch (Exception e) {

        }

    }


    ////////// PORTRAIT TESTS //////////


    @Test
    public void test01_CrearPrimeraLetra() { // 1

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetras("1");
    }

    @Test
    public void test02_CrearSegundaLetra() { // 2

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test03_PulsarEnSegundaLetra() { // 3

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test04_CrearPrimerNumeroParaSegundaLetra() { // 4

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test05_CrearSegundoNumeroParaSegundaLetra() { // 5

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnLista("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumeros("2");
    }

    @Test
    public void test06_RegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test07_CrearTercerLetra() { // 7

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test08_PulsarEnTerceraLetra() { // 8

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }


    @Test
    public void test09_RegresarDesdePrimerNumeroParaTerceraLetra() { // 9

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test10_PulsarEnPrimeraLetra() { // 10

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");

        

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }


    @Test
    public void test11_RegresarDesdePrimerNumeroParaPrimeraLetra() { // 11

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    ////////// LANDSCAPE TESTS //////////


    @Test
    public void test12_CrearPrimeraLetraConRotacion() { // 12

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetras("1");
    }

    @Test
    public void test13_CrearSegundaLetraConRotacion() { // 13

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test14_PulsarEnSegundaLetraConRotacion() { // 14

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test15_CrearPrimerNumeroParaSegundaLetraConRotacion() { // 15

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test16_CrearSegundoNumeroParaSegundaLetraConRotacion() { // 16

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnLista("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumeros("2");
    }

    @Test
    public void test17_RegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 17

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test18_CrearTercerLetraConRotacion() { // 18

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test19_PulsarEnTerceraLetraConRotacion() { // 19

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }


    @Test
    public void test20_RegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 20

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test21_PulsarEnPrimeraLetraConRotacion() { // 21

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");

        

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }


    @Test
    public void test22_RegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 22

        

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");

        

        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();

        // When rotamos pantalla
        rotateScreen();

        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }



    
    /*
    @Test
    public void test01CrearPrimeraLetra() { // 1

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetras("1");
    }

    @Test
    public void test02CrearSegundaLetra() { // 2

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test03PulsarEnSegundaLetra() { // 3

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test04CrearPrimerNumeroParaSegundaLetra() { // 4

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test05CrearSegundoNumeroParaSegundaLetra() { // 5

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnLista("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumeros("2");
    }

    @Test
    public void test06RegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test07CrearTercerLetra() { // 7

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test08PulsarEnTerceraLetra() { // 8

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test09CrearPrimerNumeroParaTerceraLetra() { // 9

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "3"
        robot.mostramosNumeroEnLista("0", "3");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test10RegresarDesdePrimerNumeroParaTerceraLetra() { // 10

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test11PulsarEnPrimeraLetra() { // 11

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test12CrearPrimerNumeroParaPrimeraLetra() { // 12

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // When pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // Then mostramos numero en lista en posicion "0" con valor "4"
        robot.mostramosNumeroEnLista("0", "4");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test13RegresarDesdePrimerNumeroParaPrimeraLetra() { // 13

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }









    @Test
    public void test14CrearPrimeraLetraConRotacion() { // 14

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos lista de letras con dimension "1"
        robot.mostramosListaDeLetras("1");
    }

    @Test
    public void test15CrearSegundaLetraConRotacion() { // 15

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test16PulsarEnSegundaLetraConRotacion() { // 16

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test17CrearPrimerNumeroParaSegundaLetraConRotacion() { // 17

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test18CrearSegundoNumeroParaSegundaLetraConRotacion() { // 18

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "1"
        robot.mostramosNumeroEnLista("0", "1");
        // And mostramos numero en lista en posicion "1" con valor "2"
        robot.mostramosNumeroEnLista("1", "2");
        // And mostramos lista de numeros con dimension "2"
        robot.mostramosListaDeNumeros("2");
    }

    @Test
    public void test19RegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 19

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos lista de letras con dimension "2"
        robot.mostramosListaDeLetras("2");
    }

    @Test
    public void test20CrearTercerLetraConRotacion() { // 20

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test21PulsarEnTerceraLetraConRotacion() { // 21

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test22CrearPrimerNumeroParaTerceraLetraConRotacion() { // 22

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "3"
        robot.mostramosNumeroEnLista("0", "3");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test23RegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 23

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }

    @Test
    public void test24PulsarEnPrimeraLetraConRotacion() { // 24

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos lista de numeros con dimension "0"
        robot.mostramosListaDeNumeros("0");
    }

    @Test
    public void test25CrearPrimerNumeroParaPrimeraLetraConRotacion() { // 25

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos numero en lista en posicion "0" con valor "4"
        robot.mostramosNumeroEnLista("0", "4");
        // And mostramos lista de numeros con dimension "1"
        robot.mostramosListaDeNumeros("1");
    }

    @Test
    public void test26RegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 26

        // Given mostramos lista de letras con dimension "0"
        robot.mostramosListaDeLetras("0");
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "1"
        robot.pulsamosLetraEnLista("1");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos boton de lista de letras
        robot.pulsamosBotonDeListaDeLetras();
        // And pulsamos celda de letra en posicion "2"
        robot.pulsamosLetraEnLista("2");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // And pulsamos celda de letra en posicion "0"
        robot.pulsamosLetraEnLista("0");
        // And pulsamos boton de lista de numeros
        robot.pulsamosBotonDeListaDeNumeros();
        // And pulsamos back en lista de numeros
        robot.pulsamosBackEnListaDeNumeros();
        // When rotamos pantalla
        rotateScreen();
        // Then mostramos letra en lista en posicion "0" con valor "A"
        robot.mostramosLetraEnLista("0", "A");
        // And mostramos letra en lista en posicion "1" con valor "B"
        robot.mostramosLetraEnLista("1", "B");
        // And mostramos letra en lista en posicion "2" con valor "C"
        robot.mostramosLetraEnLista("2", "C");
        // And mostramos lista de letras con dimension "3"
        robot.mostramosListaDeLetras("3");
    }
    */
}