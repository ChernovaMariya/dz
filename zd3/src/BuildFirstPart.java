
class BuildFirstPart implements ILineStep{

	@Override
	public IProductPart buildProductPart() {
		System.out.println("корпус создан");
		return new ProductCarcase("корпус");
	}
}
