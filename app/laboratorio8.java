


package app;

import java.util.Scanner;


public class laboratorio8{
public static void main(String[] args) throws Exception {
  
  Scanner learn = new Scanner(System.in);
  int ano;
  String mes;


  System.out.println("Digite um ano");
  ano = learn.nextInt();
  System.out.println("Informe o mês com as 3 primeiras letras");
  mes = learn.next();
  learn.close();

  // se o ano for maior que 400
 
  
    switch (mes) {
      case "FEB":
         if (ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)) {
           System.out.println(ano + " é bissexto.");
           System.out.println("29 dias");
         }
         else {
           System.out.println("28 dias");
         }
        break;
        case "NOV":
        case "ABR":
        case "JUN":
        case "SET":
        System.out.println("30 dias");
        break;
        
        case "JAN":
        case "MAR":
        case "MAI":
        case "JUL":
        case "AGO":
        case "OUT":
        case "DEZ":

          System.out.println("31 dias");
         break;
    
      default:
        System.out.println("Mês inválido");
        break;
    }
  }
  

}













