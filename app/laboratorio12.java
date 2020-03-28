package app;

import java.util.Scanner;

public class laboratorio12 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    float vel;

    System.out.println("Informe a velocidade");
    
    vel = learn.nextFloat();
    learn.close();
    if( vel <40){
      System.out.println("Você está dentro do limite da vida," );
    }
    System.out.println("sua velocidade: " + vel + "km");
    if(vel>= 40 && vel <=60){
      System.out.println("Multa de R$160,00");
    }
    else if (vel >= 60 && vel <= 80) {
      System.out.println("Multa de R$200,00");
    }

    else if(vel > 80){
      System.out.println("Multa de R$300,00");
    }
    

  }
}
