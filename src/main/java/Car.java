
import static java.time.Clock.system;
import java.util.Scanner;

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
	private int speed = 0;
	
	public Car(int year, String mk){
		yearModel = year;
		make = mk;
		
	}
        
	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Car Model: ");
            int yr= sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Car Make: ");
            String model= sc1.nextLine();
            
		Car hyncar = new Car(yr, model);
                
                System.out.println("\nYear model of the car: " + hyncar.getYearModel());
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

