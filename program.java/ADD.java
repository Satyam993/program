import java.util.Scanner;

public class ADD{
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter the first number :");
	int num1=scanner.nextInt();

	System.out.println("enter the second number :");
	int num2=scanner.nextInt();

	int sum=num1+num2;

	System.out.println("the sum of "+ num1 +" and "+ num2 +" is: "+sum);

	scanner.close();
}
}