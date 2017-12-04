public class ArrayUtils {
    public static void reverse(int[] arr) {
    	for(let i=0; i<arr.length, i++){
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
    }

    public static void stringifyArray(string[] arr){
    	string v="";
    		for(let i=0; i<arr.length, i++){
    			v=v+ arr[i]
    		}
    	return v;
    }	
}