package com.example.btlsoc.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    private float amount;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-MM hh:MM")
    private Date date;
    private String orderDesc;

    @ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "plan_id")
    @JsonIdentityReference(alwaysAsId = true)
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @JsonIdentityReference(alwaysAsId = true)
    private User user;
}
