package com.example.countdaysapi.model.day;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Data
public class Day {


    public Day(int count){
        this.count = count;
        this.date = LocalDate.now();
        this.id = new SetIdDay(date).getIdDay();
    }

//    public Checking(int count, LocalDate date){
//        this.count = count;
//        this.date = date;
//        this.id = new SetIdDate(date).getIdDay();
//    }


    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    private int count;

    public void addCount(int add){
        count = count + add;
    }

}
