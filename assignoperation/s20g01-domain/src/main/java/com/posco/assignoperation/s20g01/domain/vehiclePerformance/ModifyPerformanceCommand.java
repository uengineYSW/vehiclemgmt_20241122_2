package com.posco.assignoperation.s20g01.domain.vehiclePerformance;

import java.util.*;
import lombok.Data;
import java.time.LocalDate;
import com.posco.assignoperation..domain.Purpose;
import com.posco.assignoperation..domain.Period;


@Data
public class ModifyPerformanceCommand {

        private String registrationId;
        private String vehicleNumber;
        private Date registrationDate;
        private String departure;
        private String departureTime;
        private int accumulatedDistanceBefore;
        private String destination;
        private String arrivalTime;
        private int accumulatedDistanceAfter;
        private Double drivingDistance;
        private Purpose purpose;
        private Period period;


}
