package M.Designprinciples;

public class Methods {
	public float add(float value1,float value2)
	{
		return value1+value2;
	}
	
	public float sub(float value1,float value2)
	{
		return value1-value2;
	}
	
	public float mul(float value1,float value2)
	{
		return value1*value2;
	}
	
	public float div(float value1,float value2) throws Exception 
	{
		if(value2==0) throw new Exception("dividing bt zero");
		{
		
		}
     	return value1/value2;
	}
}

