package com.senacsp.CadastroDeFuncionarios.Tarefas;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class TarefasModelTest {
    @Test
    void deveCriarTarefasCOmDadosDoConstrutor(){
        //Arrange: prepara os dados
        LocalDateTime prazo = LocalDateTime.of(2026, 10, 15, 18, 0);

        //Act: executa o que está sendo testado
        TarefasModel tarefas = new TarefasModel(null, "Relatório", "Relatório mensal", false, prazo);

        // Assert: verifica o resultado
        assertEquals("Relatório", tarefas.getNomeDaTarefa());
        assertEquals("Relatório mensal", tarefas.getDescricao());
        assertFalse(tarefas.isConcluida());
        assertEquals(prazo, tarefas.getDataEntrega());
    }

    @Test
    void deveMarcarTarefaComoConcluida() {
        TarefasModel tarefas = new TarefasModel();

        tarefas.setConcluida(true);

        assertTrue(tarefas.isConcluida());
    }
}
