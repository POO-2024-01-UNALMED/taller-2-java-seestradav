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
		  int n = 0;
	        for (Asiento asiento : asientos) {
	            if (asiento instanceof Asiento) {
	                n++;
	            }
	        }
	        return n;
	    }
	String verificarIntegridad(int registro) {
		for (Asiento asiento : asientos) {
            if (asiento instanceof Asiento) {
                if (registro.equals(motor.getRegistro()) && registro.equals(asiento.getRegistro())) {
                    return "Auto original";
                } else {
                    return "Las piezas no son originales";
                }
            }
        }
        return "No se encontraron asientos para verificar la integridad";
    }
}
