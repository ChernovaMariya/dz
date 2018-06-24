
public class AssemblyLine implements IAssemblyLine{


	@Override
	public IProduct assembleProduct(IProduct iProduct) {
		ProductCarcase carcase = (ProductCarcase) new BuildFirstPart().buildProductPart();
		iProduct.installFirstPart(carcase);
		
		ProductLenses lenses = (ProductLenses) new BuildSecondPart().buildProductPart();
		iProduct.installSecondPart(lenses);
		
		ProductArches arches = (ProductArches) new BuildThirdPart().buildProductPart();
		iProduct.installThirdPart(arches);
		
		Eyeglasses instalation = new Eyeglasses(carcase, lenses, arches);
		System.out.println("Очки собраны");
		return instalation;
	}

}
