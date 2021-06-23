package com.darlan.os.domain.enuns;

public enum Status {
	ABERTO(0, "ABERTO"),
	ANDAMENTO(1, "ANDAMENTO"),
	ENCERRADO(2, "ENCERRADO");
	
	private Integer cod;
	private String descrição;
	
	private Status(Integer cod, String descrição) {
		this.cod = cod;
		this.descrição = descrição;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescrição() {
		return descrição;
	}
	
	public static Status toEnun(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Status x : Status.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}			
		}
		throw new IllegalArgumentException("Status Inválido!" + cod);
	}
}
