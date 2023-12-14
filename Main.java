
package com.mycompany.vehiculo;

public class Main {
    public static void main(String[] args){
        Carro carroGrande = new Carro("Negro","Ford",2023);
        Moto motoDeportiva = new Moto ("verde","Kawasaki",2021);
        
        carroGrande.activarPlumas();
        motoDeportiva.frenosDelanteros();
    }
    
    
}
