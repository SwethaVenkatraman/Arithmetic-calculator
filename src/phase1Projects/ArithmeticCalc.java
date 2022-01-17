package phase1Projects;

import java.util.Scanner;

public class ArithmeticCalc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1=sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("Enter the operator ");
		char O=sc.next().charAt(0);
		int result=0;

		switch(O){
		case '+': 
			result=num1+num2;
		break;
		case '-':
			result=num1-num2;
		break;
		case '*':
			result=num1*num2;
		break;
		case '/':
			result=num1/num2;
		break;
        default:
	          System.out.println("Invalid operator!");
	          break;
		}
		System.out.println("The result is " + result);
	}
}

