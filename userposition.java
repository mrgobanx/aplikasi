package makanan.a;

import makanan.a.userposition;

public class userposition {
	static double latitude;
	static double longitude;
	
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	public void setLatitude(double latitude) {
		userposition.latitude = latitude;
	}
	public void setLongitude(double longitude) {
		userposition.longitude = longitude;
	}
}
