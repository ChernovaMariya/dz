public class Main{

	public static void main(String[] args){
		 
		ProductCarcase productCarcase = new ProductCarcase("carcase");
		ProductLenses productLenses = new ProductLenses("lenses");
		ProductArches productArches = new ProductArches("arches");
		
		AssemblyLine assemblyLine = new AssemblyLine(productCarcase, productArches, productLenses);
		Eyeglasses eyeglasses = new Eyeglasses(productCarcase, productLenses, productArches);
		assemblyLine.assembleProduct(eyeglasses);
	}
}
