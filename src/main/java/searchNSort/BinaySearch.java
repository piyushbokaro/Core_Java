package searchNSort;

public class BinaySearch {
	public static void main(String[] args) {
		int a[] = {2, 5, 8, 9, 13, 15, 19};
		int first = 0, mid, last, flag = 0, searchKey = 9;
		last = a.length-1;
		while(first <= last){
			mid = (first+last)/2;
			if(searchKey == a[mid]) {
				flag = 1;
				break;
			} else if(searchKey < a[mid]){
				last = mid - 1;
			} else {
				first = mid + 1;
			}
		}
		if(flag == 1){
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}
	}
}
