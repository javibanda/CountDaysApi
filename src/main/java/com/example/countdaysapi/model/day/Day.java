package com.example.countdaysapi.model.day;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Getter
@Data
@Table(name = "day")
@NoArgsConstructor
public class Day {

    @Id
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    private int count;

    public Day(int count){
        this.count = count;
        this.date = LocalDate.now();
        this.id = new SetIdDay(date).getIdDay();
    }

    public void addCount(int add){
        count = count + add;
    }

}
