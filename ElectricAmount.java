package task_wek;


import java.util.Scanner;

public class ElectricAmount {
	public static void main(String[] args) {
		
	
    System.out.println("Please enter the date of payment(only the numeric value of Only  date");

    Scanner a = new Scanner(System.in);

    int inp = a.nextInt();

    int due = 1000 ;

    int penalty = 0 ;
    
    int totalAmount =0;

if(inp <=  10 ){

System.out.println("The Due amount is Rs. " + due );

}else

{

penalty = (1000 * 1/100 ) ;
totalAmount= due+penalty;

System.out.println("The Due amount is Rs. " + due + " and the penalty is Rs." + penalty + " total amount is Rs. "+totalAmount );

}

}

}


