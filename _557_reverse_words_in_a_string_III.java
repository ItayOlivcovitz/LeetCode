package Algorithm_I;

public class _557_reverse_words_in_a_string_III {
	 public static String reverseWords(String s) {
		 int a = 0 , b = 0 , c = 0;
		 String ret ="";
		 while (b<s.length()) {
			 if(s.charAt(c)== ' ') {
				 for (int j = c - 1; j >= a; j--) {
					ret+=s.charAt(j);
				}
				 ret+=" ";
				 b=c+1;
				 a=b;
				 c++;
			 }
			 else {
				 b++;
			     c++;
			 }
			
			
		}
		 for (int j = c - 1; j >= a; j--) {
				ret+=s.charAt(j);
			}
		 return ret;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a = "Let's take LeetCode contest" ;
    System.out.println(reverseWords(a));
	}

}
