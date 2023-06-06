package Algorithm_I;

import java.util.Scanner;

public class _278_first_bad_version {
	//Scanner sc= new Scanner(System.in);
	private static boolean isBadVersion(long bad) {
		if(bad<1702766719)
		return false;
		return true;
	}
	 public static int firstBadVersion(int n) {
	        long start = 1 , end = n;
	        long mid = 0 ;
	        long lastWasBad = -1;
			  while(start <= end) {
				  mid = ( end + start )/2;
				  if(!isBadVersion(mid)) {
					  System.out.println("version"+ mid +"is bad:"+isBadVersion(mid));
					  start = mid+1 ;
					  lastWasBad=1;
				  }
				  else if(isBadVersion(mid)) {
					  System.out.println("version"+ mid +"is bad:"+isBadVersion(mid));
					  end = mid-1 ;
					  lastWasBad=0;
				  }
			  }
			  			
			  if(lastWasBad==1) {
				  System.out.println("return "+ (mid+1) );
				  return (int)(mid+1);
			  }
			  System.out.println("return "+ mid);
			  return (int)mid ;
			  
			  
			  
	    }

	

	public static void main(String[] args) {
		firstBadVersion(2126753390);
		

	}

}
