package co.edu.unbosque.NamelessBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.NamelessBack.model.Clientes;

public interface ClientesDAO extends JpaRepository<Clientes, Integer>{

}
