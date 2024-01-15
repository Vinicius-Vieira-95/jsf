package com.vini.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vini.erp.model.RamoAtividade;

public class RamoAtividades implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public RamoAtividades() {
	}

	public RamoAtividades(EntityManager manager) {
		this.manager = manager;
	}
	
	public RamoAtividade porId(Long id) {
		return manager.find(RamoAtividade.class, id);
	}
	
	public List<RamoAtividade> pesquisar(String descricao) {
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		
		CriteriaQuery<RamoAtividade> cq = cb.createQuery(RamoAtividade.class);
		
		Root<RamoAtividade> root = cq.from(RamoAtividade.class);
		cq.select(root);
		
		cq.where(cb.like(root.get("descricao"), descricao + "%"));
		
		TypedQuery<RamoAtividade> query = manager.createQuery(cq);
		
		return query.getResultList();
	}
	
	public RamoAtividade guardar(RamoAtividade ramoAtividade) {
		return manager.merge(ramoAtividade);
	}
	
	public void remover(RamoAtividade ramoAtividade) {
		ramoAtividade = porId(ramoAtividade.getId());
		manager.remove(ramoAtividade);
	}

}
