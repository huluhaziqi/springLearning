package com.example.test03.service;


import com.example.test03.ListService;

public class WindowsListService implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("dir");
    }
}
