package br.com.spolador.dscommerce.controllers;

import br.com.spolador.dscommerce.dto.CategoryDto;
import br.com.spolador.dscommerce.dto.ProductDto;
import br.com.spolador.dscommerce.dto.ProductMinDto;
import br.com.spolador.dscommerce.services.CategoryService;
import br.com.spolador.dscommerce.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> findAll(){
        List<CategoryDto> list = categoryService.findAll();
        return ResponseEntity.ok(list); // retorna 200
    }
}
