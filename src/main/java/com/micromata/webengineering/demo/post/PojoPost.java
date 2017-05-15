package com.micromata.webengineering.demo.post;

import java.util.Date;

/**
 * My POJO
 */
public class PojoPost {

    private Date date;

    public Date getDateProperty() {
         return date;
    }

    public void setDateProperty(Date currentDate) {
        this.date = currentDate;
    }

    private String title;

    public String getTitelProperty() {
         return title;
    }

    public void setTitelProperty(String titel) {
        this.title = titel;
    }
    
}
  
