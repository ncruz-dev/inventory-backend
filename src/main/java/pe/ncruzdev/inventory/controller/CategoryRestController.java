package pe.ncruzdev.inventory.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ncruzdev.inventory.response.CategoryResponseRest;
import pe.ncruzdev.inventory.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CategoryRestController {

    private ICategoryService service;

    @GetMapping("/categories")
    public ResponseEntity<CategoryResponseRest> searchCategories(){

        ResponseEntity<CategoryResponseRest> response = service.search();
        return response;
    }

}
