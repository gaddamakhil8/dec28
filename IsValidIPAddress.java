package dec28;

public class IsValidIPAddress {

	public static void main(String[] args) {
		String input = "172.16.254.1.250";
		input = input.replace('.', ' ');
		String[] data = input.split(" ");
		int num =0;
		boolean isValid = false;
		if(data.length !=4) isValid=true;
		
		
		else {
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if( (num <0) ||(num > 255)) {
					isValid = false;
					break;
				}
			}
		}
		if(isValid == false) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("Not a Valid IPv4 Address");
		}
	}

}
