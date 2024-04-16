/*  Write java codes to implement the followings –
    Basic string handling concepts- Concept of mutable and immutable string, Methods of String
    class-charAt(), compareTo(), equals(), equalsIgnoreCase(), indexOf(), length() , substring().;
    toCharArray(), toLowerCase(), toString(), toUpperCase() , trim() , valueOf() methods.   */

public class Problem13 {
    public static void main(String[] args) {
        // Immutable String
        String str = "Hello World";
        System.out.println("Original String : "+str);
        
        char c = str.charAt(5);
        System.out.println("\nCharacter at Index 5 : "+c);
        
        int result = str.compareTo("Hello");
        System.out.println("\nCompare \"Hello\" with Original String : "+result);
        
        boolean b1 = str.equals("Hello World");
        System.out.println("\nCheck if \"Hello World\" is equal to Original String : "+b1);
        
        boolean b2 = str.equalsIgnoreCase("hello world");
        System.out.println("\nCheck if \"Hello World\" is equal to Original String (case insensitive) : "+b2);
        
        int index = str.indexOf('o');
        System.out.println("\nIndex of 'o' in Original String : "+index);
        
        int len = str.length();
        System.out.println("\nLength of Original String : "+len);
        
        String subStr = str.substring(6);
        System.out.println("\nSubstring from Index 6 till end : "+subStr);
        
        char[] arr = str.toCharArray();
        System.out.print("\nCharacters in Array : ");
        for(int i=0 ;i<arr.length ;i++)System.out.print(arr[i]+" ");
        
        String lower = str.toLowerCase();
        System.out.println("\nConverted Lower Case String : "+lower);
        
        String upper = str.toUpperCase();
        System.out.println("\nConverted Upper Case String : "+upper);
        
        String trimex = str.trim();
        System.out.println("\nTrimmed String : "+trimex);
    }
}
