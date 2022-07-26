package packag;
import java.util.Scanner;
public class classdrive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculator calc=new calculator();
		int result;
		//Menu Driven program
		System.out.println("Enter 1. Addition 2 Division 3 Multiply 4 subraction");

		int choice=sc.nextInt();
		switch(choice){
		case 1 :result=calc.addition(a, b);

		System.out.println("sum="+result);
		break;

		case 2 : result=calc.division(a, b);

		System.out.println("Q="+result);
		break;

		case 3:result=calc.multiply(a, b);
		System.out.println("Multiply="+result);

		break;

		case 4 : result=calc.subraction(a, b);
		System.out.println("subraction="+result);

		}
		}
}
