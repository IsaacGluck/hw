public class Driver{
    public static void main(String[] args){
	Greeter g,g2;
	String result;
	g=new Greeter();
	g.setGreeting("sup");
	g2=new Greeter();
        g2. setGreeting("How are you doing");
	result=g.greet("Fred");
	System.out.println(result);
        result=g2.greet("Sarah");
        System.out.println(result);
    }
}

