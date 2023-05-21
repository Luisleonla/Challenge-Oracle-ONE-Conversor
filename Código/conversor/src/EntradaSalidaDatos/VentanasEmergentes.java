package EntradaSalidaDatos;

import javax.swing.JOptionPane;

public abstract class VentanasEmergentes {
	
	String[] seleccion = { "Conversor de moneda", "Otro conversor" };
	String tipoDeConversion;
	String conversionEspecifica;
	ValoresTC relacion;
	int opcion;
	
	
	public void setRelacion(ValoresTC relacion) {
		this.relacion = relacion;
	}		
	
	//String tipoDeConversion = (JOptionPane.showInputDialog(null, "Seleccione tipo de conversión", "Conversion",
	//		JOptionPane.QUESTION_MESSAGE, null, seleccion, "Conversor de moneda")).toString();
	public void setTipoDeConversion() {
		this.tipoDeConversion = (JOptionPane.showInputDialog(null, "Seleccione tipo de conversión", "Conversion",
						JOptionPane.QUESTION_MESSAGE, null, seleccion, "Conversor de moneda")).toString();
	}
	
	public String getTipoDeConversion() {
		return tipoDeConversion;
	}

	public void setConversionEspecifica() {
		//relacion = new ValoresTC();
		
		this.conversionEspecifica = (JOptionPane.showInputDialog(null, "Seleccione conversion entre monedas",
				"Conversion", JOptionPane.QUESTION_MESSAGE, null, this.relacion.conversor, "Conversor de moneda")).toString();
	}
	
	public String getConversionEspecifica() {
		return this.conversionEspecifica;
	}
	
	public void setOption() {
		this.opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?", "¿Continuar?", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mensajeFinal() {
		JOptionPane.showMessageDialog(null, "Programa terminado", conversionEspecifica, JOptionPane.QUESTION_MESSAGE);
	}
}
