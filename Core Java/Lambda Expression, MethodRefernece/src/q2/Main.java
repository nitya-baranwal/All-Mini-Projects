package q2;

public class Main{
	
	
	public static void main(String[] args) {
		
		X x1 = s-> Integer.parseInt(s); //LE
		
		int result1 = x1.convertStringToNumber("700") + 500;
		
		System.out.println(result1);
		
		
		
		
		X x2 = new ConvertToInteger()::convertStringToNumber; //MethodReference
		
		int result2 = x2.convertStringToNumber("800");
		
		System.out.println(result2);
	}

}
