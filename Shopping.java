package mini_project;

public class Shopping 
{
	private String shopname;
	private String ShopAddress;
	
	
	public Shopping(String shopname, String shopAddress) 
	{
		this.shopname = shopname;
		this.ShopAddress = shopAddress;
	}


	public String getShopname() {
		return shopname;
	}	

	public String getShopAddress() {
		return ShopAddress;
	}

	@Override
	public String toString() {
		return "Shopping [shopname=" + shopname + ", ShopAddress=" + ShopAddress + "]";
	}
	
}
