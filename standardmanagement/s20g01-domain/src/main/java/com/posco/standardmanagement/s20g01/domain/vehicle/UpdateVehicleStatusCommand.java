package com.posco.standardmanagement.s20g01.domain.vehicle;

import java.util.*;
import lombok.Data;
import java.time.LocalDate;
import com.posco.standardmanagement..domain.VehicleStatus;


@Data
public class UpdateVehicleStatusCommand {

        private Long id;
        private VehicleStatus newStatus;


}
