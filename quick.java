package sort;
/* 快速排序由于排序效率在同为O(N*logN)的几种排序方法中效率较高，因此经常被采用，
 * 再加上快速排序思想----分治法也确实实用
 * http://hotwater1015.iteye.com/blog/1944520
 该方法的基本思想是（用递归的方法）：
一趟快速排序的算法是： 
1）设置两个变量i、j，排序开始的时候：i=0，j=N-1； 
2）以第一个数组元素作为基准点。 
3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于A[i](此时基准点)的值A[j]，将值与A[j]交换； 
4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于A[j]（此时基准点）的A[i]，将A[j]与A[i]交换； 
5）重复第3步 
6）重复第3、4、5步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[j]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束），到此找到基准点的下标，作为分治下标。 
7重复1-6步骤递归排序前半部分 
8 重复1-6步骤递归排序后半部分 
 */
public class quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsort = {1,63,63,45,25,25,45,13};
		int len = unsort.length;
        quickSort(unsort,0,len-1);
        for(int k = 0;k<unsort.length;k++){
        	System.out.print(unsort[k]+" ");
        	}
        }
	public static void quickSort(int a[], int start, int end) {  
        int i, j;  
        i = start;  
        j = end;  
        if ((a == null) || (a.length == 0))  
            return;  
          
        while (i < j) {//查找基准点下标  
            while (i < j && a[i] <= a[j])  
                // 以数组start下标的数据为key，右侧扫描  
                j--;  
            if (i < j) { // 右侧扫描，找出第一个比key小的，交换位置  
                int temp = a[i];  
                a[i] = a[j];  
                a[j] = temp;  
            }  
            while (i < j && a[i] < a[j])  
                // 左侧扫描（此时a[j]中存储着key值）  
                i++;  
            if (i < j) { // 找出第一个比key大的，交换位置  
                int temp = a[i];  
                a[i] = a[j];  
                a[j] = temp;  
            }  
        }  
        if (i - start > 1) { // 递归调用，把key前面的完成排序  
            quickSort(a, 0, i - 1);  
        }  
        if (end - j > 1) {  
            quickSort(a, j + 1, end); // 递归调用，把key后面的完成排序  
        }  
    }  

}
