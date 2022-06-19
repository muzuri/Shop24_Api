package com.bk.coding.exercises.shop24.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "DRINKS_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID drinkId;
    private String description;
    private String category;
    private Date insertDate;
}
