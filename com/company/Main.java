package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

//        String weekdayNumber = reader.readLine();
//        Integer weekdayNumberInt = Integer.parseInt(weekdayNumber);

//        Map<Integer, String> week = new HashMap<>();
//        week.put(1, "понедельник");
//        week.put(2, "вторник");
//        week.put(3, "среда");
//        week.put(4, "четверг");
//        week.put(5, "пятница");
//        week.put(6, "суббота");
//        week.put(7, "воскресенье");
//
//        boolean a = week.entrySet().stream().anyMatch(e -> e.getKey().equals(weekdayNumberInt));
//
//        if ( !a ) {
//            System.out.println("такого дня недели не существует");
//        } else {
//            Optional<String> weekday = week.entrySet().stream()
//                    .filter(e -> e.getKey().equals(weekdayNumberInt))
//                    .map(Map.Entry::getValue).findAny();
//
//            System.out.println(weekday.get());


        //task14 level 4
//        String year = reader.readLine();
//        int yearInt = Integer.parseInt(year);
//        int x = 0;
//
//        x = ( ( yearInt % 4 == 0 && yearInt % 100 != 0 ) || ( yearInt % 400 == 0 ) ) ? 366 : 365;
//
//        System.out.println("количество дней в году: " + x);

        //task 0415 lvl 4
//        String triangleSideA = reader.readLine();
//        String triangleSideB= reader.readLine();
//        String triangleSideC = reader.readLine();
//
//        int [] sides = new int[3];
//        sides[0] = Integer.parseInt(triangleSideA);
//        sides[1] = Integer.parseInt(triangleSideB);
//        sides[2] = Integer.parseInt(triangleSideC);
//
//        int sum1 = sides[0] + sides[1];
//        int sum2 = sides[0] + sides[2];
//        int sum3 = sides[1] + sides[2];
//
//        if(sum1<= sides[2] || sum2 <= sides[1] || sum3 <= sides[0]){
//            System.out.println("Треугольник не существует." );
//        }
//        else {
//            System.out.println("Треугольник существует." );
//        }

        //task 0417 lvl 4
        String triangleSideA = reader.readLine();
        String triangleSideB= reader.readLine();
        String triangleSideC = reader.readLine();

        int [] sides = new int[3];
        sides[0] = Integer.parseInt(triangleSideA);
        sides[1] = Integer.parseInt(triangleSideB);
        sides[2] = Integer.parseInt(triangleSideC);

    }
}
