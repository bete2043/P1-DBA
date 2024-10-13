/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pr1HelloWorld;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

/**
 *
 * @author jaime
 */
public class RepiteMensaje extends Agent {
    
    
    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println("Hola.Te saludo cada dos segundos.");
                try {
                    Thread.sleep(2000);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void takeDown() {
        System.out.println("El agente que repite mensaje ha sido terminado.");
    }
}
