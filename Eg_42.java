public class Eg_42 {

	public static void minmax(int[]ar,int size) {
		int[] aux=new int[size];
		
	    int start=0;
	    int stop=size-1;
	    for(int i=0;i<size;i++) {
	    	if(i%2==0) {
	    		aux[i]=ar[stop];
	    		stop=stop-1;
	    	}
	    	else {
	    		aux[i]=ar[start];
	    		start=start+1;
	    	}
	    }
	    for(int i=0;i<size;i++) {
			 System.out.print(aux[i]+" ");
		 }
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,2,3,4,5,6,7,8,9};
		minmax(arr, arr.length);
		
	}

}