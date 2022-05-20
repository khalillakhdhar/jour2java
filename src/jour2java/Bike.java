package jour2java;

public class Bike extends Vehicule {
private int saddleheight, noofpassenger;

public int getSaddleheight() {
	return saddleheight;
}

public void setSaddleheight(int saddleheight) {
	this.saddleheight = saddleheight;
}

public int getNoofpassenger() {
	return noofpassenger;
}

public void setNoofpassenger(int noofpassenger) {
	this.noofpassenger = noofpassenger;
}

public Bike(String type, String manifucturer, int id_vehicule, int saddleheight, int noofpassenger) {
	super(type, manifucturer, id_vehicule);
	this.saddleheight = saddleheight;
	this.noofpassenger = noofpassenger;
}

@Override
public String toString() {
	return "Bike [saddleheight=" + saddleheight + ", noofpassenger=" + noofpassenger + ", toString()="
			+ super.toString() + "]";
}





}
