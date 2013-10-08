import java.io.*;
import java.util.*;

public class StringStuff {

    private String name;

    private String word;

    public StringStuff(){}

    public StringStuff (String name){
	this.name = name;
    }

    public String capitalize (String name){
        String result1 = "";
	String result2 = "";
        result1=name.substring(0,1).toUpperCase() + name.substring(1, name.indexOf(" ") + 1);
	result2=name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase()+name.substring(name.indexOf(" ") + 2);
	return result1 + result2;
    }

    public String bondify (String name){
	String bond = capitalize (name);
	String result1 = "";
	String result2 = "";

	result2=name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2).toUpperCase()+name.substring(name.indexOf(" ") + 2);
	return result2+", "+bond;
    }

    public String PigLatinify(String word){
	String s1 = "";
	if (word.substring(0,1) != "a","e","i","o","u"){
	    if (word.substring(0,2) == "ch", "th", "sh"){
		first =  word.substring(0,2);
		second = word.substring(2);
		return second + first;}
	    if (word.substring(0,2) != "ch", "sh", "th"){
		first = word.substring(0,1);
		second = word.substring(1);
		return second + first;}
	}
	if (word.substring(0,1) == "a","e","i","o","u"){
	    first = word.substring(0,1);
	    second = word.substring(1);
	    return second + first;}
    }
}
