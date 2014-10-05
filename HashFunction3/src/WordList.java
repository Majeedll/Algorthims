
 class WordList {
	// Reference to first Link in list
    // The last Link added to the LinkedList
	 
		    public Word firstWord = null;
		 
	    public void insert(Word newWord, int hashKey) {
	 
	       Word previous = null;
	       Word current = firstWord;
	 
		        newWord.key = hashKey;
	 
	        while (current != null && newWord.key > current.key) {
		 
		            previous = current;
		            current = current.next;
		 
	        }
	 
	        if (previous == null)
	            firstWord = newWord;
	 
        else
		            previous.next = newWord;
		 
		        newWord.next = current;
		 
	    }
	 
	    public void displayWordList() {
	 
	        Word current = firstWord;
	 
		        while (current != null) {
	 
	            System.out.println(current);
	            current = current.next;
	 
        }
	
}
	    public Word find(int hashKey, String wordToFind) {
	   	 
	        Word current = firstWord;

	        // Search for key, but stop searching if
	        // the hashKey < what we are searching for
	        // Because the list is sorted this allows
	       // us to avoid searching the whole list

	        while (current != null && current.key <= hashKey) {

	            // NEW

	            if (current.theWord.equals(wordToFind))
	                return current;

	            current = current.next;

	        }

	        return null;
	   }
	    public void displayWordList1() {
		 	 
 	        Word current = firstWord;
 	 
 	        while (current != null) {
 	 
 	            System.out.println(current);
 	            current = current.next;
 	 
 	        }
 	 
 	    }
	   
 	    }
    
 
