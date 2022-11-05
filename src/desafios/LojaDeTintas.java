package desafios;

import java.util.Scanner;

public class LojaDeTintas {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      double areaCoberta = scanner.nextDouble();

// TODO: Utilize a função Math.ceil() para arredondamento
      double litrosTinta = Math.ceil(areaCoberta/6);

      double quantidadeLatas = Math.ceil(litrosTinta/18);
      double valorLata = 80;
      
      double quantidadeGaloes = Math.ceil(litrosTinta/3.6);
      double valorGalao = 25;
      
      System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
      System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }

  }
  
}