/**
 * 
 */
package br.com.sa.validador.business.enuns;

/**
 * @author JORGE
 *
 */
public enum TipoLayout {
	POSICAO_FIXA {
		public String getValue() {
			return "Posi��o Fixa";
		}
		public Integer getId(){
			return 1;
		}
	},
	DELIMITADOR {
		public String getValue() {
			return "Delimitador";
		}
		public Integer getId(){
			return 2;
		}
	},
	XML {
		public String getValue() {
			return "Xml";
		}
		public Integer getId(){
			return 3;
		}
	};	
	
	public abstract String getValue();
	public abstract Integer getId();
}
