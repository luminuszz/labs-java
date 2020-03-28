package app;

import java.util.Scanner;

public class laboratorio9 {
  public static void main(String[] args) throws Exception {
    int idade;
    Scanner learn = new Scanner(System.in);
    System.out.println("Informe sua idade");
    idade = learn.nextInt();
    learn.close();
    if (idade > 17) {
      System.out.println("Adulto");

    } else if (idade <= 17) {
      switch (idade) {
        case 5 :
        case 6 : 
        case 7 :
          System.out.println("Infatil A");

          break;
        case 8 & 9 & 10:
          System.out.println("Infatil B");

          break;

        case 11 :
        case 12 :
        case 13 :
          System.out.println("Juvenil B");

          break;
          
        case 14 :
        case 15 :
        case 16 :
        case 17 : 
          System.out.println("Juvenil B");

          break;

        default:
          System.out.println("Você não se encaixa nas opções");

          break;
      }
    }

  }
}