package com.hotel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@lombok.Builder
@Entity
@Table(name = "HOTEL")
public class Hotel {

    @Id
    private String hotelId;

    @Column(name = "hotelName")
    private String hotelName;

    @Column(name = "hotelAddress")
    private String hotelAddress;

    @Column(name = "hotelCity")
    private String hotelCity;


}
