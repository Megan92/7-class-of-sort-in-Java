package ÅÅÐò;

public class HeapSort2 {
	public static void sort(int[] data){
		buildMaxHeap(data);
		for(int i=data.length-1;i>0;i--){
			SortTest.swap(data, i, 0);
			maxHeapify(data,i,0);
		}
	}
	
	private static void buildMaxHeap(int[] data) {
		// TODO Auto-generated method stub
		for(int i = data.length/2-1;i>=0;i--){
			maxHeapify(data,data.length,i);
		}
	}
	
	private static int left(int i){
		return i*2+1;
	}
	
	private static int right(int i){
		return i*2+2;
	}
	
	private static void maxHeapify(int[] data, int heapSize, int i) {
		// TODO Auto-generated method stub
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l<heapSize && data[i]<data[l]){
			largest = l;
		}
		if (r<heapSize && data[largest]<data[r]){
			largest = r;
		}
		if (largest != i){
			SortTest.swap(data, i, largest);
			maxHeapify(data,heapSize,largest);
		}
	}
}
