import java.util.*;

public class WordSearch {
    private char[][] board;

    public WordSearch(int rows, int cols) {
	board = new char[rows][cols];
	for (int i=0;i<rows;i++) {
	    for (int j=0;j<cols;j++) {
		board[i][j]='-';
	    }
	}

    }

    public WordSearch() {
	this(20,20);
    }

    public String toString() {
	String s="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j];
	    }
	    s=s+"\n";
	}
	return s;
    }

    public boolean addWordH ( int row , int col , String word ) {
	if ( col + word.length() - 1 > board [ row ].length || row > board.length || row < 1 || col < 1 )
	    return false;
	else {
	    int i = col;
	    int index = 0;
	    while ( i < col + word.length() ) {
		board [ row - 1 ] [ i - 1 ] = word.charAt ( index );
		i = i + 1;
		index = index + 1;
		}
	    return true;
	}
    }

}
