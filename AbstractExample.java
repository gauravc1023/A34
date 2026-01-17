class AbstractExample{
	public static void main(String [] args){
		ArithematicOperation feature = new Implementation();
		double op = feature.square(5);
		System.out.println(op);
	}
}
abstract class ArithematicOperation{
	public abstract double square(double num);
}
class Implementation extends ArithematicOperation
{
	@Override
	public double square(double num){
	double output = num * num ;
	return output ;
	}		
}