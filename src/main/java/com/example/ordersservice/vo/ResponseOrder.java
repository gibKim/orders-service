package com.example.ordersservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseOrder implements Serializable {
    private String productId;
    private String qty;
    private Integer unitPrice;
    private Integer totalPrice;
    private Integer stock;
    private Date    createdAt;
    private String orderId;
}
