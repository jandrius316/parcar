package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
package cochera;

import java.util.Arrays;
import java.awt.Color;

public class Car
{  
    static int numberWheels = 4;                                      
    
    Garage theGarage=null;

    
   
    public Car (Garage g){
    	theGarage = g;
    }
   
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        car.slowDown();
        car.moveDown();
        car.accelerate();
        car.printGarage();

       
    }    
    
    private void printGarage() {
	
	
	}

	public void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
  
    public static void slowDown() throws InterruptedException{
    	String c = new String("     *");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
   
    public void moveDown() throws InterruptedException{
    	String c = new String("\t\t\t\t  *");
    	for(int i=0; i<5; i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
