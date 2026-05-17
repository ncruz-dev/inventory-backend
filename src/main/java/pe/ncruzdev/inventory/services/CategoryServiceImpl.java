package pe.ncruzdev.inventory.services;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.ncruzdev.inventory.dao.ICateroryDao;
import pe.ncruzdev.inventory.model.Category;
import pe.ncruzdev.inventory.response.CategoryResponseRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements ICategoryService {

    private ICateroryDao cateroryDao;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<CategoryResponseRest> search() {
        CategoryResponseRest categoryResponseRest = new CategoryResponseRest();
        try {
            List<Category> categories = (List<Category>) cateroryDao.findAll();

            categoryResponseRest.getCategoryResponse().setCategories(categories);
            categoryResponseRest.setMetadata("Respuesta ok", "00", "Respuesta exitosa");

        } catch (Exception e){
            categoryResponseRest.setMetadata("Respuesta nok", "-1", "Error al consultar");
            e.getStackTrace();
            return new ResponseEntity<>(categoryResponseRest, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(categoryResponseRest, HttpStatus.OK);
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<CategoryResponseRest> searchById(Long id) {
        CategoryResponseRest categoryResponseRest = new CategoryResponseRest();
        List<Category> list = new ArrayList<>();

        try {
            Optional<Category> category = cateroryDao.findById(id);

//            category.ifPresent(list::add);
            if (category.isPresent()) {
                list.add(category.get());
                categoryResponseRest.getCategoryResponse().setCategories(list);
                categoryResponseRest.setMetadata("Respuesta ok", "00", "Respuesta exitosa");
            }else {
                categoryResponseRest.setMetadata("Respuesta nok", "-1", "Categoria no encontrada");
                return new ResponseEntity<>(categoryResponseRest, HttpStatus.NOT_FOUND);
            }

        } catch (Exception e){
            categoryResponseRest.setMetadata("Respuesta nok", "-1", "Error al consultar por id");
            e.getStackTrace();
            return new ResponseEntity<>(categoryResponseRest, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(categoryResponseRest, HttpStatus.OK);
    }
}
