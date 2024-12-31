package dec28;

public class IsValidIPAddressv2 {

	public static void main(String[] args) {
String input="172.001.154.1";		
		String[] data = getArrayEle(input);
		int num =0;
		boolean isValid = false;
		if(data.length ==4)
		{
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if( (num >=0) &&(num <= 255)) {
					isValid = true;
				}
				else {
					isValid = false;
					break;
				}
			}
		}
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("Not a Valid IPv4 Address");
		}
	}

	private static String[] getArrayEle(String input) {
		
		char[] chars = input.toCharArray();
		String word = "";
		String[] splWords = new String[30];
		int index=0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i]== '.') {
				splWords[index++] = word;
				word = "";
			}
			else {
				word = word + chars[i];
			}
		}
		if(word.length() > 0) {
			splWords[index] = word;
		}
		
		index++;
		String[] resWords = new String[index];
		for(int i=0;i<index;i++) {
			resWords[i] = splWords[i];
		}
		
		return resWords;

	}

}
