package dataStructure;

class Binarysearch
{
	public static void main(String as[])
	{
		int a=Integer.parseInt(as[0]);
		int b[]={5,8,10,11,15,18,19,20,25};
		int flag=0;
		int first=0,mid=0,last=b.length;
		while(first<=last)
		{
			mid=(first+last)/2;
			if(a<b[mid])
			{
				last=mid-1;
				if(a==b[mid])
				{
					flag++;
					break;    
				}
			}
			else if(a>b[mid])
				first=mid+1;
			else
				last=mid-1;
		}
		if(flag==0)
			System.out.println("Not Found");
		else
			System.out.println("Found "+(flag+1)+" times");
	}
}


