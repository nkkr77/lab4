
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nkkr7
 */

public class Car {
    
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year, String mk){
		yearModel = year;
		make = mk;
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car hyncar = new Car(2010, "Honda");
                
                System.out.println("Year model of the car: " + hyncar.getYearModel());
                System.out.println("Make of the car: " + hyncar.getMake());
                System.out.println();
                
		for(int i = 0; i < 5; i++)
                {
                    hyncar.accelerate();
                    System.out.println("Current speed of the car: " + hyncar.getSpeed());
                }


                for(int i = 0; i < 5; i++)
                {
                    hyncar.brake();
                    System.out.println("Current speed of the car: " + hyncar.getSpeed());
                }

               }

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelerate(){
		speed += 5;
		
	}
	
	public void brake(){
		speed -= 5;
		if (speed < 0) speed = 0;
	}
	
}

