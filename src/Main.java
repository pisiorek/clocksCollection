

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random clocksGenerator = new Random();

         class Clocks {

             int minute;
             int hour;

             //konstruktor
             public Clocks(int hour, int minute) {

                 this.hour = hour;
                 this.minute = minute;

             }

             public void setHour(int hour) {

                 this.hour = hour;
             }

             public void setMinute(int minute) {

                 this.minute = minute;
             }

             public int getHour() {

                 if(hour < 10){

                     return hour;
                 }else{

                     return hour;

                 }

             }

             public int getMinute() {

                 return minute;
             }

             public String getTime() {

                 String tempHour;
                 String tempMinute;
                 if ( getHour() < 10){

                     tempHour = "0" + String.valueOf(getHour());

                 }else{

                     tempHour = String.valueOf(getHour());
                 }


                 if ( getMinute() < 10){

                     tempMinute = "0" + String.valueOf(getMinute());

                 }else{

                     tempMinute = String.valueOf(getMinute());
                 }

                 return "Aktualny czas: " + tempHour + ":" + tempMinute;
             }


         }
        LinkedList <Clocks> listOfClocks = new LinkedList<Clocks>();




        for(int i = 0; i < 10; i++){

            listOfClocks.add(new Clocks(clocksGenerator.nextInt(24),clocksGenerator.nextInt(60)));


        }

        for(int i = 0; i < listOfClocks.size(); i++){

            System.out.println(listOfClocks.get(i).getTime());
            listOfClocks.get(i).setMinute(listOfClocks.get(i).getMinute()+1);
            System.out.println("Czas przesunięty o minutę: " + listOfClocks.get(i).getTime() + "\n");


        }
    }
}
