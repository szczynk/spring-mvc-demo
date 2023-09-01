package org.szczynk.spring_mvc_demo.service;

import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {

    @Override
    public int add(int i, int j) {
        return i + j;
    }
}
