package test;
public class Motor{
	int numeroCilindros;
	String tipo;
	int registro;
	void asignarTipo(String tipo) {
		if(tipo=="gasolina") { 
			this.tipo=tipo;
		}
		else if(tipo=="electrico") {
			this.tipo=tipo;
		}
	}
	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
}
