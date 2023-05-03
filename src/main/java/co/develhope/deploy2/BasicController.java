package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping("/")
    public int randomInt (){
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 =  random.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}