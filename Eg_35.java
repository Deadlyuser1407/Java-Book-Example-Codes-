
public class Eg_35 {
	public static void indexArray2(int[]arr, int size)	{
		int temp;
		for(int i = 0; i<size; i++)	{
			while(arr[i] != -1 && arr[i] != i)	{
				temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {8,-1,6,1,9,3,2,7,4,-1};
		int size = arr.length;
		indexArray2(arr,size);
		printArray(arr,size);
	}

}
