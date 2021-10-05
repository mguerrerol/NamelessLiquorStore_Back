package co.edu.unbosque.NamelessBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.NamelessBack.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Long>{

}
