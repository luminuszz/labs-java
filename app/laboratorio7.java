package app;

import java.util.Scanner;

public class laboratorio7 {
  public static void main(final String[] args) throws Exception {
    final Scanner learn = new Scanner(System.in);
    int dia;
    System.out.println("Informe o dia da semana de 1 a 7");
    dia = learn.nextInt();
    learn.close();
    switch (dia) {
      case 1:
        System.out.println("dia: Domingo");

        break;

      case 2:
        System.out.println("dia: Segunda-feira");

        break;
      case 3:
        System.out.println("dia: Terça-feira");

        break;
      case 4:
        System.out.println("dia: Quarta-feira");

        break;
      case 5:
        System.out.println("dia: Quinta-feira");

        break;
      case 6:
        System.out.println("dia: Sexta-feira");

        break;
      case 7:
        System.out.println("dia: Sabado");

        break;
      default:
        System.out.println("Dia inválido");
        break;
    }

  }

}
