package test;
public class Auto {
	static int cantidadCreados;
	String modelo;
	int precio;
	Asiento[]asientos;
	String marca;
	Motor motor;
	int registro;
	
	int cantidadAsientos() {
		int n;
		for(Asiento a: this.asientos) {
			if (a instanceof Asiento) {
				++n;
			}
		}
		return n;
	}
	
	void verificarIntegridad() {
		x = 0
	}
}
