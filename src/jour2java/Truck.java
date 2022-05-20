package jour2java;

public class Truck extends Vehicule {
private int loadcapacity,noofcontainers;

public Truck(String type, String manifucturer, int id_vehicule, int loadcapacity, int noofcontainers) {
	super(type, manifucturer, id_vehicule);
	this.loadcapacity = loadcapacity;
	this.noofcontainers = noofcontainers;
}

@Override
public String toString() {
	return "Truck [loadcapacity=" + loadcapacity + ", noofcontainers=" + noofcontainers + ", toString()="
			+ super.toString() + "]";
}

public int getLoadcapacity() {
	return loadcapacity;
}

public void setLoadcapacity(int loadcapacity) {
	this.loadcapacity = loadcapacity;
}

public int getNoofcontainers() {
	return noofcontainers;
}

public void setNoofcontainers(int noofcontainers) {
	this.noofcontainers = noofcontainers;
}







}
