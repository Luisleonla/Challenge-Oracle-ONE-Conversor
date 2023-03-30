package EntradaSalidaDatos;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		String cadena = (JOptionPane.showInputDialog(null, "Selecciones tipo de conversión", "Conversion", JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Conversor de moneda", "Otro"}, "Conversor de moneda")).toString();
		JOptionPane.showInputDialog(null, "Ingresa valor", cadena, JOptionPane.QUESTION_MESSAGE);
		
	}
}
