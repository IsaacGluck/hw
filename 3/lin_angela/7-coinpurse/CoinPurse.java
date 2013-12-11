public class CoinPurse { 

    private double amount;

    public void addTo(Coin c){
	amount += c.getValue();
    }

    public void removeFrom(Coin c){
       amount -= c.getValue();
    }

    public double getAmount(){
	return amount;
    }







}