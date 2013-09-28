import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    public Turtle () {
	name = "Mike";
	age = 10;
	speed = 50;
    }
   
    public Turtle (String z, int i, int b) {
	name = z;
	age = i;
	speed = b;
    }

    public Turtle (String z) {
	name = z;
	age = 10;
	speed = 20;
    }

    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age = age + 1;
    }

    public int getspeed () {
	return speed;
    }
    
    public String getname () {
	return name;
    }

    public int getage () {
	return age;
    }
}
	