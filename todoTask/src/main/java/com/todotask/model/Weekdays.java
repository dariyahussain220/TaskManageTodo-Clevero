package com.todotask.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "weekdays")
public class Weekdays {

    private Long id;
    private String weekday;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
