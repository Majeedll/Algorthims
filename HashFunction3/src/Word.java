
public class Word {
public String theWord ; 
public String defination; 

public int key; 

public Word next; 

public Word (String theWord, String defination) { 
	
	this.theWord = theWord; 
	this.defination=defination; 
}
public String toString(){ 
	
	return theWord + " "+ defination;
	
}

}
