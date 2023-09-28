package Lista2.atividade6;
import java.io.IOException;
import java.util.Scanner;
import Lista2.atividade6.Clinica.paciente;
import Lista2.atividade6.Clinica.medico;
import Lista2.atividade6.Clinica.Enfermeiro;

/*
 * Compilar: javac *nome_do_arquivo.java*
 * Executar: java *nome_do_arquivo.ja*
 */

public class Clinica_Hospital{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){ 
        int esc = 0;

        while(esc != 4){
            System.out.println("1-Ver os dados do paciente");
            System.out.println("2-Ver os dados do enfermerio");
            System.out.println("3-Ver os dados do medico");
            System.out.println("4-Encerrar Programa");
            esc = scanner.nextInt();
            Escolha(esc);
        }
    }
    public static void Escolha(int opcao){
        switch(opcao){
            case 1:
                paciente p_doente1 = new paciente("Jairo", "03294432", "21344455", 23, "POQR", "Católica_saúde", "Moderado");
                paciente p_doente2 = new paciente("Felipe", "329432344","3434454", 16, "RICH", "Leonardo_saúde", "Grave");                        
                
                System.out.println(p_doente1);
                System.out.println(p_doente2);

                new Scanner(System.in).nextLine();
                clearScreen();
            break;

            case 2:
                medico med1 = new medico("Ana", "231243", "98374384", 35, "Emergência", "RT09c", 30000);
                medico med2 = new medico("Lúcia", "234345", "1435567", 46, "Apoio diagnóstico", "YP20K", 30000);
                
                System.out.println(med1);
                System.out.println(med2);

                new Scanner(System.in).nextLine();
                clearScreen();
            break;

            case 3:
                Enfermeiro enfer1 = new Enfermeiro("Beatriz", "09813913", "309842933", 28, "Emergência", "Crt09", 10000);
                Enfermeiro enfer2 = new Enfermeiro("Maria", "01983982", "093204123", 34, "Apoio diagnóstico", "Kgh02", 10000);
            
                System.out.println(enfer1);
                System.out.println(enfer2);

                new Scanner(System.in).nextLine();
                clearScreen();
            break;

            case 4:
                opcao = 4;
                System.out.println("Encerrando o Programa");
            break;
        }
    }
    public static void clearScreen(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch (IOException | InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}