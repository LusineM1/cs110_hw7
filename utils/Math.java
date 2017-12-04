public class Math{
	public static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }

    public static int factorialLoop(int num){
    	for(let i=0; i<num; i++){
    		return num * fact(num - 1);
    	}
    }
		
}