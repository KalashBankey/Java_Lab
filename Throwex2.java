public class Throwex2
{
    public static void checkNum(String s){
        if(s==null){
            throw new NullPointerException("\n String is null");
        }
        else {
            System.out.println("else..");
        }
    }
	public static void main(String[] args) {
	    checkNum(null);
		System.out.println("Rest of Code");
	}
}
