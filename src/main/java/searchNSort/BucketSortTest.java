package searchNSort;

public class BucketSortTest {
	public static void main(String[] args) {
		int[] array = {1,8,1,6,7,5,2,4,9,1,3,5,9,6,4,8,0,7};
		int[] sortedArray = new  BucketSort().sort(array, 0, 9);
		for(int i : sortedArray ){
			System.out.print(i);
		}
	}

}

class BucketSort{
	public int[] sort(int[] array, int minValue, int maxValue){
		int range = maxValue - minValue + 1, k = 0;
		int[] occurence = new int[range];
		int[] sortedArray = new int[array.length];
		for (int valueInArray : array) {
			occurence[valueInArray]++;
		}
		
		for (int i = 0; i < occurence.length; i++) {
			for (int j = 0; j < occurence[i]; j++) {
				sortedArray[k++] = i;
			}
		}
		return sortedArray;
	}
}
