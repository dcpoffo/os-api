package com.darlan.os.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

@Entity
public class Tecnico extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tecnico")
	private List<OS> list = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	public List<OS> getList() {
		return list;
	}

	public void setList(List<OS> list) {
		this.list = list;
	}
}
