package july23;

public class Test12 {

	public static void main(String[] args) {

		int max=5;
		int pre=0;
		int next=1;
		int sum;
		System.out.println("Fibonacci series of" + max + "numbers ::");
		for(int i=1;i<=max;i++)
		{
			System.out.println(pre);
			 sum=pre+next;
			pre=next;
			next=sum;
		}
		//System.out.println("Fibonacci series of" + max + "numbers ::"+next);

	}

}
