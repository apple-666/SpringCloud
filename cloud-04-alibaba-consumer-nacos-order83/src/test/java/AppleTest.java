import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author Double_apple
 * @Date 2022/1/30 19:37
 * @Version 1.0
 */
public class AppleTest {

    @Value("${server-url.nacos-user-service}")
    public String serverURL;

    @Test
    public void come1(){
        System.out.println(serverURL);
    }
}
