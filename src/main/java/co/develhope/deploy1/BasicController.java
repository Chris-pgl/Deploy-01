package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class BasicController {

    //In questo modo inizializziamo una variabile, e diciamo al sistema di andarla a prendere
    //dall'application.yml dove è stata creata, qui facciamo l'associazione
    @Value("${myCustomEnvs.devName}")
    String name;

    @GetMapping("/dev-name")
    public String getDevName(){
        return name;
    }

}
