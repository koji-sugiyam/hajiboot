package com.example.app;

import org.springframework.stereotype.Component;

@Component //componentScanする場合
public class CalculatorAdd implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
