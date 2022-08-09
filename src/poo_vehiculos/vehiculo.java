/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_vehiculos;

/**
 *
 * @author SistemasU
 */
public class vehiculo {
    String moto_marca = null;
    String moto_color = null;
    
    String auto_marca;
    String auto_color;

    String avion_marca;
    String avion_color;

    String eli_marca;
    String eli_color;

    
    public vehiculo(String moto_marc, String moto_colo,String auto_marc, String auto_colo,String avion_marc, String avion_colo, String eli_marc, String eli_colo){
    
    this.moto_marca = moto_marc;
    this.moto_color = moto_colo;
    
    this.auto_marca = auto_marc;
    this.auto_color = auto_colo;
    
    this.avion_marca = avion_marc;
    this.avion_color = avion_colo;
    
    this.eli_marca = eli_marc;
    this.eli_color = eli_colo;
    }
    
    
    public void terrestre(){
        System.out.println("Motocicletas "+ moto_marca +" color "+ moto_color);
        System.out.println("Auto "+ auto_marca +" color "+ auto_color);
        System.out.println("Avion "+ moto_marca +" color "+ moto_color);
        System.out.println("Elicoptero "+ auto_marca +" color "+ auto_color);
    }
    public void aereo(){
        System.out.println("Avion "+ moto_marca +" color "+ moto_color);
        System.out.println("Elicoptero "+ auto_marca +" color "+ auto_color);
    }
}
