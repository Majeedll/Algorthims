
public class linklistApp {

	
	static int s=count(null);
	public static void main(String[] args) {
	
		node theList = new node(6);
		theList.next= new node(5);
		theList.next.next= new node(4);
		theList.next.next.next= new node(3);
		theList.next.next.next.next= new node(2);
		theList.next.next.next.next.next= new node(1);
		
		System.out.println("Original Linked List: " + theList.toString());
		
		theList = reverseList(theList);
        System.out.println("Reverse List: "
                + theList.toString());
       System.out.println("size: "+s);

      theList= findMiddle(theList);
      System.out.println("Mid: " );
      
      theList= traverseListRecursive(theList);
      
       
	     
	}	
		
	
	public static node traverseListRecursive(node headNode) {
		if(headNode == null) return null; // base case
		else{
		traverseListRecursive(headNode.next);
	    System.out.print("| "+headNode+" | ");

		}
		return headNode;
		}
	
	public  static node findMiddle (node head) 
	{
		
	    node fast; 
		node slow; 
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
	
	
	public static int count(node head) { 
		
		
		int count = 0;
		node current = head;
		while (current != null) { 
			current=current.next;
	    count++;
		     }
			return count;
		     }
 

	public static node reverseList (node head)
	{
		 if (head == null || head.next == null) {
	         return head;
	     }
	 node prev= null;
	 node nextNode = null; 
	 node current= head;
     
	 
	 while (current !=null) 
	 {
		nextNode= current.next; 
		current.next=prev; 
		prev=current;
		current=nextNode;

	 }
	  return prev;
	}

	 }
class node {

	public int iData; 
	public node next; 
	//public node first; 
	//public node head;
	
	public node ( int iData){
		
		this.iData=iData;
		this.next=null;
	}
	
	
	
	
	public String toString() {
		 
	    String data = "";
	    node current = this;
	    do {
	        data += current.iData + ",";
	        current = current.next;
	    } while (current != null);

	    return data;
	}
	
}
  
	
	

