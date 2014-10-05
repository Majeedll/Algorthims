
public class twoStacks {

	int arraySize; 
	int dataArray []; 
	int topOne; 
	int topTwo;
	
	 twoStacks (int size)
	{
		arraySize= size; 
		dataArray = new int [size]; 
		topOne= -1;
		topTwo=arraySize;
		
	}
	
	
	public void push1 (int x) 
	{
		if ( topOne < topTwo - 1) { 
			
			topOne++; 
			dataArray [topOne]=x;
			
		} else 
		{ 
			System.out.println("StackOverflow");
		}
		}
		
	public void push2 (int x) 
	{
       if ( topOne < topTwo - 1) { 
			
			topTwo--; 
			dataArray [topTwo]=x;
			
		} else 
		{ 
			System.out.println("StackOverflow");
		}
		
	}
	public int  pop1 () 
	{
		if( topOne >=0) {
			int x= dataArray [topOne];
			topOne--;
			return x;
		} else 
			System.out.println("Stack under flow");
		{
			
		}
		return 0;
		
	}
	
	public int pop2 () 
	{
		if(topTwo >=0) 
			   {
         int x = dataArray[topTwo];
		 topTwo++;
		 return x;
	      }
			       else
			       {
			           System.out.println("Stack Under flow");
			           
			       }
		return 0;
			   }
		
	
	
	public static void main(String[] args) {
		
		twoStacks two = new twoStacks (5) ; 
		
		two.push1(5);
	    two.push2(10);
	    two.push2(15);
	    two.push1(11);
	    two.push2(7);
	    System.out.println("Popped element from stack1: "+two.pop1()); 
	    two.push2(40);
	    System.out.println("Popped element from stack2: " + two.pop2());
	   

	}

}
