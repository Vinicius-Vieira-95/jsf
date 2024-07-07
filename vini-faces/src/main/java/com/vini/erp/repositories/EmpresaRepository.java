package com.vini.erp.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.vini.erp.entities.Empresa;

public class EmpresaRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public EmpresaRepository() {
	}

	public EmpresaRepository(EntityManager manager) {
		this.manager = manager;
	}

	public List<Empresa> pesquisar(String nome) {

		String jpql = "from Empresa where nomeFantasia like: nomeFantasia";

		TypedQuery<Empresa> query = manager.createQuery(jpql, Empresa.class);
		query.setParameter("nomeFanstasia", nome + "%");

		return query.getResultList();
	}
	
	public Empresa salvar(Empresa empresa) {
		return manager.merge(empresa);
	}
}
