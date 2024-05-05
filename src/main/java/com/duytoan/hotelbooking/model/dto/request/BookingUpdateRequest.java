package com.duytoan.hotelbooking.model.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BookingUpdateRequest {

    private List<Long> roomIds;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;
}
