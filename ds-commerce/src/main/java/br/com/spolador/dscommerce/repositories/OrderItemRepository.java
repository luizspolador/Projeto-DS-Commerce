package br.com.spolador.dscommerce.repositories;

import br.com.spolador.dscommerce.entities.OrderItem;
import br.com.spolador.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
