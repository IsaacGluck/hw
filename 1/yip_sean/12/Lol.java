public class Lol {
	public String multiply_String(String s, int x) {
		return null;
	}
	
	public String diag(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {result += " ";}
			result += "*\n";
		}
		
		return result;
	}
	
	public String diagWord(String s) {
		String result = "";
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j < i; j++) {result += " ";}
			result += s.charAt(i - 1) + "\n";
		}
		
		return result;
	}
	
	public String fence(int h, int w) {
		String result = "";
		for (int i = 1; i <= h; i++) {
			if ((i == 1) || (i == h)) {
				result += "+";
				for (int j = 1; j <= w; j++) {result += "-";}
				result += "+\n";
			}
			else {
				result += "-";
				for (int j = 1; j <= w; j++) {result += " ";}
				result += "-\n";
			}
		}
	}
}
