public class GenericsEx2
{
    public <E> void printArray(E s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
	public static void main(String[] args) {
	    GenericsEx2 g=new GenericsEx2();
	    String s[]=new String[]{"Hello","World"};
	    g.<String>printArray(s);
	    Integer i[]={1,2,3,4};
	    g.<Integer>printArray(i);
	}
}
