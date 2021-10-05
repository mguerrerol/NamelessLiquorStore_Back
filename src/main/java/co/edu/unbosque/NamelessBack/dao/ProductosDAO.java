package co.edu.unbosque.NamelessBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.NamelessBack.model.Productos;

public interface ProductosDAO extends JpaRepository<Productos, Long>{

}
