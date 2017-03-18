package ����;
/*
 * �鲢����(merge)��Ҳ�й鲢�㷨��ָ���ǽ������Ѿ���������кϲ���һ�����еĲ����� ����
 * ����������{6��202��100��301��38��8��1} ����
 * ��ʼ״̬�� [6] [202] [100] [301] [38] [8] [1] �Ƚϴ��� ����
 * i=1 [6 202 ] [ 100 301] [ 8 38] [ 1 ]��3 ����
 * i=2 [ 6 100 202 301 ] [ 1 8 38 ]��4 ����
 * i=3��[ 1 6 8 38 100 202 301 ] 4 
 */
public class MergeSort {
	public static void sort(int[] data){
		int[] tmp = new int[data.length];
		mergeSort(data,tmp,0,data.length-1);
	}

	private static void mergeSort(int[] data, int[] tmp, int start, int end) {
		// TODO Auto-generated method stub
		int mid = (start+end)/2;
		if (start == end)
			return;
		mergeSort(data,tmp,start,mid);
		mergeSort(data,tmp,mid+1,end);
		
		for(int i = start;i<=end;i++){
			tmp[i] = data[i];
		}
		int i1 = start;
		int i2 = mid+1;
		for(int i = start;i<=end;i++){
			if(i1 == mid+1)
				data[i] = tmp[i2++];
			else if(i2 >end)
				data[i] = tmp[i1++];
			else if(tmp[i1]<tmp[i2])
				data[i] = tmp[i1++];
			else
				data[i] = tmp[i2++];
		}
	}
}
