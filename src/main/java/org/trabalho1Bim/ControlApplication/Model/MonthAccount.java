package org.trabalho1Bim.ControlApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity
public class MonthAccount implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    private Double valores;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValores() {
        return valores;
    }

    public void setValores(Double value) {
        this.valores = value;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date created_at) {
        this.createdAt = created_at;
    }
}
