package bai16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Before fomat " + myObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formattedDate = myObj.format(myFormatObj);
        System.out.println("affter format " + formattedDate);

    }
}
