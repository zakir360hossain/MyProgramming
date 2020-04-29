class Pants{
	// private ints/string: brand, waist_size, inSeam
	private int waist_size;
	private int inSeam;
	private String brand;

	// default const

	public Pants(){
		waist_size = 0;
		inSeam = 0;
		brand = ""

	}

	// param const
	public Pants(int waist_size, int inSeam, String brand){
		this.waist_size = waist_size;
		this.inSeam = inSeam;
		this.brand = brand;
	}

	public String toString(){
		return "Brand : "+ brand + " Waist_Size : "+waist_size+ "inSeam : "+inSeam;
	}

	public boolean isEqual(Pants ob){
		return (this.waist_size==ob.waist_size && this.inSeam==ob.inSeam && this.brand.equals(ob.brand));
	}
}