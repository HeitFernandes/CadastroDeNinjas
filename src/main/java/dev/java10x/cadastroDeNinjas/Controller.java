package dev.java10x.cadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // usando a anotation para tornar esta classe um controller(intermedia usuario para banco de dados), no momento apenas para o usuario.
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas") // para passar a rota
    public String boasvindas(){
        return "Essa é minha primeira mensagem";
    }

    @GetMapping("/primeiro")
    public String helloWorld(){
        return "Meu primeiro Hello World usando a botinha";
    }

    @GetMapping("/apenasComece")
    public String justDoIt(){
        return "Apenas comece a fazer pequenas coisas";
    }


}
