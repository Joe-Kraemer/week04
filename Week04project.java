package week04;

public class Week04project {
//	In Eclipse IDE, write the code that accomplishes the objectives listed below and ensures that the code compiles and runs as directed.
//	Comment your code, to prove that you understand what you have written -- this is required!
//	Create a new repository on GitHub for this week's assignments and push your code to the repository.
//	Create a Video showcasing your assignment.
//	Submit the two URL links for the GitHub repo and Video in the Text box.
//	Easy way to Create a video:  Start a meeting in Zoom, share your screen, open Eclipse with the code and your Console window, start recording & record yourself describing and running the program showing the results. When you click "End Meeting" it will save the video on your computer.
//
//	• Create a video, up to five minutes max, showing and explaining how your project works with an emphasis on the portions you contributed.
//
//	• This video should be done using screen share and voice over.  
//
//	• This should then be uploaded to a publicly accessible site, such as YouTube. Ensure the link you share is PUBLIC or UNLISTED!
//
	public static void main(String[]args){
//	Coding Steps
//	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//			
		int[] ages = { 3,9,23,64,2,8,28,93 }; 		//creates array
//	a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
//
	 System.out.println(ages[ages.length - 1] - ages[0]); //prints new result
	 
//	b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//
	 int[] peoplesAges = new int[]{ 3,9,23,64,2,8,28,93,99 }; // creates array

	 System.out.println(peoplesAges[peoplesAges.length - 1] - peoplesAges[0]); //prints new result

//	c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//
	 int sum = 0;		// initializes sum
	 for(int i = 0; i < peoplesAges.length; i++) { //iterates through array
		 sum += peoplesAges[i];			//adds each element in array to sum
	 }
		 System.out.println(sum / peoplesAges.length); //prints out average
	 
	 
//	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//
		 String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; //creates array
		 
		 
		 
//	a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		
		 int sum2 = 0;		// initializes sum
		 for(int i = 0; i < names.length; i++) {		//iterates through array
			 sum2 += names[i].length();		// adds length of each element to sum
		 }
		
	 System.out.println(sum2 / names.length); 		// prints out average
		 
	
//	b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//
	 String sum3 = "";		// initializes sum
	 for(int i = 0; i < names.length; i++) {		//iterates through array
		 sum3 += names[i] + " ";			// adds each element plus a "space" to the array
	 }
	 System.out.println(sum3);	//prints new sum

		 
//	3. How do you access the last element of any array?
		 //		arrayName[arrayName.length - arrayName[i];
//	4. How do you access the first element of any array?
		 //		arrayName[0];

		 
//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//
		 int[] nameLengths = new int[names.length];		//creates new array
		 for(int i = 0; i < names.length; i++) {		//iterates through array
		 nameLengths[i] = names[i].length();		//adds lengths of 1st array to second array
		 }
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//
		 int sum4 = 0;			// initializes sum
		 for(int i = 0; i < nameLengths.length; i++) {		//iterates through array
			sum4 += nameLengths[i];			//adds each element in array to sum
		 } 
		 System.out.println(sum4);		//prints new sum
	
		  //int sum5 = 0;
	}//end of main
	 
	 
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
//
	String word = "cats";
	int n = 7;
	
		public static String wordRepeat(String word, int n) {		//initializes method
		String repeatedWord = word.repeat(n);		//repeats string n amount of times
			return repeatedWord;		// returns new string
		}
	
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//
		public static String nameMaker(String firstName, String lastName) {		//initializes method
			String fullName = firstName + lastName;		//adds string 1 to string 2
			return fullName;							// returns new string
		}
//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//		
		public static boolean isGreater100 (int[] ages) {		//initializes method
			int sum5 = 0;					//initializes sum
			for(int i = 0; i < ages.length; i++) { 			//iterates through array
				sum5 += ages[i];			//adds all array elements to sum
			}if (sum5 > 100) {				// checks if sum is greater than 100
				return true;				// if it is return true
			}else {
				return false;				// if not return false
			}
		}
//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
//
		public static double average(double[] numb) {		//initializes method
			double sum = 0;			//initializes sum
			for(int i = 0; i < numb.length; i++) {		//iterates through array
				sum += numb[i]; 			//adds all array elements to sum
			}
			return sum / numb.length;		//returns average
		}
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//
		public static boolean average(double[] numb, double[] numb2) {		//initializes method
			double sum2 = 0;	//initializes sum2
 			double sum = 0;		//initializes sum
			for(int i = 0; i < numb.length; i++) {		//iterates through array
				sum += numb[i]; 			//adds all array elements to sum
			}
			for(int x = 0; x < numb2.length; x++) {		//iterates through array2
				sum2 += numb2[x]; 		//adds all array2 elements to sum2
		}
			if(sum / numb.length > sum2 / numb2.length) {		//checks question params
				return true;
			}else {												// returns true/false
				return false;
			}
		}
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {		//initializes method
			if(isHotOutside && moneyInPocket > 10.50) {		//checks if both are true
				return true;
			}else {											// returns true/false
				return false;
			}
		}
		
//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
//
//
//  	This method takes in 2 boolean variables (isTired & isHomeWorkDone) to decide if a person will go out tonight. 	
//		I created this method because I was trying to decide if I could go out tonight.
		public static boolean willGoOutTonight(boolean isTired, boolean isHomeWorkDone) { 			//initializes method
			if(!isTired && isHomeWorkDone) {			//checks if isTired is false and isHomeWorkDone is true
				return true;
			}else {										//returns true/false
				return false;
			}
		}
}
