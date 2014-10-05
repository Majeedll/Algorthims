
public class LinkListApp {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList theList = new LinkedList(); // make new list
		theList.insertFirst(22, 2.99); // insert four items
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		//theList.insertFirst(99, 10.99);
		theList.displayList(); // display list
		 
		while( !theList.isEmpty() ) // until it’s empty,
				{
				
			//	boolean aLink = theList.findLength(); // delete link
				
				 Link aLink = theList.swap();
			System.out.println("" + aLink.toString());
				
				
		
			
					
					
				
			//if(theList.findLength()) {
					
				//   System.out.println("Even number");
		     //  }else{
		        //    System.out.println("Odd number");
		       // }
		 
		
		
		
		
		//while( !theList.isEmpty() ) // until it’s empty,
		//{
		
		//Link aLink = theList.isCycle(); // delete link
		
		//System.out.println("LinkedList"+ theList);
		
		//if(theList.isCycle()) {
		//   System.out.println("Linked List is cyclic as it contains cycles or loop");
      // }else{
       //     System.out.println("LinkedList is not cyclic, no loop or cycle found");
       // }
		
		
		
		//System.out.print("reversed"); // display it
		//}
		//aLink.displayLink();
		//System.out.print("");
		}
		 // display list


	}
}
		 // end main()
