/*      Write java codes to implement the followings –
        Methods of Stringbuffer class: append(), capacity(), charAt(), delete(), deleteCharAt().;
        ensureCapacity(), getChars(), indexOf(), insert(), length(), setCharAt(), setLength(), substring(),
        toString().     */

public class Problem14 {
    public static void main(String[] args) {
        // Create an object of StringBuffer Class
        StringBuffer sbf = new StringBuffer("Hello World"); 
        System.out.println("\nInitial value of String Buffer : " + sbf);    
        
        // Appending a string using append() method
        sbf.append(" Java Programming");    
        System.out.println("\nAfter appending ' Java Programming' to it, the String Buffer becomes : "+sbf);    
    
        int cap=sbf.capacity();// Finding out the Capacity of StringBuffer    
        System.out.println("\n\nCapacity of String Buffer is : "+cap);    
        
        // Displaying the character at particular index using charAt() method  
        System.out.print("\nCharacter at index 7 : ");
        
        System.out.println(sbf.charAt(6));    
        
        // Deleting the character from StringBuffer using delete() and deleteCharAt() methods
        sbf.delete(5,8);        
        System.out.println("\nAfter deleting characters from 5th position to  8th position : " + sbf);        
        
        // Ensuring the capacity of StringBuffer using ensureCapacity() method
        sbf.ensureCapacity(20);            
        
        // Copying characters from one position to another in StringBuffer using getChars() method
        char c[] = new char[9];            
        sbf.getChars(3, 12, c, 0);                  
        System.out.println("\nCharacters copied are : "+new String(c));            
        
        // Getting the first occurrence of a specified string using indexOf() method
        int indx = sbf.indexOf("World");            
        System.out.println("\nFirst Occurrence of 'World' : "+indx);                        
        
        // Inserting a string into specific location in StringBuffer using insert() method
        sbf.insert(9," Prog.");                          
        System.out.println("\nAfter Insertion : "+sbf);                            
        
        // Setting the character at particular index using setCharAt() method
        sbf.setCharAt(7,'!');                            
        System.out.println("\nAfter setting Character at Index 7 : "+sbf);                                         
        
        // Creating subsequence of StringBuffer using substring() method
        System.out.println("\nSubstring starting from index 10 till end :"+sbf.substring(10));      
        
        // Creating a new StringBuffer Object by converting existing StringBuffer object to String using toString() method
        // Creating a new StringBuffer Object by converting existing StringBuffer object to String using toString
        // Creating subsequence of StringBuffer with specified length using substring() method
        System.out.println("\nSubstring starting from index 4 with length 7: "+sbf.substring(3,10));   
    }
}
