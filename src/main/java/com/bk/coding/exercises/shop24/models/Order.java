package com.bk.coding.exercises.shop24.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "ORDERS_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID orderRefNo;
    private UUID clientUuid;
    private UUID drinkId;
    private Date orderDate;
    private Date expDate;


}
