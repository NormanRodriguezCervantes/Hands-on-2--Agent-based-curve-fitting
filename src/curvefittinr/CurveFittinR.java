/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curvefittinr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Jet_m
 */
public class CurveFittinR extends Agent {
    Eso claso = new Eso();
    
    @Override
    public void setup(){
        addBehaviour(new myShot());
    }  
    
    private class myShot extends OneShotBehaviour{
        @Override
        public void action(){
        claso.Execute();
        }
        
        @Override
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
