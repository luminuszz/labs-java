package app;

import java.util.Scanner;

public class laboratorio3 {
  public static void main(final String[] args) throws Exception {
    final Scanner learn = new Scanner(System.in);
    int valor1,valor2,resolve;
    String ope;
    System.out.println("Caluladora");
    System.out.println("Informe 2 valores e depois a operação -> soma(+), subtração(-), divisão(/), multiplicação(x)");
    valor1 = learn.nextInt();
    valor2 = learn.nextInt();
    ope = learn.next();
    learn.close();


    switch (ope) {
      case "+":
      resolve = (valor1 + valor2);

      System.out.println("Resultado: "+ resolve);

        
        break;

        case "-":
        resolve = (valor1 - valor2);

        System.out.println("Resultado: " + resolve);

        break;
        case "x":
        resolve = (valor1 * valor2);

        System.out.println("Resultado: " + resolve);

        break;
        case "/":
        resolve = (valor1 / valor2);

        System.out.println("Resultado: " + resolve);

        break;
    
      default:
        System.out.println("Operação inválida");
        break;
    }


  }

}