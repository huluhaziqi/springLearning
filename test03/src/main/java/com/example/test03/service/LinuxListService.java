package com.example.test03.service;


import com.example.test03.ListService;

public class LinuxListService implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("ls");
    }
}
