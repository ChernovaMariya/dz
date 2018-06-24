
public class Main {

	public static void main(String[] args) {
		AssemblyLine eyeglasses = new AssemblyLine();
		 
		ProductCarcase productCarcase = new ProductCarcase("carcase");
		ProductLenses productLenses = new ProductLenses("lenses");
		ProductArches productArches = new ProductArches("arches");
		
		Eyeglasses instalationProducts = new Eyeglasses(productCarcase, productLenses, productArches);
		
		eyeglasses.assembleProduct(instalationProducts);
		System.out.println();

	}

}
