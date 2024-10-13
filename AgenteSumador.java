/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pr1HelloWorld;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;

import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class AgenteSumador extends Agent {
    private int[] numeros;
    private int suma;
    private int contador;

    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¿Cuántos números va a ingresar? ");
                contador = scanner.nextInt();
                numeros = new int[contador];

                for (int i = 0; i < contador; i++) {
                    System.out.print("Ingresa un numero: ");
                    numeros[i] = scanner.nextInt();
                }
            }


        });

        addBehaviour(new TickerBehaviour(this, 1000) { 
            int currentIndex = 0;

            @Override
            protected void onTick() {
                if (currentIndex < contador) {
                    suma += numeros[currentIndex];
                    System.out.println("Suma parcial: " + suma);
                    currentIndex++;
                } else {
                    double average = (double) suma / contador;
                    System.out.println("La media de los números es: " + average);
                    stop(); 
                }
            }
        });
    }

    @Override
    protected void takeDown() {
        System.out.println("El agente AverageCalculatorAgent ha sido terminado.");
    }
    
}
