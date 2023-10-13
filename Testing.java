interface Machine{
    public void start();
    public void stop();
}
class WaterPump implements Machine{
    public void start(){
        System.out.println("Starting...");
    }
    public void stop(){
        System.out.println("Stopping...");
    }
}
public class Testing
{
    public static void main(String args[])
    {
        Machine m1 = new WaterPump();
        m1.start();
        m1.stop();
        paint(new WaterPump());
    }
    public static void paint(Machine m)
    {
        m.stop();
        System.out.println("Painting...");
        m.start();
    }
}