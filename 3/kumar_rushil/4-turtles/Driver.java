import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Turtle t1,t2,t3;
	t1 = new Turtle();
	t1.speedUp(5);
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getSpeed());
        t2 = new Turtle("David");
	t2.getOlder();
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed());
	t3 = new Turtle("Z", 50, 20);
	t3.speedDown(2);
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getSpeed());
    }
}
