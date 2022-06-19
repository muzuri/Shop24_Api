package com.bk.coding.exercises.shop24.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "CLIENTS_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CLIENT_UUID")
    private UUID clientUuid;
    @Column(name = "CLIENT_NAME")
    private String clientName;
    @Column(name = "LOCATION_ID")
    private String locationId;
    @Column(name = "DISTANCE_FROM_KGL")
    private Integer distance;
    @Column(name = "INSERT_DATE")
    private Date insertDate;

}
