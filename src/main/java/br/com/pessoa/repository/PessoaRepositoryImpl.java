package br.com.pessoa.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pessoa.model.Pessoa;

public class PessoaRepositoryImpl implements PessoaRepositoryRelatorio {

	@Autowired
	private EntityManager em;

	@Override
	public List<Pessoa> relatorioPorNome(String nome) {
		return em.createQuery("from Pessoa where upper(nome) like :nome",Pessoa.class)
				.setParameter("nome", nome.toUpperCase() + "%").getResultList();
	}

}
