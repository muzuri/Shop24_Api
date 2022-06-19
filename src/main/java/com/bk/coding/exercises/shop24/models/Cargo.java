package com.bk.coding.exercises.shop24.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "CARGOS_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID cargoId;
    private String cargoName;
    private Date insertDate;

}
