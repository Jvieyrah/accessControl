package com.trybe.acc.java.controledeacesso;

/**
 * Método principal.
 */
public class Response {
  /**
   * Método principal.
   */
  public void instructions(short age) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age >= 50) {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta, catraca liberada!");
    }
  }
}
