package searchNSort;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {7, 5, 19, 0, 8, 13, 21, 1, 6};
		int temp = 0;
		for(int i = 0;i < a.length-1;i++){
			for(int j = 0;j < a.length-i-1;j++){
				if(a[j] > a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
