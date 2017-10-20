package com.example.interview;

/**
 * @author sureshsubramaniam
 *
 */
/**
 * @author sureshsubramaniam
 *
 */
public class App {

	/**
	 * Method to test Remove all occurrences of char from string using iterator.
	 * @param str
	 * @param x
	 * @return
	 */
	public static String replaceMethod1(String str, char x){
        StringBuilder strBuilder = new StringBuilder();
        char[] rmString = str.toCharArray();
        for(int i=0; i<rmString.length; i++){
            if(rmString[i] != x){
            	 strBuilder.append(rmString[i]);
            } 
        }
        System.out.println("Character to remove in a string Methos 1: " + str + " is " + x + " and Final Answer is  "+ "Replaced String : " + strBuilder);
        return strBuilder.toString();
    }
	
	
	/**
	 * This Method is extra which is not asked in interview question where I dint use StringBuild
	 * @param str
	 * @param x
	 * @return
	 */
	public static String replaceMethod3(String str, char x){
        
        char[] rmString = str.toCharArray();
        int tail=0;
        for(int i=0; i<rmString.length; i++){
            if(rmString[i] != x){
            	rmString[tail]=rmString[i];
            	tail++;
            }
        }
        String retVal = new String(rmString,0,tail);
        System.out.println("Character to remove in a string Methos 1.2: " + str.length() + " is " + x + " and Final Answer is  "+ "Replaced String : " +retVal);
        return retVal;
    }
	

	/**
	 * Method to test Remove all occurrences of char from string using replace String.
	 * 
	 * @param fullString
	 * @param removeChar
	 * @return
	 */
	String replaceMethod2(String str, char x){
		
		String newString = str.replace(Character.toString(x), "");
		System.out.println("Character to remove in a string Method 2: " + str + " is " + x + " and Final Answer is  "+ "Replaced String : " + newString);
		return newString;
	}

}
