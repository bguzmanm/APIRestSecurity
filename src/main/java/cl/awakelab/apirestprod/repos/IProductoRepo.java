package cl.awakelab.apirestprod.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.apirestprod.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
