package br.com.pessoa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.pessoa.model.Pessoa;
import br.com.pessoa.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Long codigo,Pessoa pessoa){
		Pessoa pessoaSalva = pessoaRepository.findOne(codigo);
		if(pessoaSalva == null){
			throw new EmptyResultDataAccessException(1);
		}
		BeanUtils.copyProperties(pessoa,pessoaSalva,"codigo");
		return pessoaRepository.save(pessoaSalva);
	}

}
