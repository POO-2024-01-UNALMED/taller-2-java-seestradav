package test;
public class Auto{
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadcreados;
	int cantidadAsientos() {
		int n;
		for (int i=0;i<asientos.length;i++) {
		if (asientos[i] instanceof Asiento)
			n++;
		}
		return n; 
	}
	String verificarIntegridad(int registro) {
		if (registro==Asiento.registro && registro==Motor.registro) {
			return "Auto original";	 
		}
		return "las piezas no son originales";
	}
}
