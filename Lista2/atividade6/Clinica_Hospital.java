package Lista2.atividade6;

/**
 * @brief
 * 
 * Criar um algortimo usando os conceitos de
 * herança e encapsulamento. Ele deve ser simples
 * contendo 4 classes.
 */

import java.util.Scanner;
import Lista2.atividade6.Clinica.Pessoa;
import Lista2.atividade6.Clinica.Empregado;
import Lista2.atividade6.Clinica.Enfermeiro;
import Lista2.atividade6.Clinica.medico;
import Lista2.atividade6.Clinica.paciente;

public class Clinica_Hospital{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)throws Exception { 
       Enfermeiro enfer1 = new Enfermeiro("Julia", "9821321", "29381297", 45, "Emergencia", "C921J", 10000);
       medico med1 = new medico("Marcos", "890802", "2391879", 36, "Cirurgião", "HB20", 30000);
       paciente doente = new paciente("Jairo", "2917323", "1500", 20, "NIGG@", "none", "Vasco");

       System.out.println(enfer1);
       System.out.println(med1);
       System.out.println(doente);
    }
}
