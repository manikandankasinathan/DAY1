package Day1;

public class reverse {

	public static void main(String args[])
	{
		String str="maniknadan";
		char[] strArray = str.toCharArray();
		for(int i=strArray.length-1;i >=0;i--)
		{
			System.out.print(strArray[i]);
		}
		
	}

}
