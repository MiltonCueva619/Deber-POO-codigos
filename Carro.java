
package com.mycompany.vehiculo;

public class Carro extends Vehiculo {
    public Carro(String color, String marca, int fabricacion){
        super(color,marca,fabricacion);
}
    @Override
    public void subirVentanas(){
        System.out.println("Se suben las ventanas");
    }
    @Override
    public void activarPlumas(){
    System.out.println("Las plumas limpian el agua");
    }  
}
