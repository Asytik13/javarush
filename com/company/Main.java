package com.company;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String weekdayNumber = reader.readLine();
        Integer weekdayNumberInt = Integer.parseInt(weekdayNumber);

        Map<Integer, String> week = new HashMap<>();
        week.put(1, "понедельник");
        week.put(2, "вторник");
        week.put(3, "среда");
        week.put(4, "четверг");
        week.put(5, "пятница");
        week.put(6, "суббота");
        week.put(7, "воскресенье");

        boolean a = week.entrySet().stream().anyMatch(e -> e.getKey().equals(weekdayNumberInt));

        if ( !a ) {
            System.out.println("такого дня недели не существует");
        } else {
            Optional<String> weekday = week.entrySet().stream()
                    .filter(e -> e.getKey().equals(weekdayNumberInt))
                    .map(Map.Entry::getValue).findAny();

            System.out.println(weekday.get());
        }
    }

}
