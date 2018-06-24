
public class Eyeglasses implements IProduct{

	IProductPart carcase;
	IProductPart lenses;
	IProductPart arches;
	
	Eyeglasses(ProductCarcase carcase, ProductLenses lenses, ProductArches arches){
		this.carcase = carcase;
		this.lenses = lenses;
		this.arches = arches;
		
	}
	@Override
	public void installFirstPart(IProductPart productPart) {
		System.out.println("Корпус установлен");
		
	}

	@Override
	public void installSecondPart(IProductPart productPart) {
		System.out.println("Линзы установлены");
		
	}

	@Override
	public void installThirdPart(IProductPart productPart) {
		System.out.println("Дужки установлены");
		
	}

}
