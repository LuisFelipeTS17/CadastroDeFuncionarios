package com.senacsp.CadastroDeFuncionarios.Tarefas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import static org.assertj.core.api.Assertions.assertThat;

@WebMvcTest(TarefasController.class)
class TarefasControllerTest {

  @Autowired
  private MockMvcTester mvc;

  @Test
  void deveRetornarMensagemDeBoasVindas() {
    assertThat(mvc.get().uri("/tarefas/boasvindas"))
            .hasStatusOk()
            .hasBodyTextEqualTo("boas vindas");
  }
}