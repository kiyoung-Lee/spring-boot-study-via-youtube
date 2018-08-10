package com.example.demo.day10;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Component
@ConfigurationProperties("luke")
//@Validated
public class LukeProperties {

    private String workFor;
    private String workWhere;


    private Duration time1;
    private Duration time2;
    private Duration time3;

    @Min(0)
    @Max(100)
    private int number;

    private int number2;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getWorkFor() {
        return workFor;
    }

    public void setWorkFor(String workFor) {
        this.workFor = workFor;
    }

    public String getWorkWhere() {
        return workWhere;
    }

    public void setWorkWhere(String workWhere) {
        this.workWhere = workWhere;
    }

    public Duration getTime1() {
        return time1;
    }

    public void setTime1(Duration time1) {
        this.time1 = time1;
    }

    public Duration getTime2() {
        return time2;
    }

    public void setTime2(Duration time2) {
        this.time2 = time2;
    }

    public Duration getTime3() {
        return time3;
    }

    public void setTime3(Duration time3) {
        this.time3 = time3;
    }
}
