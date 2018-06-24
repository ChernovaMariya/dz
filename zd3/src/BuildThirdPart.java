
public class BuildThirdPart implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		System.out.println("дужки созданы");
		return new ProductArches("дужки");
	}
	

}

