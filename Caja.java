/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author BORIS
 */
public class Caja {

    /**
     * @param args the command line arguments
     */
    /*public double ancho;
    public double largo;
    public double alto;*/
    
    private double ancho;
    private double largo;
    private double alto;
    // constructores S/P
    public Caja(){
        ancho=largo=alto=0;
    }
    
    // constructores C/P
    
    public Caja (double al,double la,double an){
        ancho=an;
        largo=la;
        alto=al;
    }
    // otros metodos
    public void imprimir(){
    System.out.println("Ancho:" + ancho + "largo:" + largo + "alto:" + alto);
    }
    //set/get
    
    public void setAncho(double a){
        ancho=a;
    }
    
    public void setLargo(double l){
        largo=l;
    }
    
    public void setAlto(double al){
        alto=al;
    }
    public double getAncho(){
        return ancho;
    } 
    
    public double getLargo(){
        return largo;
    } 
    
    public double getAlto(){
        return alto;
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        /*Caja obj1;
        obj1=new Caja();
        obj1.ancho=5;
        obj1.largo=6;
        obj1.alto=7;
        
        obj1.imprimir();*/
        Caja obj2 = new Caja ();
        
        obj2.setAncho(5);
        obj2.setLargo(6);
        obj2.setAlto(7);
        
        obj2.imprimir();
    }
    
}
