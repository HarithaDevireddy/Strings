
/**
Create a method that displays the number of characters, 
lines and words in a text? 
 @author Haritha
 */
public class LinesandWords {

public static void main(String[] args) {
   
String str="Hello how are you? \nI am fine.  ";
String  words[] = str.split("[ ,.]");
String  lines[] = str.split("[\n]");


System.out.println("No of lines = "+lines.length);
System.out.println("No of words = "+words.length);
}

}