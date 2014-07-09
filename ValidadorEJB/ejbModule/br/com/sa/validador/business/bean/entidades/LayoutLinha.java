package br.com.sa.validador.business.bean.entidades;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:43
 */
public class LayoutLinha {

	private char delimitador;
	private String nome;
	/**
	 * 1 - Sempre;
	 * 2 - Opcional;
	 * 3 - Condicional
	 */
	private Enum obrigatoriedadeCampo;
	private boolean obrigatorio;
	/**
	 * 1 - Fixo;
	 * 2 - Delimitador;
	 */
	private Enum tipo;
	public Posicao m_Posicao;
	public RegraPosicao m_RegraPosicao;

	public LayoutLinha(){

	}

	/**
	 * 
	 * @exception Throwable Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

}