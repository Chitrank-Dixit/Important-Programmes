class Var
{
	void perform(int a[])
	{
		System.out.println("Begin..... ");
		for(int b:a)
			System.out.println(b);
	
	}

}
class OneDVar1
{
	public static void main(String args[])
	{
		int ar[]={33,46,23,10};
		int ar1[]={65,69,7,9};
		Var v=new Var();
		v.perform(ar);
		v.perform(ar1);
	
	
	
	}


}