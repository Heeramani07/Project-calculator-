package packag;

public class calculator implements maths {

	@Override
	public int addition(int num1, int num2) {
		int result=0;//local variable

		result=num1+num2;
		return result;
	}

	@Override
	public int division(int num1, int num2) {
		int result=0;
		if(num2>0)
		result=num1/num2;

		return result;
	}

	@Override
	public int multiply(int num1, int num2) {
		int result=0;//local variable

		result=num1*num2;
		return result;
	}

	@Override
	public int subraction(int num1, int num2) {
		int result=0;

		result=num1-num2;
		return result;
	}

}
