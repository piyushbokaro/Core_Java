package dataStructure;

class Bubblesort
{
	public static void main(String as[])
	{
		int b[]={15,8,20,11,65,3,1,20,5};
		int a;
		System.out.print("array before sorting is \n");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{
					a=b[j];
					b[j]=b[j+1];
					b[j+1]=a;
				}
			}
		}
		System.out.println("array after sorting is ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
}


