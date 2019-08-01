/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

/**
 *
 * @author DesarrolloWeb
 */
public class Bicicleta {



   private String nroDeSerie;
   private String modelo; 
   private int año;
   private float precio;
   

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "nroDeSerie=" + nroDeSerie + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }


   
    
}
