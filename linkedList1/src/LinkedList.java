
public class LinkedList {

	private Link first; 
	public Link head;
	public LinkedList () 
	{
		first=null;
	}


  public  Boolean isEmpty () 
  {
    return (first==null);
  }
  
  public void insertFirst(int id, double dd)
  { // make new link
  Link newLink = new Link(id, dd);
  newLink.next = first; // newLink --> old first
  first = newLink; // first --> newLink
  }

  public Link deleteFirst() // delete first item
  { // (assumes list not empty)
  Link temp = first; // save reference to link
  first = first.next; // delete it: first-->old next
  return temp; // return deleted link
  }
  public Link nfromlast(int n)
  {
      int i;
      Link current = first;
      for (i=0;i<n;i++)
      {
          if(current != null)
          {
              current = current.next;
          }
          else
          {
              return null;
          }
      }
      Link behind = first;
      while (current != null)
      {
          current = current.next;
          behind = behind.next;
      }
      return behind;
  }
  
  public  boolean  findLength( ) 
  {
	  Link fast = first;
      //Link slow = head;
     
      while(fast!= null && fast.next != null){
          fast = fast.next.next;
        //  slow = slow.next;
         
          //if fast and slow pointers are meeting then LinkedList is cyclic
          if(fast == null ){
              return true;
          }
      }
      return false;
  }
  
 /* public boolean  isCycle( ) 
   {
	   Link fast = head;
       Link slow = head;
      
       while(fast!= null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
          
           //if fast and slow pointers are meeting then LinkedList is cyclic
           if(fast == slow ){
               return true;
           }
       }
       return false;



}  */   
   /*public Link reverseList()
{
	  System.out.print("ReverseList: ");
	if (head == null || head.next == null)
		return first;  //empty or just one node in list

		Link Second = head.next;

		//store third node before we change 
		Link Third = Second.next;  

		//Second's next pointer
		Second.next = head;  //second now points to head
		head.next = null;  //change head pointer to NULL

		//only two nodes, which we already reversed
		if (Third == null)
		return Third;  

		Link CurrentNode = Third;

		Link PreviousNode = Second;

		while (CurrentNode != null)
		{ 
		Link NextNode = CurrentNode.next;

		CurrentNode.next = PreviousNode;

		/*  repeat the process, but have to reset
		     the PreviousNode and CurrentNode
		

		PreviousNode = CurrentNode;
		CurrentNode = NextNode;  
		System.out.println("");
		}

		return head  = PreviousNode;
	
		}*/
  public  Link swap() {
	    Link buffer = null;
	    Link newRoot = null;
	    while (first != null && first.next != null) {
	        if (buffer != null) {
	            buffer.next.next = first.next;
	        }
	 
	        buffer = first.next;
	        first.next = first.next.next;
	        buffer.next = first;
	        if (newRoot == null)
	            newRoot = buffer;
	        first = first.next;
	    }
	    return newRoot;
	} 
  
  
  
public Link reverseList ()
{
	
 Link prev= null; 
 Link nextNode = null; 
 Link current= first;
 while (current !=null) 
 {
	nextNode= current.next; 
	current.next=prev; 
	prev=current;
	current=nextNode;

 }

 return prev;
	 
}

public Link findMiddle (Link head) 
{
	
    Link fast; 
	Link slow; 
	fast= head; 
	slow=head;
	int i=0;
	while(fast.next.next!=null) {
		
		if(i==0) {
			fast=fast.next.next;
			i=1; 
		}
		else if(i==1) { 
			fast=fast.next.next;
			slow=slow.next;
			i=0;
		}
		
	}
	
	return slow;
}
   
  public void displayList()
  {
  System.out.print("List (first-->last): ");
  Link current = first; // start at beginning of list
  while(current != null) // until end of list,
  {
  current.displayLink(); // print data
	
  current = current.next; // move to next link
  }
  System.out.println("");
  }
  // -------------------------------------------------------------
  
  }