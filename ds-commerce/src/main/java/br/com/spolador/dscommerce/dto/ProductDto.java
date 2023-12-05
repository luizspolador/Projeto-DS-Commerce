package br.com.spolador.dscommerce.dto;

import br.com.spolador.dscommerce.entities.Category;
import br.com.spolador.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDto {

    private Long id;
    @NotBlank(message = "Campo requerido") // caso a validação seja violada, será retornada uma msg
    @Size(min = 3, max = 80, message = "Nome precisa ter de 3 a 80 caracteres")
    private String name;
    @Size(min = 10, message = "Descrição precisa ter no mínimo 10 caracteres")
    @NotBlank
    private String description;
    @Positive(message = "O preço deve ser positivo")
    @NotNull(message = "Campo requerido")
    private Double price;
    private String imgUrl;

    @NotEmpty(message = "Deve ter pelo menos 1 categoria")
    private List<CategoryDto> categories = new ArrayList<>();

    public ProductDto(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    //OPÇÃO PARA NÃO UTILIZAR O MODEL MAPPPER
    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
        for(Category cat : entity.getCategories()){
            categories.add(new CategoryDto(cat));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public List<CategoryDto> getCategories() {
        return categories;
    }
}
