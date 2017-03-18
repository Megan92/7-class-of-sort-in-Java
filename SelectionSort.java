package ≈≈–Ú;

public class SelectionSort {
	public static void sort(int[] data){
		for(int i = 0;i<data.length-1;i++){
			for(int j = i+1;j<data.length;j++){
				if(data[i]>data[j]){
					SortTest.swap(data, i, j);
				}
			}
		}
	}
}
