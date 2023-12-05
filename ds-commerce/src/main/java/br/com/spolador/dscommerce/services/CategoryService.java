package br.com.spolador.dscommerce.services;

import br.com.spolador.dscommerce.dto.CategoryDto;
import br.com.spolador.dscommerce.entities.Category;
import br.com.spolador.dscommerce.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    @Transactional(readOnly = true)
    public List<CategoryDto> findAll(){
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(x -> new CategoryDto(x)).collect(Collectors.toList());
    }
}
