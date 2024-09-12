package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Método principal.
 */
public class Report {
  /**
   * Método principal.
   */
  public void generate(ArrayList<Short> data) {
    short total = (short) data.size();
    short menores = 0;
    short maiores = 0;
    short seniors = 0;

    for (int i = 0; i < total; i++) {
      short value = data.get(i);
      if (value < 18) {
        menores++;
      } else if (value >= 50) {
        seniors++;
      } else {
        maiores++;
      }
    }

    double percMenor = (double) menores / total * 100;
    double percMaiore = (double) maiores / total * 100;
    double percSenior = (double) seniors / total * 100;

    DecimalFormat decimalFormat = new DecimalFormat("0.0#");

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + maiores);
    System.out.println("a partir de 50: " + seniors);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + decimalFormat.format(percMenor) + "%");
    System.out.println("adultas: " + decimalFormat.format(percMaiore) + "%");
    System.out.println("a partir de 50: " + decimalFormat.format(percSenior) + "%");
    System.out.println("TOTAL: " + total);
  }
}

