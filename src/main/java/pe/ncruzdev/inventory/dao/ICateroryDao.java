package pe.ncruzdev.inventory.dao;

import org.springframework.data.repository.CrudRepository;
import pe.ncruzdev.inventory.model.Category;

public interface ICateroryDao extends CrudRepository<Category, Long> {

}
