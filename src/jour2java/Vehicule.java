package jour2java;

public class Vehicule {
private String type, manifucturer;
private int id_vehicule;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getManifucturer() {
	return manifucturer;
}
public void setManifucturer(String manifucturer) {
	this.manifucturer = manifucturer;
}
public int getId_vehicule() {
	return id_vehicule;
}
public void setId_vehicule(int id_vehicule) {
	this.id_vehicule = id_vehicule;
}
public Vehicule(String type, String manifucturer, int id_vehicule) {
	super();
	this.type = type;
	this.manifucturer = manifucturer;
	this.id_vehicule = id_vehicule;
}
public Vehicule() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Vehicule [type=" + type + ", manifucturer=" + manifucturer + ", id_vehicule=" + id_vehicule + "]";
}







}
