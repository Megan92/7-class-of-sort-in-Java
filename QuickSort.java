package 排序;
/*
 * 快速排序：
 * 一趟快速排序的算法是： 　　
 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1； 　　
 * 2）以最后一个数组元素作为关键数据，赋值给key，即 key=A[0]； 　　
 * 3）从j开始向前搜索，即由后开始向前搜索（j=j-1即j--），
 * 找到第一个小于key的值A[j]，A[i]与A[j]交换； 　　
 * 4）从i开始向后搜索，即由前开始向后搜索（i=i+1即i++），
 * 找到第一个大于key的A[i]，A[i]与A[j]交换；
 * 5）重复第3、4、5步，直到 I=J； 
 * (3,4步是在程序中没找到时候j=j-1，i=i+1，直至找到为止。
 * 找到并交换的时候i， j指针位置不变。
 * 另外当i=j这过程一定正好是i+或j-完成的最后令循环结束。） 
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
