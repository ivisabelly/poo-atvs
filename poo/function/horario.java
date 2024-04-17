package function;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class horario {
    public static void main(String[] args) {
        hora();
    }

    public static void hora(){
        LocalTime horinha = LocalTime.now();
        int hora = horinha.getHour();
        String horao = horinha.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        if (hora >= 5 && hora <= 11) {
        System.out.println(horao + " bom diaw");
        }
        else if (hora >= 12 && hora <= 18) {
        System.out.println(horao + " boa tardeee");
        }
        else if (hora >= 19 && hora <= 23) {
            System.out.println(horao + " boa noitew");
        }
        else if (hora>= 00 && hora <=4) {
        System.out.println(horao + "vai dormir seu bosta");
        }
    

}}