
public class number_1491 {

	 public static double average(int[] salary) {
	        double max=salary[0],min=salary[0] ,sum=0;
	        for (int i = 0; i < salary.length; i++) {
				 sum += salary[i];
				 if(max<salary[i])
				 {
					 max = salary[i];
				 }
				 else if(min>salary[i])
				 {
					 min = salary[i];
				 }
			}
	        return (sum-max-min)/(salary.length-2);
	    }
	public static void main(String[] args) {
	int [] a = {4000,3000,2000,1000};
	System.out.println(average(a));
	}

}
