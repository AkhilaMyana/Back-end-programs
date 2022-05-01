package java_oops;

public class LongestSub {

	private static int getLongestSub(int[] array,int len) {
		if(len ==1)
		{
			return 1;
		}
		int a[] = new int[len];
		int longest=0;
		for(int i=0;i<len;i++)
		{
			a[i]=1;
		}
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(array[i]>array[j]&&a[i]<a[j]+1)
				{
					a[i]=a[j]+1;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			if(longest<a[i])
			{
				longest=a[i];
			}
		}
		return longest;
	}
	public static void main(String[] args) {
		int[] array = {2,0,5,3,12,8,17};
		int len=array.length;
		int lenOfSeq=getLongestSub(array,len);
		System.out.println("Length of longest Subsequence:");
		System.out.println(lenOfSeq);
	}

	
}
