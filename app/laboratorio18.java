
package app;

import java.util.Scanner;

public class laboratorio18 {
  public static void main(final String[] args) throws Exception {
     Scanner learn = new Scanner(System.in);
     String sessao;
     System.out.println("------Gerenciador de ingressos--------");
     System.out.println("Escolha o filme: S -> SuperMan, H -> Homem de ferro ou R -> Rambo");
     sessao = learn.next();
     learn.close();

     switch (sessao) {
       case "S":
         System.out.println("Lugar confirmado aproveite sua sessão: SUPERMAN");
         break;
         case "H":
         System.out.println("Lugar confirmado aproveite sua sessão: HOMEM DE FERRO");
         break;
         case "R":
         System.out.println("Lugar confirmado aproveite sua sessão: RAMBO");
         break;
     
       default:
         System.out.println("Esse título não está na lista de filmes em cartaz");
         break;
     }

     
    
}

}