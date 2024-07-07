package com.vini.erp.entities;

import com.vini.erp.entities.enums.TipoEmpresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2024-02-12T11:42:05.263-0300")
@StaticMetamodel(Empresa.class)
public class Empresa_ {
	public static volatile SingularAttribute<Empresa, Long> id;
	public static volatile SingularAttribute<Empresa, String> nomeFantasia;
	public static volatile SingularAttribute<Empresa, String> razaoSocial;
	public static volatile SingularAttribute<Empresa, String> cnpj;
	public static volatile SingularAttribute<Empresa, Date> dataFundacao;
	public static volatile SingularAttribute<Empresa, RamoAtividade> ramoAtividade;
	public static volatile SingularAttribute<Empresa, TipoEmpresa> tipo;
}
