/**
 *  Configurar um caixa  de um mercado para aceitar dinheiro e cartão 
 * e aplicar as devidas taxas para cada forma de pagamento
 */


package app;

import java.util.Scanner;

public class laboratorio20 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    float valor;
    String forma;
    System.out.println("------ FLUXO DE CAIXA-------");
    System.out.println("Informe o valor da compra");
     valor = learn.nextFloat();
    System.out.println("Informe a forma de pagamento: (D)-> Dinheiro (C)-> Cartão");
     forma = learn.next();
    

     switch (forma) {
       case "D":
         System.out.println("Valor "+ valor);
         break;
        case "C":
          System.out.println("Informe a transação (1) -> credito, (2) -> debito, valor: " + valor);
          System.out.println(" credito -> taxa: 2,5%,   debito -> taxa: 3,0% ");
          int cartao = learn.nextInt();
          if(cartao == 1){
            double taxa = (+(valor*3.0)/100);
            double resolve = (valor + taxa);
            System.out.println("Valor total a se pagar: " + resolve);
            return;
          }
          else if(cartao == 2){
            double taxa = (+(valor * 2.5) / 100);
            double resolve = (valor + taxa);
            System.out.println("Valor total a se pagar: " + resolve);
            return;

          }
          else {
            System.out.println("Valor total a se pagar: ");
          }
          break;
        
      
     
       default:
         System.out.println("Forma de pagamento inválida ");
         break;
     }


    
   

  }

}