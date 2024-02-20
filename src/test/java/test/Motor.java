package test;
public class Motor{
	int numeroCilindros;
	String tipo;
	int registro;
	void asignarTipo(String tipo) {
		if(tipo=="gasolina") 
				Motor.tipo=tipo;
		else if(tipo=="electrico")
				Motor.tipo=tipo;
		else 
			Motor.tipo= null;
	}
	void cambiarRegistro(int registro) {
		Motor.registro=registro;
	}
}
