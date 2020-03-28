package app;

import java.util.Scanner;

public class laboratorio14 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
      double salario,resolve,limite;
      
    System.out.println("Informe seu salario");
    salario =  learn.nextDouble();
    limite = ((salario * 30) / 100);
    if(salario <= 1000){
        double taxa = 2.5;
        double emprestimo;
        System.out.println("Taxa cobrada de "+ taxa +  ", valor máximo do emprestimo: " + limite);
        System.out.println("Informe quanto quer tirar");
        emprestimo = learn.nextDouble(); 
        if(emprestimo > limite)   {
          System.out.println("Você não tem limite");
          learn.close();
          
          return;
        }    
        resolve = ((emprestimo* taxa)/100);
        System.out.println("Valor a ser creditado: " + (emprestimo - resolve));
        
      
    }
    else if (salario > 1000 && salario <= 2000){
      double taxa = 3.4;
      double emprestimo;
      System.out.println("Taxa cobrada de " + taxa + ", valor máximo do emprestimo: " + limite);
      System.out.println("Informe quanto quer tirar");
      emprestimo = learn.nextDouble();
      if (emprestimo > limite) {
        System.out.println("Você não tem limite");
        learn.close();
        return;
        
      }
      resolve = ((emprestimo * taxa) / 100);
      System.out.println("Valor a ser creditado: " + (emprestimo - resolve));
    }
    else  {
      double taxa = 4.2;
      double emprestimo;
      System.out.println("Taxa cobrada de " + taxa + ", valor máximo do emprestimo: " + limite);
      System.out.println("Informe quanto quer tirar");
      emprestimo = learn.nextDouble();
      if (emprestimo > limite) {
        System.out.println("Você não tem limite");
        learn.close();
        return;
      }
      resolve = ((emprestimo * taxa) / 100);
      System.out.println("Valor a ser creditado: " + (emprestimo - resolve));

    }
    learn.close();
    
  }
  
}