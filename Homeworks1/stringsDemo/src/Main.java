public class Main{
	public static void main(String[] args) {
		String message="Bugün hava çok güzel.";
		char[] characters=new char[5];
		System.out.println("message");
		System.out.println("Number of elements : "+message.length());
		System.out.println("5th element : "+message.charAt(4));
		System.out.println(message.concat(" Yaşasın!")); //appends to the end
		System.out.println(message.startsWith("B")); //Check if it starts with B
		System.out.println(message.endsWith("."));
		//Start at index 0 of the message array
		//Assign 5 characters to characters array that starting at index 0 of the characters array
		message.getChars(0, 5, characters, 0); 
		System.out.println(characters);
		System.out.println(message.indexOf("a")); //In which index is the letter a first?
		System.out.println(message.lastIndexOf("a")); //In which index is the letter a from the end
		System.out.println(message.replace(" ","-")); //put "-" where there are " "
		System.out.println(message.substring(6)); //Received from 6th index
		System.out.println(message.substring(6,10));  //Received from 6th index to 10th
		
		for(String word: message.split(" ")) { //separated in every " " character
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		message="     Bugün hava çok güzel     ";
		System.out.println(message.trim()); //Used to remove spaces at the beginning and end
	}
}