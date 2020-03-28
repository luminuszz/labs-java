package app;

import java.util.Scanner;
public class laboratorio5{
  public static void main(final String[] args) throws Exception {
    final Scanner learn = new Scanner(System.in);
    double salario,resolve,response; 
    System.out.println("Informe seu salario");
    salario =  learn.nextDouble();
    learn.close();
    resolve = ((salario*11)/100);
    response = (salario - resolve);


    if(resolve < 318.20){

      System.out.println("Salário é  R$" + response);
    }
    else {
      
      System.out.println("Salario é R$"+ (salario - 318.20));
    }

   

  }
}