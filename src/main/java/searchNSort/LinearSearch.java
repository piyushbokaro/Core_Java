package searchNSort;

public class LinearSearch {
	public static void main(String[] args) {
		int x = 4, flag = 0;
		int a[] = {5, 7, 10, 4, 1};
		for(int i = 0;i < a.length;i++){
			if(x == a[i]){
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Element " + x + " Found");
		} else {
			System.out.println("Element " + x + " Not Found");
		}
	}

}
