package week04Project;

import java.util.Arrays;

public class codingProject {

	public static void main(String[] args) {
		// Java 4 coding project 

		
		
		
		int [] ages = {3,9,23,64,2,8,28,93};
		 int result = ages[ages.length -1] - ages[0];
		 	System.out.println("Age results: " + result);
	// create a new array and subtract the value of the last element - the first element
		 	
		 int [] ages2 = new int [9];
		 int result2 = ages2[ages2.length -1] - ages2[0]; 
		 System.out.println("Age 2 resulst:  " + result2);
	// create a new array with 9 elements and do the same as age array  	
		 	
		 int sum =0;	
		 for (int age : ages) {
		 		sum += age;
		 	}
		int average = (int) sum/ ages.length;
		System.out.println("Average age:  " + average);
	// make a loop that iterates through the loop and gives the average age  	 	
	
		String [] namesArray = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
		 int sum1 =0;	
		 for (String name : namesArray) {
		 		sum1 += name.length();
		 	}
		int average1 = (int) sum1 / namesArray.length;
		System.out.println("Average name length:  " + average1);
	// make a loop that iterates and finds the average length of names	
		
		String concatenatedNamesArray = " ";
		for (String name : namesArray) {
			concatenatedNamesArray += name + " ";
		}
		System.out.println("Concatenated names: " + concatenatedNamesArray.trim());
		
	// use a loop to concatenate all the names separated by spaces 
		
		int i = ages.length -1;
		int lastElement = ages[i];
			
		System.out.println("The last elememt in ages array is: " + lastElement);
	// get the last element in an array
		
		int firstElement = ages[0];
		
		System.out.println("The last elememt in ages array is: " + firstElement);
	// get the first element in an array 	
		
		int [] nameLengths = new int [namesArray.length];
		
		for (int z = 0; z < namesArray.length; z++) {
			nameLengths[z] = namesArray[z].length();
			}
		System.out.println("Name array lengths: " + Arrays.toString(nameLengths));
	//write a loop to iterate name array and add the length of each name to the nameLengths array
		
		int sum3 = 0;
		for (int length : nameLengths) {
			sum3 += length;
		} 
		System.out.println("Sum of name length: " + sum3 );
	// 	calculate  the sum of all elements in names array 
		
		String result1 = concatenateWord("Kailoni", 3);
		System.out.println(result1);
		
	//concatenate a word to itself a number of times
	
		String fullName = fullName("Kailoni", "Dangelo");
		System.out.println("Full name:  " + fullName);
	// write a method that takes firstName and lastName to return a fullName 

		int [] numberArray = {15,30,50,75,100};
		boolean result4 = greaterThan100(numberArray);
		System.out.println(result4);
	// 	takes an array of integers and returns true if the sum of all integers is greater than 100
	
		double [] productPrices = {10.99, 15.99, 19.99, 24.99, 34.99};
		double average2 = averagePrice(productPrices);
		System.out.println("Average Price in storefront: " + average2);
		
	// takes an array of double and returns the average of all the elements in the array
		
		double [] competitorPrices = {5.99, 8.99, 25.99, 45.99, 50.00};
		
		boolean result0 = compareAveragePrice(productPrices, competitorPrices);
		
		System.out.println("Are my Product Prices on average greater than my competitors?  " + result0 );
	
		
		
		
		// compares averages of 2 arrays and returns true if the 1st array is greater than the 2nd array 
		
			boolean isHotOutside = false;
			double moneyInPocket = 20.50;
			
			boolean results = willBuyDrink(isHotOutside, moneyInPocket);
			System.out.println("Will I get a drink today?" + results);
				
		//  returns true if it is hot outside and money in pocket is greater than 10.5 

			int carMileage = 251725;
			double bankAccount = 15600.00;
			
			boolean decision =  shouldBuyNewCar(carMileage, bankAccount);
			System.out.println("Is it a good decesion to buy a new car?   " + decision );
				
		//should you buy a new car only if your current car has more than 200,000 miles and you have more than $10,000 in your bank account 
	
	}
	
	///_________________________________________________________METHODS___________________________________________________________________________________________///	
	
		static boolean shouldBuyNewCar(int carMileage, double bankAccount) {
			return carMileage > 200000 && bankAccount > 10000.00;
		}
		
		
	
	
		
	//METHOD   should you buy a new car only if your current car has more than 200,000 miles and you have more than $10,000 in your bank account 
		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
		}
		
		
		
	// METHOD  returns true if it is hot outside and money in pocket is greater than 10.5 	
		
	

	static boolean compareAveragePrice(double[] productPrices, double [] competitorPrices) {
		double averageMine =  calculateAverage(productPrices);
		double averageCompetitor =  calculateAverage(competitorPrices);
		
		return  averageMine > averageCompetitor;
	}

	
	static double calculateAverage(double[] array) {
		if (array.length == 0) {
			return 0.0;
		}
		double sum0 = 0;
		
		for (double value : array ) {
			sum0 += value;
		}
		return sum0 / array.length;
	}

	
// METHOD   compares averages of 2 arrays and returns true if the 1st array is greater than the 2nd array 
	
	static double averagePrice (double[] array) {
		if (array.length == 0) {
			return 0.0;
		}
		
			double sum5 = 0.0;
		for (double productPrices : array) {
			sum5 += productPrices;
		}
		return sum5/ array.length;
	}
	
//METHOD  takes an array of double and returns the average of all the elements in the array
	
	static boolean greaterThan100(int[] array) {
		int sum4 = 0;
		for(int num : array) {
			sum4 += num;
		}
		return sum4 > 100;
	}
// METHOD   takes an array of integers and returns true if the sum of all integers is greater than 100
	
	
	static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
// METHOD write a method that takes firstName and lastName to return a fullName 
	
	static String concatenateWord(String word, int number) {
		StringBuilder result1 = new StringBuilder();
		for (int i = 0; i < number; i++) {
			result1.append(word);
		}
		return result1.toString();
	}
}
	
//METHOD=  concatenate a word to itself a number of times