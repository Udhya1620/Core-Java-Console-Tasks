package interviewQuestionsForPractice;

public class Arrange
{
	public String[] sort(String[] s )
	{
		for(int i=0; i<s.length; i++) {
			for(int j=i; j<s.length; j++)
			{
			if (s[i].compareTo(s[j])> 0)
			{
				
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
			}
		}
		return s;
	}
	
	public int[] sort(int[] s )
	{
		for(int i=0; i<s.length; i++) {
			for(int j=i; j<s.length; j++)
			{
			if (s[i] > (s[j]))
			{
				int temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
			}
		}
		return s;
	}
	
	public static void main(String args[])
	{
		Arrange arrange = new Arrange();
		
		String s1[] = {"zudio","alpha","chess","yield","delete"};
		
		int n1[] = {9,4,8,5,2,1,6};
		
		arrange.sort(s1);
		arrange.sort(n1);
		
		for(int i = 0; i<s1.length; i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
		
		for(int i = 0; i<n1.length; i++)
		{
			System.out.print(n1[i]+" ");
		}
	}
}

