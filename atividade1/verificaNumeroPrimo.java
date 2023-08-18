package atividade1;
import java.util.Scanner;
import java.lang.Math;

public class verificaNumeroPrimo{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o numero para verificao: ");
        Integer numero = Integer.parseInt(num.nextLine()); 

        if(verificarNumeroPrimo(numero) >= 1){
            System.out.println("\nEh primo");
        }else{
            System.out.println("\nNao eh primo");
        }
    }

    public static Integer verificarNumeroPrimo(Integer n){
        if(n % 2 == 0){
            return 0;
        }

        for(Integer i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return 0;
            }
        }

        return 1;
    }
}