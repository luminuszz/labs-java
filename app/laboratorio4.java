package app;

import java.util.Scanner;
public class laboratorio4{
  public static void main(final String[] args) throws Exception {
    final Scanner learn = new Scanner(System.in);

    int x, y, z;

    System.out.println("Informe os lados do triangulo");
    x= learn.nextInt();
    y= learn.nextInt();
    z= learn.nextInt();
    learn.close();

    if ((x < y + z) && (y < x + z) && (z < x+y)){
    if (x == y && x == z){
    System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero"
    );
    }else if((x == y) || (x == z)){
    System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
    }else
    System.out.println("Três lados diferentes, Escaleno.");
    }

    }


  }



//  int x, y, z;

//           x = InOut.leInt("Entre com o primeiro lado"); // classe particular criada para ler entrada de dados do teclado//
//           y = InOut.leInt("Entre com o segundo lado");
//           z = InOut.leInt("Entre com o terceiro lado");

       

//    if ((x < y + z) && (y < x + z) && (z < x+y)){
//         if (x == y && x == z){
//           System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
//         }else if((x == y) || (x == z)){
//           System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
//         }else
//             System.out.println("Três lados diferentes.");
//        }

//     }