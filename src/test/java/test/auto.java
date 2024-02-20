package test;
public class auto {
String modelo;
int precio;
Asientos[] asientos;
String marca;
motor motor;
int registro;
static int cantidadcreados;
int cantidadAsientos(asientos[] asientos){
	for (int i=0;<asientos.length;i++){
		if (asientos[i] instanceof Asientos)
		cantidadAsientos++};	
}
String verificarIntegridad(int registro) {
	if (registro==Asientos.registro && registro==motor.registro)
		System.out.println("Auto original");	
	else 
		System.out.println("las piezas no son originales");
}
}
