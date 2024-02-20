package test;
public class motor {
int numeroCilindros;
String tipo;
int registro;
void asignarTipo(String tipo) {
	if(tipo=="gasolina") 
			motor.tipo=tipo;
	else if(tipo=="electrico")
			motor.tipo=tipo;
	else 
		motor.tipo= null;
}
void cambiarRegistro(int registro) {
	motor.registro=registro
}
}
