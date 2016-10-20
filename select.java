package DataStructure;
//选择排序，选择第一个数为最小值，依次与其他值比较，若小于当前值则交换位置。
public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsort = {1,63,63,45,25,25,45,13};
        select(unsort);
        for(int k = 0;k<unsort.length;k++){
        	System.out.print(unsort[k]+" ");
        	}
        }
        public static void select(int[] data){
        	int len = data.length;
        
        	for(int i  = 0;i<len;i++){
        		//找出最小元素的下标，每次循环初始下标为第一个数
        		int minindex = i;
        		for(int j = i+1;j<len;j++){
        			if(data[j]<data[i]){
        				minindex = j;
        			}
        		}
        		////将当前第一个元素与它后面序列中的最小的一个 元素交换，也就是将最小的元素放在最前端
        		int temp = data[i];
        		data[i] = data[minindex];
        		data[minindex] = temp;
        		
        	}
        	
        }

}
