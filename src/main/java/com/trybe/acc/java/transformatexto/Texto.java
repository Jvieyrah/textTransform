package com.trybe.acc.java.transformatexto;

/**
 * texto generico. author joao
 *
 */
public class Texto {
  /**
   * tex2 author joao.
   *
   */
  public String transformaTexto(String frase) {
    String newFrase = frase.replaceAll("\\+", " ");
    int indexOfA = newFrase.indexOf("a");
    if (indexOfA != -1 && indexOfA % 2 == 0) {
      return newFrase.toUpperCase();
    }
    String firstWord = newFrase.split(" ")[0];
    return firstWord;
  }
}
