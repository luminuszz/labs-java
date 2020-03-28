package app;

import java.util.Scanner;

public class laboratorio15 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    float moeda;
    double resolve;
    String convertType;
    char tipoInical;

    System.out.println("Informe o valor para conversão");
    moeda = learn.nextFloat();
    System.out.println("Informe a moeda inicial (D)-> DÓLAR, (R)-> REAL, (E) -> EURO");
    tipoInical = learn.next().charAt(0);
    System.out.println("Informe a moeda para conversão (D)-> DÓLAR, (R)-> REAL, (E) -> EURO");
    convertType = learn.next();
    learn.close();
    switch (convertType) {
      case "D":
        if (tipoInical == 'D') {
          System.out.println("Conversão = Dolar " + moeda);
        } else if (tipoInical == 'R') {
          resolve = (moeda / 5.10);
          System.out.println("Conversão = Real " + resolve);
        } else if (tipoInical == 'E') {
          resolve = (moeda / 0.90);
          System.out.println("Conversão = Euro " + resolve);
        } else {
          System.out.println("Conversão inválida ");
        }

        break;
      case "R":
        if (tipoInical == 'D') {
          resolve = (moeda * 5.10);
          System.out.println("Conversão = Dolar " + resolve);
        } else if (tipoInical == 'R') {
          System.out.println("Conversão = Real " + moeda);
        } else if (tipoInical == 'E') {
          resolve = (moeda * 5.50 );
          System.out.println("Conversão = Euro " + resolve);
        } else {
          System.out.println("Conversão inválida");
        }

        break;

      case "E":
        if (tipoInical == 'D') {
          resolve = (moeda * 1.12 );
          System.out.println("Conversão = Dolar " + resolve);
        } else if (tipoInical == 'R') {
          resolve = (moeda / 5.50);
          System.out.println("Conversão = Real"  + resolve);
        } else if (tipoInical == 'E') {
          System.out.println("Conversão = Euro " + moeda);
        } else {
          System.out.println("Conversão inválida");
        }

        break;

      default:
        System.out.println("Conversão inválida");
        break;
    }

  }

}