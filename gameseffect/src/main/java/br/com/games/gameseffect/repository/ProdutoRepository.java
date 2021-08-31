package br.com.games.gameseffect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.games.gameseffect.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
