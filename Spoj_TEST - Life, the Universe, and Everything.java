import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(cin.hasNext())
		{   
			int t= cin.nextInt();
			if(t==42)
				break;
			else
			{
				arr.add(t);
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
}