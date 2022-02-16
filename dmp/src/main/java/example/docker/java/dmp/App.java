package example.docker.java.dmp;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class App {
    public static void main(String[] args) throws InterruptedException {
        var arr = Arrays.asList(args);
        log.info("{}", arr);

        for (var arg: args) {
            log.info("arg:{}", arg);
        }
        Thread.sleep(60000);
    }
}
