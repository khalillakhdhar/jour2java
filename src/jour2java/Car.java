package jour2java;

public class Car extends Vehicule {
private int noofdoors,noofpassengers;

public int getNoofdoors() {
	return noofdoors;
}

public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}

public int getNoofpassengers() {
	return noofpassengers;
}

public void setNoofpassengers(int noofpassengers) {
	this.noofpassengers = noofpassengers;
}

public Car(String type, String manifucturer, int id_vehicule, int noofdoors, int noofpassengers) {
	super(type, manifucturer, id_vehicule);
	this.noofdoors = noofdoors;
	this.noofpassengers = noofpassengers;
}

@Override
public String toString() {
	return "Car [noofdoors=" + noofdoors + ", noofpassengers=" + noofpassengers + ", toString()=" + super.toString()
			+ "]";
}
// surcharge










}
