package Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MonetCristo {

    public static void main(String[] args) {

        try {
            List<String> book = Files.readAllLines(Paths.get("Collections/crsto10.txt"));
            System.out.println("Ilość wiereszy w książce: " + BookReader.numberOfLines(book));
        } catch (IOException e) {
            e.printStackTrace();
        }


        BookReader br = new BookReader("Collections/crsto10.txt");
        System.out.println("");
        System.out.println("Listowanie co 100 wiersza");
        br.every100();
        System.out.println("");
        System.out.println("Poszukiwanie najdłuższego wiersza");
        br.longest();



    }


}


class BookReader {

        List<String> monteChrist=new ArrayList();
        String bookAddress;
        BookReader (String bookPath) {
            this.bookAddress = bookPath;
            {
                try {
                    //monteChrist = Files.readAllLines(Paths.get("Collections/crsto10.txt"));
                      monteChrist = Files.readAllLines(Paths.get(bookAddress));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        public static int numberOfLines (List<String> book){
            return book.size();
        }


        public void every100 (){
            for (int i = 100 ; i < monteChrist.size(); i=i+100){
                System.out.println("Linia nr: " + i + " to: " + monteChrist.get(i));
            }
        }


        public void longest (){
            String longest = monteChrist.get(0);
            for (String ls : monteChrist) {
                if (longest.length() < ls.length()){
                    //System.out.println("Wiersz o długości: " + ls.length());
                    longest = ls;
                }
                //System.out.println("Wiersz o długości: " + ls.length());
            }
            System.out.println("Najdłuższy wiersz to: " + longest.toUpperCase());
        }


        }