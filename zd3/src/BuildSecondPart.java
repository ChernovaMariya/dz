
public class BuildSecondPart implements ILineStep{

	@Override
	public IProductPart buildProductPart(){
		System.out.println("линзы созданы");
		return new ProductLenses("линзы");
	}
}
