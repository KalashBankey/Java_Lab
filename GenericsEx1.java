public class GenericsEx1
{
    void printArray(String s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    void printArray(Integer s[]){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
	public static void main(String[] args) {
	    GenericsEx1 g=new GenericsEx1();
	    String s[]=new String[]{"Hello","World"};
	    g.printArray(s);
	    Integer i[]={1,2,3,4};
	    g.printArray(i);
	}
}
