import org.junit.Test;

import java.time.ZonedDateTime;

/**
 * @Author Double_apple
 * @Date 2022/1/30 17:16
 * @Version 1.0
 */
public class AppleTime {

    @Test
    public void showTime(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
