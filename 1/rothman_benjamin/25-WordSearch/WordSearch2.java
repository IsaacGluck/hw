import java.util.*;
public class WordSearch2 {

    private char[][] board;
    private boolean right;
    private boolean ticker;
    private boolean counterRight;
    private boolean counterLeft;
    private boolean work;

    public WordSearch2(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch2() {
	this(20,20);
	//System.out.println (board.length);
	//System.out.println (board [0].length);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean addWordH (int row, int col, String word) {

	ticker = true; //sets it up for the random later
	counterRight = false; //tells if meeting a limit on either end
	counterLeft = false;
	if (row < 0 || col < 0 || row >= board.length || col >= board [row].length)
 {
	return false;
 }

	int length = word.length ();

	Random random = new Random (); //Random generator to determine whether to add to the left or the right


	if (col + length > board [row].length && col - length + 1 < 0) { //checks to see if can't add either way

//if you're at col 3, you can fit in a word of 4 letters. This accounts for the 0 being an element.



	    return false;

	}

	if (col + length > board [row].length) {

	    right = false;
	    ticker = false;
	    counterRight = true;
	}

	if (col - length + 1 < 0) {

	    right = true;
	    ticker = false; //Stops it from setting a random right value later on if we set one
	    counterLeft = true;
	}



	for (int i = 0; i < length; i ++) { //Want to do it separately so you don't add any characters before you know for sure.


	    if (!counterLeft && !counterRight) {
    if (board [row][col + i] != ('-') && board [row][col + i] != word.charAt (i) && board [row] [col - i] != ('-') && board [row] [col - i] != word.charAt (i) )  {

		    return false;

		}
	    }





	
 

	if (!counterLeft && !counterRight && board [row] [col - i] != ('-') && board [row] [col - i] != word.charAt (i) ) {

	    right = true; 
	    ticker = false;
	}


	if (!counterRight && !counterLeft && board [row][col + i] != ('-') && board [row][col + i] != word.charAt (i) ) {

	    right = false;
	    ticker = false;

	}

	if (!counterRight && right && board [row][col + i] != ('-') && board [row][col + i] != word.charAt (i) )
	    {return false;}

	if (!counterLeft && !right && board [row] [col - i] != ('-') && board [row] [col - i] != word.charAt (i) ) {
	    return false;
	}

	}






	if (ticker) {



	if (random.nextInt (2) == 0) { //will add to the right. set right to true.
	    right = true;
	}

	else {

	    right = false;

	}

	}


	if (right) {

	    


	    
	    for (int i = 0; i <length; i++) {

 		board [row] [col + i] =word.charAt (i);

	    }

	}

	else {//if not right
	    
	  


	    for (int i = 0; i < length; i++) {

		board [row] [col - i] = word.charAt (i);

	    }

	}





	return true;
    }





    public boolean addWordVDown (int row, int col, String word) { //Add Word Down

	for (int i = 0; i < word.length (); i ++ ) {

	    try { //If outside of the array, will return false

	    if (board [row + i] [col] != ('-') && board [row + i] [col] != (word.charAt (i) ) ) {
       
		return false;

	    }
	    }
	    catch (Exception e) {
		//	System.out.println (e);
		return false;
		
	    }

	}

	for (int i = 0; i <word.length (); i ++) {

	    board [row + i] [col] = word.charAt (i);
	}



	work = true;

	return true;

    }

    public boolean addWordVUp (int row, int col, String word) {//Add Word Up

	for (int i = 0; i < word.length (); i ++ ) {

	try {

	    if (board [row - i] [col] != ('-') && board [row - i] [col] != word.charAt (i) ) {

		return false;

	    }

	}

	catch (Exception e) {

	    return false;

	}

    }

	for (int i = 0; i < word.length (); i ++) {

	    board [row - i] [col] = word.charAt (i);

	}

	work = true;
	return true;
    }



    public boolean addWordV (int row, int col, String word) {

	Random random2 = new Random ();

	int rand = random2.nextInt (2);

	work = false;

	if (rand == 0) {

	   

	    if (!	addWordVUp (row, col, word) )

	    

	    {
		addWordVDown (row, col, word);

	    }

	    else {
		addWordVUp (row, col, word);

	}

	}

	else {

	    if (!		addWordVDown (row, col, word) ) {



	    

		addWordVUp (row, col, word);

	    }

	    else {

		addWordVDown (row, col, word);

	    }

	}

  

    
		
       

        if (!work) {
	    return false;
	}

	return true;

    }


}
