package com.taskmanager.saas.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;

    @Column(nullable = false)
    private Double amount;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(unique = true)
    private String stripePaymentId;

    private LocalDateTime paymentDate;

    public enum Status {
        PENDENTE, CONCLUÍDO, CANCELADO
    }
}