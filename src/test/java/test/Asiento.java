package test;
public class Asiento {
	String color;
	int precio;
	int registro;
   void cambiarColor(String color) {
        String[] valoresPermitidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
        boolean esColorPermitido = false;

        for (String valor : valoresPermitidos) {
            if (color.equals(valor)) {
                esColorPermitido = true;
                break;
            }
        }

        if (esColorPermitido) {
            this.color = color;
        }
    }
}