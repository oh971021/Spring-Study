package com.example.demo.dto;

import lombok.Data;

@Data
public class Mb {
    private String id;
    private String name;

    public Mb() {
    }

    public Mb(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
