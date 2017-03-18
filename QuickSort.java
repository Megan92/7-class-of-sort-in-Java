package ����;
/*
 * ��������
 * һ�˿���������㷨�ǣ� ����
 * 1��������������i��j������ʼ��ʱ��i=0��j=N-1�� ����
 * 2�������һ������Ԫ����Ϊ�ؼ����ݣ���ֵ��key���� key=A[0]�� ����
 * 3����j��ʼ��ǰ���������ɺ�ʼ��ǰ������j=j-1��j--����
 * �ҵ���һ��С��key��ֵA[j]��A[i]��A[j]������ ����
 * 4����i��ʼ�������������ǰ��ʼ���������i=i+1��i++����
 * �ҵ���һ������key��A[i]��A[i]��A[j]������
 * 5���ظ���3��4��5����ֱ�� I=J�� 
 * (3,4�����ڳ�����û�ҵ�ʱ��j=j-1��i=i+1��ֱ���ҵ�Ϊֹ��
 * �ҵ���������ʱ��i�� jָ��λ�ò��䡣
 * ���⵱i=j�����һ��������i+��j-��ɵ������ѭ���������� 
 */
public class QuickSort2{
	public static void sort(int[] data){
		quickSort(data,0,data.length-1);
	}

	private static void quickSort(int[] data, int i, int j) {
		// TODO Auto-generated method stub
		int random = (i+j)/2;
		SortTest.swap(data, random, j);
		
		int q = partition(data,i-1,j,data[j]);
		SortTest.swap(data, q, j);
		
		if(i<q-1){
			quickSort(data,i,q-1);
		}
		if(q+1<j){
			quickSort(data,q+1,j);
		}
	}

	private static int partition(int[] data, int i, int j, int key) {
		// TODO Auto-generated method stub
		while(i<j){
			while(data[++i]<key);
			while((j>0) && data[--j]>key);
			SortTest.swap(data, i, j);
		}
		SortTest.swap(data, i, j);
		return i;
	}
}
