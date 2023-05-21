package EntradaSalidaDatos;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		/*
		 * - Convertir de la moneda de tu país a Dólar - Convertir de la moneda de tu
		 * país a Euros - Convertir de la moneda de tu país a Libras Esterlinas -
		 * Convertir de la moneda de tu país a Yen Japonés - Convertir de la moneda de
		 * tu país a Won sul-coreano
		 */

		/*
		 * - Convertir de Dólar a la moneda de tu país - Convertir de Euros a la moneda
		 * de tu país - Convertir de Libras Esterlinas a la moneda de tu país -
		 * Convertir de Yen Japonés a la moneda de tu país - Convertir de Won
		 * sul-coreano a la moneda de tu país
		 */
		boolean continuar = true;

		while (continuar) {
			Conversiones conv = new Conversiones();
			conv.setTipoDeConversion();
			if (conv.tipoDeConversion.toString() == "Conversor de moneda") {
				ValoresTC vTC = new ValoresTC();
				conv.setRelacion(vTC);
				conv.setConversionEspecifica();
				conv.setValorEntrada();
				// String opciones = conv.getConversionEspecifica();

				
					switch (conv.getConversionEspecifica()) {
					case "Conversor MXN - USD", "Conversor USD - MXN":
						conv.setFactor(vTC.getUsd());
						break;

					case "Conversor MXN - EUR", "Conversor EUR - MXN":
						conv.setFactor(vTC.getEur());
						break;
					case "Conversor MXN - GBP", "Conversor GBP - MXN":
						conv.setFactor(vTC.getGbp());
						break;
					case "Conversor MXN - JPY", "Conversor JPY - MXN":
						conv.setFactor(vTC.getJpy());
						break;
					case "Conversor MXN - KRW", "Conversor KRW - MXN":
						conv.setFactor(vTC.getJpy());
						break;
					}
					if (Arrays.asList(vTC.conversorDirecto).contains(conv.getConversionEspecifica())) {
						conv.setResultadoConversionDirecta();
					} else {
						conv.setResultadoConversionInversa();
					}
					conv.setOption();
					if (conv.opcion == 1) {
						continuar = false;
						conv.mensajeFinal();
					}
			}
			if (conv.tipoDeConversion.toString() == "Otro conversor") {
					System.out.println("Otro conversor");
					
			}
		}
	}
}
