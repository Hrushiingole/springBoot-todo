package com.app.todoapp.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String title;

    public boolean completed;


}
