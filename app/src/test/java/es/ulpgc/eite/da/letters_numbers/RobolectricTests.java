package es.ulpgc.eite.da.letters_numbers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by Luis on junio, 2022
 */
@RunWith(RobolectricTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Config(sdk = 28)
public class RobolectricTests {

  RobolectricSteps steps = new RobolectricSteps();



  ////////// PORTRAIT TESTS //////////


  @Test
  public void test01_CrearPrimeraLetra() { // 1

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetras("1");
  }

  @Test
  public void test02_CrearSegundaLetra() { // 2

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetras("2");
  }

  @Test
  public void test03_PulsarEnSegundaLetra() { // 3

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // When pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }

  @Test
  public void test04_CrearPrimerNumeroParaSegundaLetra() { // 4

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnLista("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumeros("1");
  }

  @Test
  public void test05_CrearSegundoNumeroParaSegundaLetra() { // 5

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnLista("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnLista("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumeros("2");
  }

  @Test
  public void test06_RegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetras("2");
  }

  @Test
  public void test07_CrearTercerLetra() { // 7

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }

  @Test
  public void test08_PulsarEnTerceraLetra() { // 8

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // When pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }


  @Test
  public void test09_RegresarDesdePrimerNumeroParaTerceraLetra() { // 9

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }

  @Test
  public void test10_PulsarEnPrimeraLetra() { // 10

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // When pulsamos celda de letra en posicion "0"
    steps.pulsamosLetraEnLista("0");

    steps.iniciamosPantalla("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }


  @Test
  public void test11_RegresarDesdePrimerNumeroParaPrimeraLetra() { // 11

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosLetraEnLista("0");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }

  ////////// LANDSCAPE TESTS //////////


  @Test
  public void test12_CrearPrimeraLetraConRotacion() { // 12

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetras("1");
  }

  @Test
  public void test13_CrearSegundaLetraConRotacion() { // 13

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetras("2");
  }

  @Test
  public void test14_PulsarEnSegundaLetraConRotacion() { // 14

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");
    
    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }

  @Test
  public void test15_CrearPrimerNumeroParaSegundaLetraConRotacion() { // 15

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantalla("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnLista("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumeros("1");
  }

  @Test
  public void test16_CrearSegundoNumeroParaSegundaLetraConRotacion() { // 16

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantalla("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnLista("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnLista("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumeros("2");
  }

  @Test
  public void test17_RegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 17

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetras("2");
  }

  @Test
  public void test18_CrearTercerLetraConRotacion() { // 18

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }

  @Test
  public void test19_PulsarEnTerceraLetraConRotacion() { // 19

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }


  @Test
  public void test20_RegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 20

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }

  @Test
  public void test21_PulsarEnPrimeraLetraConRotacion() { // 21

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosLetraEnLista("0");

    steps.iniciamosPantalla("Numbers");

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumeros("0");
  }


  @Test
  public void test22_RegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 22

    steps.iniciamosPantalla("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetras("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosLetraEnLista("1");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosLetraEnLista("2");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosLetraEnLista("0");

    steps.iniciamosPantalla("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantalla("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnLista("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnLista("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnLista("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetras("3");
  }


  /*
  @Test
  public void testCrearPrimerNumeroParaTerceraLetra() {

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "3"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "3");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }
  */


  /*
  @Test
  //@Config(qualifiers="h780dp")
  public void testCrearPrimerNumeroParaPrimeraLetra() {

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "4"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "4");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }
  */


  /*
  @Test
  public void testCrearPrimerNumeroParaTerceraLetraConRotacion() {

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "3"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "3");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }
  */



  /*
  @Test
  public void testCrearPrimerNumeroParaPrimeraLetraConRotacion() {

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // And pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos numero en lista en posicion "0" con valor "4"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "4");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }
  */
}
