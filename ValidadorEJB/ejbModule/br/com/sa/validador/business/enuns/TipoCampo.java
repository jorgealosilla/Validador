package br.com.sa.validador.business.enuns;

public enum TipoCampo {
		INTEIRO {
			public String getValue() {
				return "Inteiro";
			}
			public Integer getId(){
				return 1;
			}
		},
		DECIMAL {
			public String getValue() {
				return "Decimal";
			}
			public Integer getId(){
				return 2;
			}
		},
		TEXTO {
			public String getValue() {
				return "Texto";
			}
			public Integer getId(){
				return 3;
			}
		},
		DATA {
			public String getValue() {
				return "Data";
			}
			public Integer getId(){
				return 4;
			}
		},
		TABELA_INTERNA {
			public String getValue() {
				return "Tabela Interna";
			}
			public Integer getId(){
				return 5;
			}
		},
		AGRUPADOR {
			public String getValue() {
				return "Agrupador";
			}
			public Integer getId(){
				return 6;
			}
		};	
		
		public abstract String getValue();
		public abstract Integer getId();
}
