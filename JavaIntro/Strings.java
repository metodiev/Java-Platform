package test.loops;

public class Strings {

	public static void main(String[] args) {
		String str = "Kiro Miro pesho gosho" ;
		 str = str.toLowerCase();
		//str = str.toUpperCase();
		System.out.println(str);
		String  trimString = str.trim();
		
		System.out.println(trimString);
		String [] splitString = str.split(" ");
		
		for (int i = 0; i < splitString.length; i++) {
			System.out.println(splitString[i]);
		}
		
		for (String string : splitString) {
			System.out.println(string);
		}
		
		String replaceWhiteSpaces = str.replace(" ", "");
		System.out.println(replaceWhiteSpaces);
		
		String specialCharacters = "asdasd \\ asdasd \" asdasd\" asdasd";
		System.out.println(specialCharacters);
		
		int number = 5 ;
		String intToString = String.valueOf(number);
		System.out.println(intToString);
		String stringNumber = "10";
		int strToInt = Integer.parseInt(stringNumber);
		System.out.println(strToInt);
		
		//reverse string 
		
		char [] charArray = {'A', 'a', 'B', 'b'};
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i] +  " Symbol is: " + (int)charArray[i]);
		}
		
		
	}

}
