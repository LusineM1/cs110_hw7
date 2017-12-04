import utils.Math;
import utils.ArrayUtils;
import animals.Puppy;
public class Driver{
	public static void main(string[] args){
		 Puppy Joey=new Puppy("Joey");
		 System.out.println(Joey.getName());
		 Puppy Chandler=new Puppy("Chandler");
		 System.out.println(Chandler.getName()); 
	     Puppy Ross=new Puppy("Ross");
	     System.out.println(Ross.getName());
	}


int[] arr = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(arr);
		System.out.println(ArrayUtils.stringifyArray(arr));

		double fact = 15.4;
		System.out.println(Math.factorial((int)fact));
	}
}