package pe.ncruzdev.inventory.services;

import org.springframework.http.ResponseEntity;
import pe.ncruzdev.inventory.model.Category;
import pe.ncruzdev.inventory.response.CategoryResponseRest;

public interface ICategoryService {

    public ResponseEntity<CategoryResponseRest> search();
    public ResponseEntity<CategoryResponseRest> searchById(Long id);
    public ResponseEntity<CategoryResponseRest> save(Category category);

}
