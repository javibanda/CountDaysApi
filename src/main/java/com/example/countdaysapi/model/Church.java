package com.example.countdaysapi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

@NoArgsConstructor
@Entity
@Getter
@Data
@Table(name = "church")
public class Church {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String churchName;
    private String city;

    private String priestName;
    private String priestLastName;
    private String priestSecondLastName;

    private String priestUser;
    private String pass;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate ordinationDay;

    public Church(
            String churchName,
            String city,
            String priestName,
            String priestLastName,
            String priestSecondLastName,
            String pass,
            LocalDate ordinationDay) {

        this.churchName = churchName;
        this.city = city;
        this.priestName = priestName;
        this.priestLastName = priestLastName;
        this.priestSecondLastName = priestSecondLastName;
        this.priestUser = setPriestUser();
        this.pass = pass;
        this.ordinationDay = ordinationDay;
    }

    private String setPriestUser(){
        return getFirstLetters(priestName)
                + getFirstLetters(priestLastName)
                + getFirstLetters(priestSecondLastName);
    }

    private String getFirstLetters(String string){
        return Objects.requireNonNullElse(string.substring(0,3), "").toLowerCase(Locale.ROOT);
    }
}
