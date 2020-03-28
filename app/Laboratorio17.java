package app;
import java.util.Scanner;

public class Laboratorio17 {
    public static void main(String[] args) throws Exception {
        int password;
        String cpf;
        
            Scanner learn = new Scanner(System.in);
            System.out.println("------------Validador de CPF---------------");
            System.out.println("Informe o seu CPF");
            cpf = learn.next();
            System.out.println("Informe sua senha ");
            password = learn.nextInt();
            learn.close();

         if( cpf != null && password != 0 ){
           switch (cpf) {
               case "88888888888":
               if( password == 98 ){
                   System.out.println("Usuario Logado");
               }
                   break;
                   case "44444444444 ":
               if( password == 97 ){
                   System.out.println("Usuario Logado");
               }
                   break;
                   case "22222222222 ":
               if( password == 96 ){
                   System.out.println("Usuario Logado");
               }
                   break;
                   case "77777777777 ":
               if( password == 95 ){
                   System.out.println("Usuario Logado");
               }
                   break;
                   case "55555555555 ":
               if( password == 94 ){
                   System.out.println("Usuario Logado");
               }
                   break;

               default:
                System.out.println("Credencias incorretas");
                   break;
           }
         }
         else {
             System.out.println("Você não informou um cpf, renicie o validador");
            }

       
    }
}