/*
 Calculadora Simples Crie um programa Java que funcione como uma calculadora simples. 
 Peça ao usuário para inserir dois números e uma operação (+, -, *, /). 
 Realize a operação escolhida e exiba o resultado.
*/
import java.util.Scanner;

public class Exercicio1 {
    public static Scanner num = new Scanner(System.in);    
    public static void main(String[] args){
        float numero1,numero2;
        float resultado;
        char op;

        System.out.println("Digite os numeros: ");
        numero1 = num.nextFloat();
        numero2 = num.nextFloat();

        System.out.println("Escolha a operacao: ");
        op = num.next().charAt(0);

        switch(op){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("O resultado e " + resultado);
                num.close();
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("O resultado e " + resultado);
                num.close();
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("O resultado e " + resultado);
                num.close();
                break;

            case '/':
                if(numero2 == 0){
                    System.out.println("Nao existe divisao por zero");
                    num.close();
                }else{
                    resultado = numero1/numero2;
                    System.out.println("O resultado e " + resultado);
                    num.close();
                }
                break;

            default:
                System.out.println("Operacao invalida!");
                num.close();
                break;
        }
    }
}