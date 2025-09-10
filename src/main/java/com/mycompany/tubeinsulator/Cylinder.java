/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubeinsulator;

/**
 *
 * @author ACER
 */
public class Cylinder {
   private double radius;
   private double height;
   
   public Cylinder(double radius,double height){
       this.height=height;
       this.radius=radius;
   }
   
   private void setRadius(double radius){
       this.radius=radius;
   }
   private double getRadius(double radius){
       return this.radius;
   }
   private void setHeight(double radius){
       this.height=height;
   }
   private double getHeight(double radius){
       return this.height;
   }
   
    public double getCylinderArea(){
        return 2*3.14*radius*height;
    }
    public double getCylinderVolume(){
        return 3.14*radius*radius*height;
    }
    
}
