
class Link
{
public int iData; // data item (key)
public double dData; // data item
public Link next;
	
	public Link (int id, double dd) 
	{
		iData=id; 
	    dData=dd; 
	}
	
	public void displayLink() // display ourself
	{
	System.out.print("{"+ iData + " ,  " + dData + "}");
	}
	 // end class Link
	 @Override
	    public String toString() {
	        return "Link [iData= " + iData + ", nextValue= " + next.iData + "]";
	    }
}
