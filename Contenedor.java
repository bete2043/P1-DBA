/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pr1HelloWorld;

import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

/**
 *
 * @author jaime
 */
public class Contenedor extends Agent{
    
        public static void main(String[] args) {
            
            Runtime rt = Runtime.instance();
            Profile p = new ProfileImpl();
            p.setParameter(Profile.MAIN_HOST, "localhost");
            p.setParameter(Profile.CONTAINER_NAME, "ContainerAll");
            ContainerController cc = rt.createAgentContainer(p);
            
            try{
                
                AgentController mostarmensaje = cc.createNewAgent("Mostar mensaje", BasicHelloWorldAgent.class.getCanonicalName(), null);
                mostarmensaje.start();
                
                AgentController unicosaludo = cc.createNewAgent("Unico saludo", MensajeUnico.class.getCanonicalName(), null);
                unicosaludo.start();
                
                AgentController repitesaludo = cc.createNewAgent("Repite saludo", RepiteMensaje.class.getCanonicalName(), null);
                repitesaludo.start();
                
                AgentController sumador = cc.createNewAgent("Sumador", AgenteSumador.class.getCanonicalName(), null);
                sumador.start();
                
                } catch (Exception e) {
            e.printStackTrace();
            }
        
        }
}
