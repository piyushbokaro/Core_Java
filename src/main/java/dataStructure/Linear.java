package dataStructure;

class Linear
{
	public static void main(String as[])
	{
		int a=Integer.parseInt(as[0]);
		int b[]={5,8,10,95,3,7,3,};
		int flag=0;
		for(int i=0;i<b.length;i++)
		{
			if(a==b[i])
				flag++;
		}
		if(flag==0)
			System.out.print("Not Found");
		else
		{
			System.out.println("Found "+(flag+1)+" times");
		}
	}
}


