public class Coin {
    private String face;
    private int tosses;
    private int heads;
    private double prob = 0.5; // another way to initialize

    public void initCoin(String f, Double p) {
	face = f;
	tosses=0;
	heads=0;
	prob=p;
    }

    public void reset(){
	tosses=0;
	heads=0;
    }


    public Coin() {
	initCoin("Heads",0.5);
    }


    public Coin(String f) {
	initCoin(f,0.5);
    }

    public String getFace() {
	return face;
    }

    public boolean equals(Coin other) {
	return face.equals(other.getFace());
    }

    public void flip (){
	double random=Math.random()+.1;
	if (random >=prob)
	     face="Heads";
		 
	else 
	     face="Tails";
		 
    }
    
}
