package com.example.countdaysapi.model;


import com.example.countdaysapi.model.day.Day;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "count")
public class Count {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int count;

    @ManyToOne(targetEntity = Day.class)
    @JoinColumn(name="day_id", referencedColumnName = "id")
    private Day day;

    public Count (int count){
        this.count = count;
    }

}
