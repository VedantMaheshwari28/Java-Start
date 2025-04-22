public class Eagle extends Bird implements Interfaces.Message{
	public void sendMessage(String message) {
		System.out.println("Eagle Flew away with message tied on his foot contaning "+ message);
	}
	
}