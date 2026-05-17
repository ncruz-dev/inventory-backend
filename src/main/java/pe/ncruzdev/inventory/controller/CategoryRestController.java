package pe.ncruzdev.inventory.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ncruzdev.inventory.response.CategoryResponseRest;
import pe.ncruzdev.inventory.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CategoryRestController {

    private ICategoryService service;

    /**
     * get all the categories
     * @return
     */
    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseRest> searchCategories(){

        ResponseEntity<CategoryResponseRest> response = service.search();
        return response;
    }

    /**
     * get categories by id
     * @param id
     * @return
     */
    @GetMapping("/categories/{id}")
    public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable Long id){

        ResponseEntity<CategoryResponseRest> response = service.searchById(id);
        return response;
    }

}
