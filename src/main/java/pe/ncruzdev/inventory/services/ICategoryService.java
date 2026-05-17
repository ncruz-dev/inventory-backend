package pe.ncruzdev.inventory.services;

import org.springframework.http.ResponseEntity;
import pe.ncruzdev.inventory.response.CategoryResponseRest;

public interface ICategoryService {

    public ResponseEntity<CategoryResponseRest> search();
    public ResponseEntity<CategoryResponseRest> searchById(Long id);

}
