package com.darlan.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darlan.os.domain.Cliente;
import com.darlan.os.domain.OS;
import com.darlan.os.domain.Tecnico;
import com.darlan.os.domain.enuns.Prioridade;
import com.darlan.os.domain.enuns.Status;
import com.darlan.os.repositories.ClienteRepository;
import com.darlan.os.repositories.OSRepository;
import com.darlan.os.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instaciaDB() {
		Tecnico t1 = new Tecnico(null, "Darlan Poffo", "030.756.599-83", "(47)-98855-7768");
		Tecnico t2 = new Tecnico(null, "James Bustfire", "059.373.600-10", "(47)-98855-7777");
		Cliente c1 = new Cliente(null, "Jorge Stinger", "347.643.320-00", "(47)-98866-7887");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OS", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1, t2));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
}
