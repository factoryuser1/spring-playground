package com.spring.playground;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
    @Test
    public void getSumStringWithParams(){
        List<String> arguments = new ArrayList<>();
        arguments.add("4");
        arguments.add("5");
        arguments.add("6");
        String expected = "4 + 5 + 6 = 15";
        String actual = MathService.getSumString(arguments);

        assertEquals(expected, actual);
    }

}
