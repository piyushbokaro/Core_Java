package examples;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y = 4;
		int[][] arr = new int[][]{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		/*int[][] arr = new int[][]{
				{1, 2, 3},
				{6, 7, 8},
				{11, 12, 13},
				{16, 17, 18},
				{21, 22, 23}
		};*/
		boolean odd = true, even1 = false, even2 = false;
		
		for(int i = 0;i < x;i++){
			if(odd){
				for(int j = 0;j < y;j++){
					System.out.print(arr[i][j] + ", ");
				}
				odd = false;
				even1 = true;
				continue;
			}
			if(even1) {
				if(!even2){
					/*System.out.println();
					for (int j = 0; j < y-1; j++) {
						System.out.print("  ");
					}*/
				//	System.out.println(arr[i][y-1]);
					System.out.print(arr[i][y-1] + ", ");
					odd = true;
					even2 = true;
					continue;
				} else {
				//	System.out.println();
				//	System.out.println(arr[i][0]);
					System.out.print(arr[i][0]);
					even2 = false;
					odd = true;
					continue;
				}
			}
		}

	}

}
