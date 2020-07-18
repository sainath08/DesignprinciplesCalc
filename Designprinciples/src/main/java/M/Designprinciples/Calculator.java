package M.Designprinciples;

import java.util.Scanner;
public class Calculator {
	
		public static void main(String[] args) throws Exception
		{
		
		Methods op=new Methods();
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter one value ");
		float value1=input.nextFloat();
		
		System.out.println("enter second value ");
		float value2=input.nextFloat();
		
		System.out.println("Select an operation from below");
		System.out.println("1 addition\n2 substraction\n3 multiplication\n4 division\n");
		
		float result=0;
		int operator = input.nextInt();
		if(operator<=4 && operator>=1 ) {
			if(operator==1) 
				result=op.add(value1,value2);
			
			else if(operator==2) 
				result=op.sub(value1,value2);
			
			else if(operator==3) 
			    result=op.mul(value1, value2);
			
			else if(operator==4)
			
				result=op.div(value1,value2);
			
			
		System.out.println("The Result is "+result);
		}
		else
			System.out.println("Invalid Option Entered Please try again ");
		
		}
	}



