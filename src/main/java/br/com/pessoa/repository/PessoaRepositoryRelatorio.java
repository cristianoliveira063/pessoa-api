package br.com.pessoa.repository;

import java.util.List;

import br.com.pessoa.model.Pessoa;

public interface PessoaRepositoryRelatorio {


	public List<Pessoa>relatorioPorNome(String nome);

}
