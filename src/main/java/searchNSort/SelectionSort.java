package searchNSort;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = {5, 2, 8, 7, 10, 3, 7};
		int temp = 0;
		for(int i = 0;i < a.length-1;i++){
			for(int j = i;j < a.length-1;j++){
				if(a[i] > a[j+1]){
					temp = a[i];
					a[i] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
