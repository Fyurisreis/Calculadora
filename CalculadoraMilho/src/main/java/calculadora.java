

import java.util.Scanner;

public class Calculadora {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int iOpcao = 0;
        double dValor1;
        double dValor2;
        double dResultado;

        while (iOpcao  <=5 ){

            switch (iOpcao){
                case 1:
                    System.out.println();
                    System.out.println("Adição");
                    System.out.println();
                    System.out.println("Insira o primeiro valor:");
                    dValor1 = scn.nextDouble();

                    System.out.println();
                    System.out.println("Insira o segundo valor:");
                    dValor2 = scn.nextDouble();

                    dResultado = dValor1 + dValor2;
                    System.out.println();
                    System.out.println("O Resultado é:" + dResultado);

                    System.out.println();
                    System.out.println("Precione 'Enter' para retornar ao menu principal");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Subtração");
                    System.out.println();
                    System.out.println("Insira o primeiro valor:");
                    dValor1 = scn.nextDouble();

                    System.out.println();
                    System.out.println("Insira o segundo valor:");
                    dValor2 = scn.nextDouble();

                    dResultado = dValor1 - dValor2;
                    System.out.println();
                    System.out.println("O Resultado é:" + dResultado);

                    System.out.println();
                    System.out.println("Precione 'Enter' para retornar ao menu principal");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Multiplicação");
                    System.out.println();
                    System.out.println("Insira o primeiro valor:");
                    dValor1 = scn.nextDouble();

                    System.out.println();
                    System.out.println("Insira o segundo valor:");
                    dValor2 = scn.nextDouble();

                    dResultado = dValor1 * dValor2;
                    System.out.println();
                    System.out.println("O Resultado é:" + dResultado);

                    System.out.println();
                    System.out.println("Precione 'Enter' para retornar ao menu principal");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Divisão");
                    System.out.println();
                    System.out.println("Insira o primeiro valor:");
                    dValor1 = scn.nextDouble();

                    System.out.println();
                    System.out.println("Insira o segundo valor:");
                    dValor2 = scn.nextDouble();

                    dResultado = dValor1 / dValor2;
                    System.out.println();
                    System.out.println("O Resultado é:" + dResultado);

                    System.out.println();
                    System.out.println("Precione 'Enter' para retornar ao menu principal");
                    break;
                case 5:

                    break;
            }
            System.out.println("Bem vindo a Calculadora da Milho !!!");
            System.out.println();
            System.out.println("Vamos lá! Escolha a opção de calculo desejada:");
            System.out.println();
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");


            iOpcao = scn.nextInt();
        }
    }
}
