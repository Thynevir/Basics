package basics;

public class StringBuffer {

	public StringBuffer() {
		// Constructor
	}

	public static void main(String[] args) {
		//string buffer and string builder class in java used to create mutable string 
		//StringBuffer thread safe
		//StringBuilder not threads safe
		 StringBuffer sb = new StringBuffer();
	        sb.append("Hello");
	        sb.append(" ");
	        sb.append("world");
	        String message = sb.toString();
	        System.out.println(message);
	        
	    /*
	     * append() method: The append() method concatenates the given argument with this string.
	     * insert() method: The insert() method inserts the given string with this string at the given position.
	     * replace() method: The replace() method replaces the given string from the specified beginIndex and endIndex-1.
	     * delete() method: The delete() method of the StringBuffer class deletes the string from the specified beginIndex to endIndex-1.
	     * reverse() method: The reverse() method of the StringBuilder class reverses the current string. 
	     * capacity() method: The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
           For instance, if your current capacity is 16, it will be (16*2)+2=34.
	     * length() method: The length of a StringBuffer can be found by the length( ) method
	     * charAt() method: This method returns the char value in this sequence at the specified index.
	     * deleteCharAt(): Deletes the character at the index specified by the loc.
	     * ensureCapacity() method: Ensures capacity is at least equal to the given minimum.
	     *  
	     * Constructors of StringBuffer class 

			1. StringBuffer(): It reserves room for 16 characters without reallocation
	
			StringBuffer s = new StringBuffer();
			
			2. StringBuffer( int size): It accepts an integer argument that explicitly sets the size of the buffer. 

			StringBuffer s = new StringBuffer(20);
	     * 
	     * https://www.geeksforgeeks.org/stringbuffer-class-in-java/#
	     */
	 
	}

}
