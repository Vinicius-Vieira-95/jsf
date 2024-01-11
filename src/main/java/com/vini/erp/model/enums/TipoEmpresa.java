package com.vini.erp.model.enums;

public enum TipoEmpresa {
	
	MEI("Microempreendedor Indidual"),
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anonima");

	private String descricao;
	
	TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
