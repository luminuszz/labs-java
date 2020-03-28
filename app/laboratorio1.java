package app;

import java.util.Scanner;

public class laboratorio1 {
  public static void main(final String[] args) throws Exception {

    Scanner learn = new Scanner(System.in);
    float valor1,valor2,valor3,media;
    System.out.println("Informe as médias");
    valor1 = learn.nextFloat();
    valor2 = learn.nextFloat();
    valor3 = learn.nextFloat();
    learn.close();
    

    media = ((valor1+ valor2+ valor3)/3);

    if(media >= 6){
      System.out.println("Media "+ media + " Aprovado");
    }

    if (media < 6) {
      System.out.println("Media " + media + " Reprovado");
    }


  }
}