package june8;
 class B
 {
	 public void m1() 
	    {
	    	System.out.println("hgghf");
	    }  
 }
public class Fourteen extends B
{
    public void m1() 
    {
    	
    	System.out.println("hiiiii");
    	super.m1();
    }
	public static void main(String[] args) 
	{
		Fourteen f=new Fourteen ();
		f.m1();
	}

}
