package app;

import java.util.Scanner;

public class laboratorio6 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    double temperatura;
    double resolve;
    String convertType;
    char tipoInical;

    System.out.println("Informe o valor para conversão");
    temperatura = learn.nextDouble();
    System.out.println("Informe o tipo inicial (C)-> CELSIUS, (F)-> FAHRENHEIT, (K) -> KELVIN");
    tipoInical = learn.next().charAt(0);
    System.out.println("Informe o tipo para conversão (C)-> CELSIUS, (F)-> FAHRENHEIT, (K) -> KELVIN");
    convertType = learn.next();
    learn.close();
    switch (convertType) {
      case "C":
        if (tipoInical == 'C') {
          System.out.println("Temperatura = Cº" + temperatura);
        } else if (tipoInical == 'F') {
          resolve = ((temperatura * 9 / 5) + 32);
          System.out.println("Temperatura = Fº" + resolve);
        } else if (tipoInical == 'K') {
          resolve = (temperatura + 273.15);
          System.out.println("Temperatura = Kº" + resolve);
        }
        else { System.out.println("Conversão inválida");}

        break;
      case "F":
        if (tipoInical == 'C') {
          resolve = ((temperatura - 32) * 5 / 9);
          System.out.println("Temperatura = Cº" + resolve);
        } else if (tipoInical == 'F') {
          System.out.println("Temperatura = Fº" + temperatura);
        } else if (tipoInical == 'K') {
          resolve = ((temperatura - 32) * 5 / 9 + 273.15);
          System.out.println("Temperatura = Kº" + resolve);
        }else { System.out.println("Conversão inválida");}

        break;

      case "K":
        if (tipoInical == 'C') {
          resolve = ((temperatura - 273.15));
          System.out.println("Temperatura = Cº" + resolve);
        } else if (tipoInical == 'F') {
          resolve = ((temperatura - 273.15)*9/5 + 32);
          System.out.println("Temperatura = Fº" + resolve);
        } else if (tipoInical == 'K') {
          System.out.println("Temperatura = Kº" + temperatura);
        }else { System.out.println("Conversão inválida");}

        break;

      default:
        System.out.println("Conversão inválida");
        break;
    }

  }

}