package br.com.spolador.dscommerce.services;

import br.com.spolador.dscommerce.repositories.OrderItemRepository;
import br.com.spolador.dscommerce.repositories.OrderRepository;
import br.com.spolador.dscommerce.dto.OrderDto;
import br.com.spolador.dscommerce.dto.OrderItemDto;
import br.com.spolador.dscommerce.entities.*;
import br.com.spolador.dscommerce.repositories.ProductRepository;
import br.com.spolador.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Transactional(readOnly = true)
    public OrderDto findById(Long id){
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado")
        );
        return new OrderDto(order);
    }

    @Transactional(readOnly = true)
    public OrderDto insert(OrderDto dto) {
        Order order = new Order();
        order.setMoment(Instant.now());
        order.setStatus(OrderStatus.WAITING_PAYMENT);

        User user = userService.authenticated();
        order.setClient(user);

        for(OrderItemDto itemDto : dto.getItems()){
            Product product = productRepository.getReferenceById(itemDto.getProductId());
            OrderItem item = new OrderItem(order, product, itemDto.getQuantity(), product.getPrice());
            order.getItems().add(item);
        }
        repository.save(order);
        orderItemRepository.saveAll(order.getItems());
        return new OrderDto(order);
    }
}
