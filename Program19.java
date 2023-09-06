/*19.Create a program in java to create a class named Light. It contains a variable: On and two methods: switchOn() and switchOff(). 
Inside the Main class, create two objects: led and halogen of the Light class. Then use the objects to call the methods of the class.
led.turnOn() - It sets the On variable to true and prints the output.
halogen.turnOff() - It sets the On variable to false and prints the output.
*/

class Light
{
	boolean on;
	void switchOn()
	{
	on = true;
	System.out.println("LED ON");
	}
	void switchOff()
	{
	on = false;
	System.out.println("HALOGEN OFF");
	}		
}
class Program19
{
	public static void main(String a[])
	{
		Light led=new Light();
		Light halogen=new Light();
		led.switchOn();
		halogen.switchOff();
	}
}