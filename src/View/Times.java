package View;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Times {
    static Timestamp data = Timestamp.valueOf(LocalDateTime.now());
//    LocalDateTime now = LocalDateTime.now();
//        Timestamp timestamp = Timestamp.valueOf(now);
    public static void main(String[] args) {
        System.out.println(Times.data);
    }
}
