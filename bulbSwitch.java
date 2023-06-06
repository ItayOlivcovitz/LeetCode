import java.util.Arrays;


public class bulbSwitch {
	static void print ( int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
 static int bulb(int n) {
	 /*int [] bulb = new int [n];
	 Arrays.fill(bulb, 0);
	 int count = 0 ;
	 */
	 if(n==0)
	 {
		 return 0;
	 }
	 
	/* for (int i = 1; i <= bulb.length; i++) {
		 for (int j = i-1; j < bulb.length; j=j+i) {
			 if(bulb[j] == 1) {
					bulb[j] = 0;
				}
				else
				{
					bulb[j] = 1;
				}
		}
		
	} */
	 
	 
	/* for (int j = 0; j < bulb.length; j++) {
			if(bulb[j]== 1)
				count++;
		}
	 
	 for (int j = 0; j < bulb.length; j++) {
			if(bulb[j]== 1)
				count++;
		}
		 System.out.println(count);
		 print(bulb);
		 */
	 
	 
	 
	 int on= n;
	 int off = 0;
	 for (int i = 2; i <= n; i++) {
		 off =off+on%i;
		 on = n-off;
		 
		
		
	}
	 
	return on;
        
    }

	public static void main(String[] args) {
		
		bulb(4);
	}

}
