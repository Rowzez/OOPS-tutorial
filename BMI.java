package net.javacode;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner weight= new Scanner(System.in);//Nguthis ni mnoma
		Scanner height= new Scanner(System.in);
		
		float w;
		float h;
		float bmi;
		
		System.out.print("Enter weight (in Kgs):");
		w = weight.nextFloat();
		
		System.out.print("Enter height (in m):");
		h = height.nextFloat();
		
		bmi = w/ (h*h);
		
		System.out.println("Your BMI is :" + bmi);

	}

}
