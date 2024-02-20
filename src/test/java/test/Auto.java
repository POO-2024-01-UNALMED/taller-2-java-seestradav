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
		int n = 0;
		for(Asiento a: this.asientos) {
			if (a instanceof Asiento) {
				++n;
			}
		}
		return n;
	}
	
	String verificarIntegridad() {
		for(Asiento a: this.asientos) {
			if (a instanceof Asiento) {
				if(this.registro.equals(this.motor.registro) && this.registro.equals(a.registro)) {
					return "Auto original"
				}
			}
		}
		return "Las piezas no son originales"
	}
}
