package com.vini.erp.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.vini.erp.model.RamoAtividade;

public class RamoAtividadeRepository implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public RamoAtividadeRepository() {
	}
	
	public RamoAtividadeRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<RamoAtividade> pesquisar(String descicao){
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		
		CriteriaQuery<RamoAtividade> cq = cb.createQuery(RamoAtividade.class);
		
		Root<RamoAtividade> root = cq.from(RamoAtividade.class);
		cq.select(root);
		cq.where(cb.like(root.get("descricao"), descicao +"%"));
		TypedQuery<RamoAtividade> query = manager.createQuery(cq);
		
		return query.getResultList();
	}
	
}
