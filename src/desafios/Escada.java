// Descrição
// Faça um programa que solicite o nome do usuário e imprima-o de 
// forma a mostrar o nome em formato de escada.
 

// Entrada
// A entrada consiste em uma string, sendo ela uma palavra.

// Saída
// A saída deverá imprimir a palavra em formato de escada, 
// letra por letra, até se completar a palavra, conforme 
// exemplo abaixo.

package desafios;

import java.util.Scanner;

public class Escada {
    
  /**
   * @param args
   */
  public static void main (String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      String name;

      String str = "";


      System.out.println("Digite seu nome: ");
      name = scan.next();

      for(int i = 0; i < name.length(); i++) {
        char character = name.charAt(i);

        str = str + character;

        System.out.println(str);

      }

    }

  }

}