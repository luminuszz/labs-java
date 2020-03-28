package app;

import java.util.Scanner;

public class laboratorio2 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);// cria um objeto scanner

    float nota1, nota2, media;

    System.out.println("Digite a primeira nota: ");
    nota1 = learn.nextFloat();

    System.out.println("Digite a segunda nota: ");
    nota2 = learn.nextFloat();
    learn.close();

    media = ((nota1 * 4) + (nota2 * 6)) / 10;

    System.out.printf("A media do aluno e: " + media);

    if( media >= 6){
      System.out.printf("Aprovado");
    }
    else if(media < 6 && media > 4){
      System.out.printf("Prova final");
    }
    else{
      System.out.printf("Reprovado");
    }

  }
}


















