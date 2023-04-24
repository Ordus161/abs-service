package ru.aston.app.service_impl;

import org.springframework.stereotype.Component;
import ru.aston.app.services.GeneratorService;

import java.util.Random;

@Component
public class GeneratorServiceImpl implements GeneratorService {

    private Integer[] limits = {50, 75, 100, 125, 150};

    private Random random = new Random();

    @Override
    public String generateNumber(int numbersLimit) {
        int generatedNumber = 0;
        StringBuilder finalNumber = new StringBuilder();
        for (int i = 0; i < numbersLimit; i++) {
            generatedNumber = random.nextInt(10) + 48;
            finalNumber.append((char) generatedNumber);
        }
        return finalNumber.toString();
    }


    @Override
    public Integer getLimits() {
        return limits[new Random().nextInt(limits.length)];
    }
}
