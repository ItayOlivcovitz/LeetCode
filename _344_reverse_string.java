package Algorithm_I;

public class _344_reverse_string {
	
	 public static void reverseString(char[] s) {
		 int end = s.length -1;
		 char temp  ;
		 for (int i = 0; i < (s.length/2); i++) {
			if(s[end] != s[i]) {
				 temp = s[i];
					s[i] = s[end];
					s[end] = temp;
					end--;
			}
			end--;
		}
	      temp ='f';
	    }
	public static void main(String[] args) {
		char []a = {'h','a','n','n','a','h'};
		reverseString(a);
	}

}
