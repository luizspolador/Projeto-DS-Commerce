package br.com.spolador.dscommerce.repositories;

import br.com.spolador.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
