package com.movie.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
public class ScheduleDto {
    private Long id;
    private String cinemaNm;
    private String movieTitle;       // 예: "범죄도시4"
    private String screenRoomName;   // 예: "1관"
    private LocalDate showDate;
    private LocalTime startTime;
    private String status;           //상태
    private int availableSeat;      //잔여좌석
    private String description;
}
