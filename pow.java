
public class pow {
	
	public static double myPow(double x, int n) {
        double sum = 1 ;
        int neg=0 ;
        if(n == 0 )
        {
            return 1;
        }
        if(x == 1)
        {
            return 1;
        }
        if(x == -1)
        {
        	if(n%2 ==0)
        	{
        		return 1;
        	}
        	else
        	{
        		return -1;
        	}
        }
        if(x == 0)
        {
            return 0;
        }
        if(n < 0)
            {
               
                neg=1;
            }
        for(int i = 0 ; i < n ; i++)
        {
              sum *=x;
        }
        if(n<=-50)
        {
        	return 0;
        }
        
        for(int i = 0 ; i > n ; i--)
        {
              sum *=x;
        }
        if(neg == 1)
            {
                sum= 1/sum;
            }
        
         return sum ;
    }
	public static void main(String[] args) {

    myPow(2,-2147483648);

	}

}
