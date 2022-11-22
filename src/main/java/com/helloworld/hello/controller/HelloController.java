package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String hello_2() {
        return ""
                +"<ul>\n"
                +"<h3>Mentalidades</h3>"
                +"<li>Responsabilidade Pessoal</li>\n"
                +"<li>Mentalidade de Crescimento</li>\n"
                +"<li>Orientação ao Futuro</li>\n"
                +"<li>Persistência</li>\n"

                +"<h3>Habilidades</h3>"
                +"<li>Comunicação</li>\n"
                +"<li>Adaptabilidade</li>\n"
                +"<li>Trabalho em equipe</li>\n"
                +"<li>Proatividade</li>\n"
                +"</ul>"
                ;
    }

    @GetMapping("/objetivo")
    public String hello_3() {
        return ""
                +"<ul>\n"
                +"<h3>A estudar:</h3>"
                +"<li> Persistência</li>\n"
                +"<li> Proatividade</li>\n";
    }
}
