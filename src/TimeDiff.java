import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff {

    public static int  solution(String enter, String leave) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date enterTime = simpleDateFormat.parse(enter);
        Date leavingTime = simpleDateFormat.parse(leave);

        float differenceMs = leavingTime.getTime() - enterTime.getTime();

        float hours = differenceMs/(1000 * 3600);

        double roundUp = Math.ceil(hours);

        // 2 fee + 3 for first hour + 4 for remaining hours
        return 5 + ((int) roundUp - 1) * 4;

    }


    public static void main(String[] args) throws Exception {
        String enter = "9:42";
        String leave = "11:42";

        int hours = solution(enter, leave);

        System.out.println("Total ticket:" + hours);
    }
}
