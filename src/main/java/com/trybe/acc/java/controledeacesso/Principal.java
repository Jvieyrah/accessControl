package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Método principal.
 */
public class Principal {
  /**
   * Método principal.
   */
  public static void main(String[] args) {
    ArrayList<Short> ages = new ArrayList<Short>();
    boolean end = false;
    Scanner scan = new Scanner(System.in);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out
          .println("1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
      short option = scan.nextShort();

      if (option == 2) {
        end = true;
        Report rep = new Report();
        rep.generate(ages);
      } else if (option == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scan.nextShort();
        ages.add(age);
        Response printer = new Response();
        printer.instructions(age);
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    } while (!end);

    scan.close();
  }
}
