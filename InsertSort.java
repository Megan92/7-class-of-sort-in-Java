package еепР;

public class InsertSort {
	public static void sort(int[] data){
		for(int i = 1;i<data.length;i++){
			for(int j = i;j>0 && data[j]<data[j-1];j--){
				SortTest.swap(data, j-1, j);
			}
		}
	}
}
