/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pr1HelloWorld;


import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author jaime
 */
public class MensajeUnico extends Agent {
    
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
             
                System.out.println("Hola.Solo saludo una vez.");
                doDelete(); 
            
            }
        });
    }

    @Override
    protected void takeDown() {
        System.out.println("El agente de mensaje unico ha sido terminado.");
    }
    
}
