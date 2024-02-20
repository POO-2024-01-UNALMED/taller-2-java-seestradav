package test;
public class Auto{
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadcreados;
	int cantidadAsientos(Asiento[] asientos){
		int n;
		for (int i=0;i<asientos.length; i++){
			p=(asientos[i] instanceof Asiento);
			if (p==true) {
			n++;}
		return n;
	}
	}
	String verificarIntegridad(int registro) {
		if (registro==Asiento.registro && registro==Motor.registro)
			System.out.println("Auto original");	
		else 
			System.out.println("las piezas no son originales");
	}
}
