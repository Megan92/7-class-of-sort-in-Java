package ����;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = {2,4,6,7,1,4,3,5};
		System.out.println("����ǰ��"+Arrays.toString(arr));
//		//ð������
//		BubbleSort.sort(arr);
//		//��������
//		QuickSort.sort(arr);
//		//��������2
//		QuickSort2.sort(arr);
//		//��������
//		InsertSort.sort(arr);
//		//ѡ������
//		SelectionSort.sort(arr);
//		//ϣ������
//		ShellSort.sort(arr);
//		//������
//		HeapSort.sort(arr);
//		//������2
//		HeapSort2.sort(arr);
		//�鲢����
		MergeSort.sort(arr);
		
		System.out.println("�����"+Arrays.toString(arr));
	}
	
	/*
	 * ���������е�����Ԫ��
	 */
	public static void swap(int[] data,int i,int j){
		data[i] = data[i]+data[j]-(data[j]=data[i]);
	}
}
