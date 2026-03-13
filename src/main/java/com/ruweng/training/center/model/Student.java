package com.ruweng.training.center.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * Student Entity for Ruweng Training Center
 */
@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String dateOfBirth;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String enrollmentDate;

    @Column(nullable = false)
    private String status; // Active, Inactive, Completed

    @Column(length = 500)
    private String notes;
}