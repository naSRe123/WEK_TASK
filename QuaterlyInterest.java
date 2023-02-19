package task_wek;

import java.util.Scanner;

public class QuaterlyInterest {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the amount: ");
	        double amount = scanner.nextDouble();

	        double annualInterestRate = 0.045; // 4.5%
	        double quarterlyInterestRate = annualInterestRate / 4;
	        double quarterlyInterest = amount * quarterlyInterestRate;

	        System.out.printf("Quarterly interest generated: %.2f", quarterlyInterest);

	        scanner.close();
	    }
	}


