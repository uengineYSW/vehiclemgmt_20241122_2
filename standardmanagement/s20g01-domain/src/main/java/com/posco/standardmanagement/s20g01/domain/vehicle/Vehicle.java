package com.posco.standardmanagement.s20g01.domain.vehicle;

import com.posco.standardmanagement..domain.VehicleStatus;

import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Vehicle_table")
@Data

public class Vehicle  {

    
    @Id
    
    
    
    private Long id;

    
    
    
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    
    
    
    
    private String registrationNumber;

    
    
    
    
    private String make;

    
    
    
    
    private String model;

    
    
    
    
    private Integer year;

    
    
    
    
    private Double driverDistance;


    public void updateVehicleStatus(UpdateVehicleStatusCommand command){
        // 비즈니스 로직 구현
    }

}
