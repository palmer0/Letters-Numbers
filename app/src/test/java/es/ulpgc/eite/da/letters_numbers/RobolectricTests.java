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

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetrasConDimensionP1("1");
  }

  @Test
  public void test02_CrearSegundaLetra() { // 2

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void test03_PulsarEnSegundaLetra() { // 3

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // When pulsamos celda de letra en posicion "1"
    steps.pulsamosCeldaDeLetraEnPosicionP1("1");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }

  @Test
  public void test04_CrearPrimerNumeroParaSegundaLetra() { // 4

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

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }

  @Test
  public void test05_CrearSegundoNumeroParaSegundaLetra() { // 5

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

    // When pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // And pulsamos boton de lista de numeros
    steps.pulsamosBotonDeListaDeNumeros();
    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumerosConDimensionP1("2");
  }

  @Test
  public void test06_RegresarDesdeSegundoNumeroParaSegundaLetra() { // 6

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
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void test07_CrearTercerLetra() { // 7

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
    // When pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void test08_PulsarEnTerceraLetra() { // 8

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
    // When pulsamos celda de letra en posicion "2"
    steps.pulsamosCeldaDeLetraEnPosicionP1("2");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void test09_RegresarDesdePrimerNumeroParaTerceraLetra() { // 9

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
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void test10_PulsarEnPrimeraLetra() { // 10

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
    // When pulsamos celda de letra en posicion "0"
    steps.pulsamosCeldaDeLetraEnPosicionP1("0");

    steps.iniciamosPantallaP1("Numbers");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void test11_RegresarDesdePrimerNumeroParaPrimeraLetra() { // 11

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
    // When pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();
    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  ////////// LANDSCAPE TESTS //////////


  @Test
  public void test12_CrearPrimeraLetraConRotacion() { // 12

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos lista de letras con dimension "1"
    steps.mostramosListaDeLetrasConDimensionP1("1");
  }

  @Test
  public void test13_CrearSegundaLetraConRotacion() { // 13

    steps.iniciamosPantallaP1("Letters");

    // Given mostramos lista de letras con dimension "0"
    steps.mostramosListaDeLetrasConDimensionP1("0");
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();
    // And pulsamos boton de lista de letras
    steps.pulsamosBotonDeListaDeLetras();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void test14_PulsarEnSegundaLetraConRotacion() { // 14

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
    
    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }

  @Test
  public void test15_CrearPrimerNumeroParaSegundaLetraConRotacion() { // 15

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos lista de numeros con dimension "1"
    steps.mostramosListaDeNumerosConDimensionP1("1");
  }

  @Test
  public void test16_CrearSegundoNumeroParaSegundaLetraConRotacion() { // 16

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Numbers");

    // Then mostramos numero en lista en posicion "0" con valor "1"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("0", "1");
    // And mostramos numero en lista en posicion "1" con valor "2"
    steps.mostramosNumeroEnListaEnPosicionP1ConValorP2("1", "2");
    // And mostramos lista de numeros con dimension "2"
    steps.mostramosListaDeNumerosConDimensionP1("2");
  }

  @Test
  public void test17_RegresarDesdeSegundoNumeroParaSegundaLetraConRotacion() { // 17

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos lista de letras con dimension "2"
    steps.mostramosListaDeLetrasConDimensionP1("2");
  }

  @Test
  public void test18_CrearTercerLetraConRotacion() { // 18

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void test19_PulsarEnTerceraLetraConRotacion() { // 19

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void test20_RegresarDesdePrimerNumeroParaTerceraLetraConRotacion() { // 20

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
  }

  @Test
  public void test21_PulsarEnPrimeraLetraConRotacion() { // 21

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

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos lista de numeros con dimension "0"
    steps.mostramosListaDeNumerosConDimensionP1("0");
  }


  @Test
  public void test22_RegresarDesdePrimerNumeroParaPrimeraLetraConRotacion() { // 22

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
    // And pulsamos back en lista de numeros
    steps.pulsamosBackEnListaDeNumeros();

    // When rotamos pantalla
    steps.rotarPantallaP1("Letters");

    // Then mostramos letra en lista en posicion "0" con valor "A"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("0", "A");
    // And mostramos letra en lista en posicion "1" con valor "B"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("1", "B");
    // And mostramos letra en lista en posicion "2" con valor "C"
    steps.mostramosLetraEnListaEnPosicionP1ConValorP2("2", "C");
    // And mostramos lista de letras con dimension "3"
    steps.mostramosListaDeLetrasConDimensionP1("3");
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
