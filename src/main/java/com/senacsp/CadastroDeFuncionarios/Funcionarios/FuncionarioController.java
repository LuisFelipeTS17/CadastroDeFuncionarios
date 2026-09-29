package com.senacsp.CadastroDeFuncionarios.Funcionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira rota";
    }
}
