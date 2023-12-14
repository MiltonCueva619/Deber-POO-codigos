
package com.mycompany.vehiculo;

public abstract class Vehiculo {
    public String color;
    public String marca;
    public int fabricacion;
    private int numMotor;
    
    public Vehiculo(String color, String marca, int fabricacion){
        this.color=color;
        this.marca=marca;
        this.fabricacion=fabricacion;
      }
    
    public void setNumMotor(int numMotor){
        this.numMotor=numMotor;   
    }
    public int getNumMotor(){
        return numMotor;
    }
    
    public void subirVentanas(){
    System.out.println("Se suben las ventanas");
    }
    public void activarPlumas(){
    System.out.println("Plumas activadas");
    }
    
    public void frenosDelanteros(){
    System.out.println("Frenan las llantas delanteras");
    } 
    public void soporteCaida(){
    System.out.println("Soporte de caida activado");
    }  
    
    
    
    
}

      
