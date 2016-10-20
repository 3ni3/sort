package sort;
/*
 * 插入排序
 * 原理就像打扑克时抓牌，抓的牌小就往前插入。
 */
public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsort = {1,63,63,45,25,25,45,13};
        insert(unsort);
        for(int k = 0;k<unsort.length;k++){
        	System.out.print(unsort[k]+" ");
        	}
        }
        public static void insert(int[] data){
        	int len = data.length;
        	
        	for(int j = 1;j<len;j++){//从数组的第二个位置开始遍历值
        		int key = data[j];//当前值的位置
        		int i = j - 1;//指向j前的位置
        		//data[i]比当前值大时，data[i]后移一位,空出i的位置，好让下一次循环的值后移
        		while(i>=0 && data[i] > key){
        			data[i+1] = data[i];//将data[i]值后移
        			i--;	//i前移
        		}//跳出循环(找到要插入的中间位置或已遍历到0下标)
        		data[i+1] = key;		//将当前值插入
        	}
        		
        	
	}

}
