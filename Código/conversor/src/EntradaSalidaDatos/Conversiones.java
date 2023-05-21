package EntradaSalidaDatos;

import javax.swing.JOptionPane;

public class Conversiones extends VentanasEmergentes{
	
	String valorEntrada = "";
	double valorEntradaInt;
	double resultadoConversion;
	String resultadoConversionString = "";
	double factor;
	
	public void setValorEntrada() {
		this.valorEntrada = JOptionPane.showInputDialog(null, "Ingresa valor", conversionEspecifica, JOptionPane.QUESTION_MESSAGE);	
		if(ValidarNumero(valorEntrada)) {
		valorEntradaInt = Double.parseDouble(valorEntrada);
		}
	}
	
	
	
	public double getFactor() {
		return factor;
	}



	public void setFactor(double factor) {
		this.factor = factor;
	}



	public void setResultadoConversionDirecta() {
		this.resultadoConversion = factor * valorEntradaInt;
		this.resultadoConversionString = Double.toString(resultadoConversion);
		JOptionPane.showMessageDialog(null, "El valor ingresado es: " + resultadoConversionString, conversionEspecifica, JOptionPane.QUESTION_MESSAGE);
	}
	public void setResultadoConversionInversa() {
		this.resultadoConversion = valorEntradaInt / factor;
		this.resultadoConversion = (double) Math.round(resultadoConversion * 100d) / 100; 
		this.resultadoConversionString = Double.toString(resultadoConversion);
		JOptionPane.showMessageDialog(null, "El valor ingresado es: " + resultadoConversionString, conversionEspecifica, JOptionPane.QUESTION_MESSAGE);
	}
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);
			return true;
		}catch(NumberFormatException e) {
			return false;
		
		}
	}
	
}
