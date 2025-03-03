package org.generation;

import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) { //Coloque el metodo main para que corra el programa por que no lo tenía
        Scanner s = new Scanner(System.in); 
        //Solo coloque un metodo scanner nos funciona para tener ambos strings de los jugadores

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //cambiamos el string jugador 2
        String j2 = s.nextLine(); 
        
        int g = 0;

        if (j1.equals(j2)) { // si ambos jugadores eligen lo mismo imprimira empate
            System.out.println("Empate"); 
        } else {
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    } else if (j2.equals("papel")) { // Aqui coloco otra condicion que gane el jugador 2 de acuerdo a la logica
                        g = 2;                  
                        }
                    break; //colocamos el break para que no entre en los demas casos
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    } else if (j2.equals("tijeras")) {
                        g = 2; 
                    }
                    break; //colocamos el break para que no entre en los demas casos
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    } else if (j2.equals("piedra")) {
                        g = 2;
                    }
                    break;//colocamos el break para que no entre en los demas casos
                default:
                    System.out.println("Opción inválida. Debes elegir entre piedra, papel o tijeras.");
                    break;//colocamos el break para que no entre en los demas casos
            }
            //Aqui verificamos la variable si algun jugador gano se imprimiria 
           if (g != 0) {
                System.out.println("Gana el jugador " + g);
            }
        }

        s.close(); //Cerramos el scanner para que no genere problemas
    }
}
