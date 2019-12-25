class PromotionToDataTypes
{
	PromotionToDataTypes()
	{

	}
	PromotionToDataTypes(int arg)
	{
		System.out.println("Int arg");
	}
	PromotionToDataTypes(double arg)
	{
		System.out.println("double arg");	
	}
	PromotionToDataTypes(int arg1,double arg2)
	{
		System.out.println("Int-double arg");
	}
	PromotionToDataTypes(double arg1,int arg2)
	{
		System.out.println("double-Int arg");
	}
}
class PromotionToDataTypesDemo 
{
	public static void main(String[] args) 
	{
		new PromotionToDataTypes();
		new PromotionToDataTypes(10);
		new PromotionToDataTypes(10.11);
		new PromotionToDataTypes(10,10.11);
		new PromotionToDataTypes(10.11,10);
		new PromotionToDataTypes(10,10); //reference to PromotionToDataTypes is ambiguous new PromotionToDataTypes(10,10);
		new PromotionToDataTypes('A','B'); //reference to PromotionToDataTypes is ambiguous new PromotionToDataTypes('A','B');
		new PromotionToDataTypes('A');
		new PromotionToDataTypes(10000l);
		new PromotionToDataTypes(3.14f);
	}
}
