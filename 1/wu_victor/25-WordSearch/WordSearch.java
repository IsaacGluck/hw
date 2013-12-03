import java.util.*;
public class WordSearch {

    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) 
	    for (int j=0;j<cols;j++) 
		board[i][j]='-';
    }

    public WordSearch() {
	this(20,20);
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
    
    public boolean insertWordH (int rows, int cols, String s) {
	if (board[rows][cols].equals("-")) {
	    for (int i = 0; i < s.length(); i++) {
		if (board[rows+i][cols].equals("-")) {
		    board[rows+i][cols] = s.charAt(i);
		}
	    }
	    return true;
	}
	return false;
    }
}
