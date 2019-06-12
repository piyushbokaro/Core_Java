package beginners;

public class WordReversal {
	public static void main(String[] args) {
		String str = "Java World";
		String strArray[] = str.split(" ");
		StringBuilder strBuilder = new StringBuilder();
		for(int i = strArray.length;i >0;i--){
			strBuilder.append(strArray[i-1]);
			strBuilder.append(" ");
		}
		System.out.println(strBuilder);
	}
}
