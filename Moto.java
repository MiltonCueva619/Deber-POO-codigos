
package com.mycompany.vehiculo;

public class Moto extends Vehiculo {
    public Moto(String color, String marca, int fabricacion){
        super(color, marca, fabricacion);
    }
    @Override
    public void frenosDelanteros(){
        System.out.println("Frenando llantas delanteras");
    }
    @Override 
    public void soporteCaida(){
        System.out.println("Se pone el soporte para que no se caiga la moto");  
    }   
}
