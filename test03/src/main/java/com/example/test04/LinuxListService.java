package com.example.test04;


import org.springframework.stereotype.Service;

@Service
public class LinuxListService implements ListService {
    @Override
    public void showListCmd() {
        System.out.println("ls");
    }
}
