import java.util.ArrayList;
public class Gen5{
	public static void main(String[] args) {
	    Cat rich=new Cat("Richard",19,150);
	    Cat diana=new Cat("Diana",7);
	    Cat isabella=new Cat("Isabella");
	    rich.speak();
	    diana.speak();
	    isabella.speak();
	}
}
class Dog{
    String name;
    int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void speak(){
        System.out.println("I am "+this.name+" and I am "+this.age+" years old");
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    private int add(){
        return this.age+2;
    }
}
class Cat extends Dog{
    private int food;
    public Cat(String name,int age,int food){
        super(name,age);
        this.food=food;
    }
    public Cat(String name,int age){
        super(name,age);
        this.food=50;
    }
    public Cat(String name){
        super(name,0);
        this.food=0;
    }
    public void speak(){
        System.out.println("Meow my name is "+this.name+" and I get fed "+this.food);
    }
    public void eat(int x){
        this.food=x;
    }
}



