package myAirtelPackage;

public class Airtel {
	private Service serviceobj;

	public Airtel(Service serviceobj) {
		
		this.serviceobj = serviceobj;
	}

	public void calltheservice() {
		serviceobj.theTypeOfservice();
	}

}
