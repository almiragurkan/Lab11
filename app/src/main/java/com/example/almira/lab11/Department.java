package com.example.almira.lab11;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Department {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;


}
