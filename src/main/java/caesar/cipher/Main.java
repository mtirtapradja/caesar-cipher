package caesar.cipher;


public class Main {
	public Main() {
		
		String message = "how are you doing today";
		
		int offset = 12;
		
		CaesarCipher caesarCipher = new CaesarCipher();
		
		String cipheredMessage = caesarCipher.cipher(message, offset);
		
		
		System.out.println("Message : " + message);
		System.out.println("Offset : " + offset);
		System.out.println("Ciphered message : " + cipheredMessage);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
