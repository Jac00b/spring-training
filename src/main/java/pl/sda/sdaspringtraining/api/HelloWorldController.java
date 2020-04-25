package pl.sda.sdaspringtraining.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    String helloWorldCommunicate() {
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    String helloWorldWithName(@PathVariable("name") String name){
        return "Hello world, " +name;
    }

    @GetMapping("/multiply")
    String multiply(@RequestParam("f1") Integer factorOne, @RequestParam("f2") Integer factorTwo) {
        return "Wynik mnożenia to : " + (factorOne * factorTwo);
    }

    @GetMapping("/{function}")
    String count(@PathVariable String function, @RequestParam Integer f1, @RequestParam Integer f2){
        switch (function){
            case "dodawanie":
                return f1+"+"+f2+"="+(f1+f2);
            case "odejmowanie":
                return f1+"-"+f2+"="+(f1-f2);
            case "mnozenie":
                return f1+"*"+f2+"="+(f1*f2);
            case "dzielenie":
                if (f2==0){
                    return "Nie dzielimy przez zero!";
                }else {
                    return f1+"/"+f2+"="+(float)(f1-f2);
                }
        }
        return "";
    }

}
