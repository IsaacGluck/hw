import java.io.*;
import java.util.*;

public class DriverTurtle{
    public static void main(String[] args) {
	Turtle t1, t2, t3, t4;
	String result;
	t1 = new Turtle();
	t2 = new Turtle("Harry");
	t3 = new Turtle("Ron",11,5);
	System.out.println(t1.getName());
	System.out.println("I am " + t1.getAge() + " years old");
	System.out.println("I move at " + t1.getSpeed() + " mph");
	System.out.println(t2.getName());
	System.out.println("I am " + t2.getAge() + " years old");
	System.out.println("I move at " + t2.getSpeed() + " mph");
	System.out.println(t3.getName());
	System.out.println("I am " + t3.getAge() + " years old");
	System.out.println("I move at " + t3.getSpeed() + " mph");
}
}
