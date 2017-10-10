package com.example.test04;


import org.springframework.stereotype.Service;

@Service
public class WindowsListService implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("dir");
    }
}
