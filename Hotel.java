package mini_project;

public class Hotel 
{
	private String name;
    private String address;
    private double pricePerNight;

    public Hotel(String name, String address, double pricePerNight) {
        this.name = name;
        this.address = address;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", address=" + address + ", pricePerNight=" + pricePerNight + "]";
	}
    

}
