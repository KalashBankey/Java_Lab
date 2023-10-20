public class Throwex1
{
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\n Num is negative,cannot calculate square");
        }
        else {
            System.out.println("Square of "+num+" is "+(num*num));
        }
    }
	public static void main(String[] args) {
	    Throwex1 t=new Throwex1();
	    t.checkNum(-3);
		System.out.println("Rest of Code");
	}
}
