import java.io.*;
import java.util.*;

public class Fence{
    private String result;
    public String multiFence(int xcor, int ycor, int x, int y, String[] text){
	result ="";
	int counter = 0;
	for (int i = 0; i <= ycor*y;i++){
	    for (int j = 0; j <= xcor*x; j++){
		if ((i==0&&j==0) || (i==0&&j==xcor*x) || (i==ycor*y&&j==0) || (i==ycor*y&&j==xcor*x))
		    result = result + "+";
		else if (i%y ==0)
		    result = result + "-";
		else if (j%x ==0)
		    result = result + "|";
		else if (j%x ==1 && i%(y/2)==0){
		    result = result + text[counter];
		    j=j+text[counter].length()-1;
		    counter++;
		}
		else
		    result = result + " ";
	    }
	    result = result + "\n";
	}
	return result;
	
    }
    public String singleFence(int x, int y,String text){
        result = "";
        for (int i = 0;i<y;i++){
            for (int j = 0;j<x;j++){
                if (i==0 || i==y-1){
                    if (j==0 || j==x-1){
                        result = result + "+";
                    }
                    else{
                        result = result + "-";
                    }
                }
                else{
                    if (j==0 || j==x-1){
                        result = result + "|";
                    }
                    else{
                        result = result + " ";
                    }
                }
		if (j == 1 && i == (y/2)){
		    result = result + text;
		    j=j + text.length();
		}
            }
            result = result + "\n";
        }
	return result;
    }

}    
    