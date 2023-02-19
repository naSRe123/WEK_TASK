package task_wek;

		 import java.time.LocalDate;
		 import java.time.DayOfWeek;
		 import java.time.format.DateTimeFormatter;
		 import java.util.Scanner;

		 public class Date_filter {
		     public static void main(String[] args) {
		    	 
		         Scanner scanner = new Scanner(System.in);
		         System.out.print("Enter the start date (dd-mm-yyyy): ");
		         
		         String startDateString = scanner.nextLine();
		         LocalDate startDate = LocalDate.parse(startDateString);

		         System.out.print("Enter the end date (dd-mm-yyyy): ");
		         String endDateString = scanner.nextLine();
		         LocalDate endDate = LocalDate.parse(endDateString);

		         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");

		         LocalDate currentDate = startDate;
		         while (!currentDate.isAfter(endDate)) {
		             DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		             if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.THURSDAY || dayOfWeek == DayOfWeek.FRIDAY) {
		                 String dateString = currentDate.format(formatter);
		                 System.out.println(dateString);
		             }
		         
		         
		             currentDate = currentDate.plusDays(1);
		         } 
		        	 
		         

		         
		     }
		 }
