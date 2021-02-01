package cl.awakelab.apirestprod;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.apirestprod.model.Producto;
import cl.awakelab.apirestprod.repos.IProductoRepo;

@RestController
public class RestProductoController {

	@Autowired
	private IProductoRepo prodRepo; 
	
	
	@RequestMapping(value="/api/productos", headers = "Accept=application/json")
	public List<Producto> getProductos(){
		
		return prodRepo.findAll();
		
	}
	
}
