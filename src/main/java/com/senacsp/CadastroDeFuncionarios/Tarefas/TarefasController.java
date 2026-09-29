package com.senacsp.CadastroDeFuncionarios.Tarefas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "boas vindas";
    }
}
