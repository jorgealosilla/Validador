package br.com.sa.validador.business.bean.entidades;

/**
 * @author jorge.alosilla
 * @version 1.0
 * @created 30-jun-2014 14:54:43
 */
public class Linha {

	private int sequencia;
	/**
	 * 1 - Cabeçalho;
	 * 2 - Registro;
	 * 3 - Rodapé
	 */
	private Enum tipo;
	public LayoutLinha m_LayoutLinha;

	public Linha(){

	}

	/**
	 * 
	 * @exception Throwable Throwable
	 */
	public void finalize()
	  throws Throwable{

	}

}