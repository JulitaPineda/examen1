package org.eclipse.che.examples;

/**
  * 
  * @author Julia Pineda
  *
  */
 
public interface FabricaRanger {
    
    public void hacerAlgo();
    
    public boolean apilar(Monstruos monstruo);
    public boolean desapilar(Monstruos monstruo);
    public boolean encolar(Monstruos monstruo);
    public boolean desencolar(Monstruos monstruo);
    public Monstruos fabricar(String elemento);
    
}