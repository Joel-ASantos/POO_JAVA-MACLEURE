/*
 Conversor de Temperatura Crie um conversor de temperatura que permita 
 ao usuário converter entre Celsius e Fahrenheit. 
 Peça ao usuário para escolher a direção da conversão e, em seguida, 
 faça a conversão e exiba o resultado.
*/
import java.util.Scanner;

public class Exercicio2{
    public static Scanner val = new Scanner(System.in);
    public static void main(String[] args) {
        int numero_Escolha;
        float temp;

        System.out.println("Digite (1) para conversão de Celsius para Fahrenheit");
        System.out.println("e (2) para conversão de Fahrenheit para Celsius");
        System.out.println("Escolha: ");
        numero_Escolha = val.nextInt();

        if(numero_Escolha > 2 || numero_Escolha < 1){
            System.out.println("\nEscolha invalida!");
            System.exit(0);
        }

        System.out.println("\n");

        System.out.println("Digite qual é o grau de energia a ser convertido: ");
        temp = val.nextFloat();

        val.close();

        Conversao(numero_Escolha,temp);
    }
    public static void Conversao(int x,float y){
        float calculo;

        switch(x){
            case 1:
                calculo = ((y * 18)/10) + 32;
                System.out.println("\nGraus Fahrenheit: " + calculo);
            break;

            case 2:
                calculo = ((y - 32) / 18) *10;
                System.out.println("\nGraus Celsius: " + calculo);
            break;
        }
    }
}