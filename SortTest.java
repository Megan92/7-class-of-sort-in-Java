package 排序;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7,1,4,3,5};
		System.out.println("排序前："+Arrays.toString(arr));
//		//冒泡排序
//		BubbleSort.sort(arr);
//		//快速排序
//		QuickSort.sort(arr);
//		//快速排序2
//		QuickSort2.sort(arr);
//		//插入排序
//		InsertSort.sort(arr);
//		//选择排序
//		SelectionSort.sort(arr);
//		//希尔排序
//		ShellSort.sort(arr);
//		//堆排序
//		HeapSort.sort(arr);
//		//堆排序2
//		HeapSort2.sort(arr);
		//归并排序
		MergeSort.sort(arr);
		
		System.out.println("排序后："+Arrays.toString(arr));
	}
	
	/*
	 * 交换数组中的两个元素
	 */
	public static void swap(int[] data,int i,int j){
		data[i] = data[i]+data[j]-(data[j]=data[i]);
	}
}
