package br.com.spolador.dscommerce.dto;

import br.com.spolador.dscommerce.entities.OrderItem;

public class OrderItemDto {
    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDto(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDto(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getProduct().getName();
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getSubTotal(){
        return quantity * price;
    }
}
