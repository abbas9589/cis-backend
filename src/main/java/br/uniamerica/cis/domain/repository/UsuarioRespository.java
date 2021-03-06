package br.uniamerica.cis.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.uniamerica.cis.domain.model.Usuario;

@Repository
public interface UsuarioRespository extends JpaRepository<Usuario, Long > {
}
