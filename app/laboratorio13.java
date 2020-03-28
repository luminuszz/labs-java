package app;

import java.util.Scanner;

public class laboratorio13 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    int numero1, numero2, numero3, auxiliar;
    System.out.println("Iforme os valores");
    numero1 = learn.nextInt();
    numero2 = learn.nextInt();
    numero3 = learn.nextInt();
    learn.close();

    if (numero1 > numero2) {
      auxiliar = numero1;
      numero1 = numero2;
      numero2 = auxiliar;
    }

    if (numero2 > numero3) {
      auxiliar = numero2;
      numero2 = numero3;
      numero3 = auxiliar;

    }

    if (numero1 > numero2) {
      auxiliar = numero1;
      numero1 = numero2;
      numero2 = auxiliar;
    }

    System.out.println("Crecente: " + numero1 +" "+ numero2 +" " + numero3);

    System.out.println("decrescente " +   numero3 + " " + numero2 + " " +  numero1);
  }
}