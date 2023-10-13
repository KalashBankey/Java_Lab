interface Calculator{
    public void Add(int x,int y);
    public void Sub(int x,int y);
    public void Mult(int x,int y);
    public void Div(int x,int y);
}
class A implements Calculator{
    public void Add(int x,int y){
        System.out.println("Sum = "+(x+y));
    }
    public void Sub(int x,int y){
        System.out.println("Sub = "+(x-y));
    }
    public void Mult(int x,int y){
        System.out.println("Mult = "+(x*y));
    }
    public void Div(int x,int y){
        System.out.println("Div = "+(x/y));
    }
}
public class Interface3
{
    public static void main(String args[])
    {
        A a1=new A();
        a1.Add(20,5);
        a1.Sub(20,5);
        a1.Mult(20,5);
        a1.Div(20,5);
    }
}