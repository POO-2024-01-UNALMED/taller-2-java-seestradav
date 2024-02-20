package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) {
		if ("gasolina".equals(tipo)) {
			this.tipo = tipo;
		}
		if ("electrico".equals(tipo)) {
			this.tipo = tipo;
		}
	}

}
