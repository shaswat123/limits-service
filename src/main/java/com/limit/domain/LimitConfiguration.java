package com.limit.domain;

public class LimitConfiguration {

    private Integer maximum;
    private  Integer minimum;

    public LimitConfiguration(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public LimitConfiguration() {

    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }



    public Integer getMaximum() {
        return maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }


}
