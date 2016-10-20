package DataStructure;
//正宗冒泡法排序，大的数往下沉，小的数往上浮，两两比较

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] unsort = {1,63,63,45,25,25,45,13};
        bubbleSort(unsort);
        for(int k = 0;k<unsort.length;k++){
        	System.out.print(unsort[k]+" ");
        }
        
	}
	
	public static void bubbleSort(int[]data){
		int temp = 0;
		int len = data.length;
		for(int i = 0;i < len-1;i++){//每循环一次，最大的元素沉下去
			for(int j = 0;j < len -1- i;j++){
				if(data[j]>data[j+1]){
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
				
			
		}
	}


