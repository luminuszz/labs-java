package app;

import java.util.Scanner;

public class Laboratorio10 {
    public static void main(String[] args) throws Exception {
        Scanner learn = new Scanner(System.in);
        int idade;
        float peso, altura, resolve;
        System.out.println("-----------------CALCULADOR DE MASSA -----------------");
        System.out.println("Responda a seguinte pergunta");
        System.out.println("Informe sua Idade");
        idade = learn.nextInt();
        System.out.println("Informe seu peso em KG");
        peso = learn.nextFloat();
        System.out.println("Informe sua Altura");
        altura = learn.nextFloat();
        resolve = ((peso) / (altura * 2));
        System.out.println("O valor é " + resolve);
        learn.close();
        if (idade < 18) {
            switch (idade) {
                case 1:
                    if (resolve <= 6.3) {
                        System.out.println("normal");
                    } else if (resolve > 6.3 && resolve <= 7.2) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 2:
                    if (resolve <= 8.2) {
                        System.out.println("normal");
                    } else if (resolve > 8.2 && resolve <= 9.8) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }
                    break;

                case 3:
                    if (resolve <= 10.6) {
                        System.out.println("normal");
                    } else if (resolve > 10.6 && resolve <= 11.6) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 4:
                    if (resolve <= 12.6) {
                        System.out.println("normal");
                    } else if (resolve > 12.6 && resolve <= 15.0) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 5:
                    if (resolve <= 15.6) {
                        System.out.println("normal");
                    } else if (resolve > 15.6 && resolve <= 16.3) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 6:
                    if (resolve <= 16.6) {
                        System.out.println("normal");
                    } else if (resolve > 16.6 && resolve <= 18.0) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 7:
                    if (resolve <= 17.3) {
                        System.out.println("normal");
                    } else if (resolve > 17.3 && resolve <= 19.1) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 8:
                    if (resolve <= 18.7) {
                        System.out.println("normal");
                    } else if (resolve > 18.7 && resolve <= 20.3) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 9:
                    if (resolve <= 18.8) {
                        System.out.println("normal");
                    } else if (resolve > 18.8 && resolve <= 21.4) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 10:
                    if (resolve <= 19.6) {
                        System.out.println("normal");
                    } else if (resolve > 19.6 && resolve <= 20.5) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 11:
                    if (resolve <= 20.3) {
                        System.out.println("normal");
                    } else if (resolve > 20.3 && resolve <= 23.7) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 12:
                    if (resolve <= 21.1) {
                        System.out.println("normal");
                    } else if (resolve > 21.1 && resolve <= 24.8) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;
                case 13:
                    if (resolve <= 21.9) {
                        System.out.println("normal");
                    } else if (resolve > 21.9 && resolve <= 25.9) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                case 14:
                    if (resolve <= 22.7) {
                        System.out.println("normal");
                    } else if (resolve > 22.7 && resolve <= 26.9) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }

                    break;

                default:
                    if (resolve <= 23.6) {
                        System.out.println("normal");
                    } else if (resolve > 23.6 && resolve <= 27.7) {
                        System.out.println("Sobrepeso");
                    } else {
                        System.out.println("Obesidade");
                    }
                    break;

            }

        } else if (idade >= 18) {
            if (resolve < 17) {
                System.out.println("Muito abaixo do peso");
            }
            if (resolve <= 17 && resolve <= 18.49) {
                System.out.println("Abaixo do peso");
            }
            if (resolve <= 18.5 && resolve <= 24.99) {
                System.out.println("Peso normal");
            }
            if (resolve <= 25 && resolve <= 29.99) {
                System.out.println("Acima do peso");
            }
            if (resolve <= 30 && resolve <= 34.99) {
                System.out.println(" Obesidade I");
            }
            if (resolve <= 30 && resolve <= 34.99) {
                System.out.println("Obesidade II (severa)");
            }
            if (resolve > 40) {
                System.out.println("Obesidade II (severa)");
            }

        }

    }

}
