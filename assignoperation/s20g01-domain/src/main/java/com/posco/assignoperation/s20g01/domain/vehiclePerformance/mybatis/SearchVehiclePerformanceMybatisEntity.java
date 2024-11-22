package com.posco.assignoperation.s20g01.domain.vehiclePerformance.mybatis;

import lombok.Data;
import java.util.Date;

import com.posco.assignoperation..domain.Period;


@Data
public class SearchVehiclePerformanceMybatisEntity {
        private Date registrationDate;
        private Period period;
}
