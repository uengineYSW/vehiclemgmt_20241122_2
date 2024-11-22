package com.posco.standardmanagement.s20g01.domain.vehicle;

import java.util.*;
import lombok.Data;
import java.time.LocalDate;
import com.posco.standardmanagement..domain.VehicleStatus;


@Data
public class RegisterVehicleCommand {

        private String registrationNumber;
        private String make;
        private String model;
        private Integer year;
        private VehicleStatus status;


}
