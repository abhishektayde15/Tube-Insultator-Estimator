/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubeinsulator;

/**
 *
 * @author ACER
 */
public class Tube {
    private double height;
    private double radius;
    
    public Tube(double height,double radius){
        this.height=height;
        this.radius=radius;
    }
    public  void setHeight(double height){
        this.height=height;     
    }
    
     public  void setRadius(double height,double radius){
        this.radius=radius;    
    }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
    public double areaOfTube(){
        return 2*3.14*radius*height;
    }
    public double volumeOfTube(){
        return 3.14*radius*radius*height;
    }
    
    
}
