
package app;

import java.util.Scanner;

public class laboratorio19 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    float valor,limite = 2000;
    System.out.println("------CAIXA ELETRONICO-------");
    System.out.println("Valor máximo para saque 2000 reais");
    valor = learn.nextFloat();
    learn.close();
    if(valor > limite){
      System.out.println("Valor solicitado " + valor);
      System.out.println("Valor excede o limete de saque: " + limite + " reais");
      System.out.println("Valor recusado");
    }
    else{
      System.out.println("Valor solicitado " + valor + " reais");
      System.out.println("Valor Aprovado");
    }

    

  }

}