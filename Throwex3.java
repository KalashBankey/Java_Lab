public class Throwex3
{
    public static void checkAge(int age)throws ArithmeticException{
        if(age<=18){
            throw new ArithmeticException("\n Access Denied-You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted-you are old enough");
        }
    }
	public static void main(String[] args) {
	    checkAge(15);
		System.out.println("Rest of Code");
	}
}
