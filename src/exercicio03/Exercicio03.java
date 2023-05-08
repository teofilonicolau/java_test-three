/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Leitura da distância percorrida em km
        System.out.print("Digite a distância total percorrida pelo automóvel (em km): ");
        double distanciaPercorrida = input.nextDouble();

        // Leitura do total de combustível gasto em litros
        System.out.print("Digite o total de combustível gasto pelo automóvel (em litros): ");
        double combustivelGasto = input.nextDouble();

        // Cálculo do consumo médio do automóvel em km/l
        double consumoMedio = distanciaPercorrida / combustivelGasto;

        // Exibição do consumo médio do automóvel
        System.out.printf("O consumo médio do automóvel é de %.2f km/l.", consumoMedio);

        input.close();

    }

}
