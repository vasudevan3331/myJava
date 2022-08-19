package vasu.salem.Projectjava;

public class UnaryTask {
	public static void main(String[] args) {
		Integer pass=50;
		Float fail=30.0F,result=0.0F;
		result=(pass--)*(++fail)/(--pass)+(fail--);
		System.out.println("here is the result  "+result);
		
		Integer pass1=50;
		Double fail1=30.0,result1=0.0;
		result1=(++fail1)+(pass1--)*(--pass1)-(++fail1);
		System.out.println("here is the result1 "+result1);
		
		Short pass11=50;
		Float fail11=30.0F,result2=0.0F;
		result2=(++fail11)+(pass11--)*(--pass11)-(++fail11);
		System.out.println("here is the result1 "+result2);
	}

}
