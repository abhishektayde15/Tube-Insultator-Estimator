/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubeinsulator;

/**
 *
 * @author ACER
 */
public class Estimate {
  private Cylinder Tubecylinder;
  private Cylinder InsulatorCylinder;
  public Estimate (double tubeRadius,double tubeHeight,double insulatorRadius,double insulatorHeight){
      Tubecylinder=new Tube(tubeRadius,tubeHeight);
      InsulatorCylinder=new Insulator(insulatorRadius,insulatorHeight);
  } 
  
 public double getTubeVolume(){
    return Tubecylinder.getCylinderVolume();
 }
 
 public double getInsulatorVloume(){
     return InsulatorCylinder.getCylinderVolume();
 }
 
 public double getCorkVolume(){
     return Tubecylinder.getCylinderVolume()-InsulatorCylinder.getCylinderVolume();
 }
 
 
}


