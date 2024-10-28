class Laptop{
	
      private String Brand;
	  private int RamSize;
	  
	 
	  public String getBrand(){
		  return Brand;
	  }
	  public void setBrand(String Brand){
		  this.Brand=Brand;
	  }
	  public int  getRamSize(){
		  return RamSize;
	  }
	  public void setRamSize(int RamSize){
		  this.RamSize=RamSize;
	  }
	  public void displayLaptopDetails(){
		  System.out.println("Laptop Brand:" + Brand);
		  System.out.println("Laptop RamSize:" + RamSize + "GB");
	  }

	public static void main(String[]args){
		Laptop myLaptop=new Laptop();
		
		myLaptop.setBrand("dell");
		myLaptop.setRamSize(8);
		myLaptop.displayLaptopDetails();
		
	}
}