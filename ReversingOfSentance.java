import java.util.ArrayList;
public class ReversingOfSentance{
	private String text;
	private ArrayList <String> Reversed= new ArrayList <String>();
	public  ReversingOfSentance (String text) {
		this.text = text;
	}
	public  ArrayList<String> reverseSentance() {
		Reversed.clear();
		ArrayList <String> Word = new ArrayList <String>();
		for(String S : text.split(" ")) {
			Word.add(S);
		}
		for(int i = Word.size()-1;i>=0;i--) {
			Reversed.add(Word.get(i));
		}
		return Reversed;
	}
	public ArrayList<Character> reverseNormal(){
		ArrayList<Character> reversedChars = new ArrayList<>();
		for(int i=text.length()-1;i>=0;i--) {
			reversedChars.add(text.charAt(i));
		}
		return reversedChars;
	}
	public ArrayList<String> reverseSentanceUpFirst(){
		Reversed.clear();
		ArrayList <String> Word = new ArrayList <String>();
		for(String S : text.split(" ")) {
			Word.add(S);
		}
		for(int j = Word.size()-1;j>=0;j--) {
			Reversed.add(Word.get(j).substring(0,1).toUpperCase()+Word.get(j).substring(1));
		}
		
		return Reversed;
   }
}
