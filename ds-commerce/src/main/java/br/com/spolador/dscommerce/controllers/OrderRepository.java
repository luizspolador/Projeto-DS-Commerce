package br.com.spolador.dscommerce.controllers;

import br.com.spolador.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
