class PalindromNumber{
	public static void main(String[] agrs){
		int number = 123454678,rev=0,rem;
		int temp = number;

		while(number>nmuber){
			rem = number%10;
			rev = (rev*10)+rem;
			number = number /10;

		}
		System.out.println(rev);

		
		if(temp == number){
			System.out.println("Number Are Palindrom");

		}
		else{
			System.out.println("Number Not Palindrom");
		}

	}
}	
