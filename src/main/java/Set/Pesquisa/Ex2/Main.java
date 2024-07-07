package main.java.Set.Pesquisa.Ex2;

import main.java.Exception.ColecaoVaziaException;

public class Main {
    public static void main(String[] args) throws ColecaoVaziaException {

        ListaDeTarefas tarefas = new ListaDeTarefas();

        tarefas.adicionarTarefa("Lavar roupa", true);
        tarefas.adicionarTarefa("Comprar pão", true);
        tarefas.adicionarTarefa("Limpar a cozinha", false);
        tarefas.adicionarTarefa("Ir ao mercado", true);

        tarefas.exibirTarefas();
        tarefas.removerTarefa("Lavar roupa");
        tarefas.exibirTarefas();
        System.out.println(tarefas.contarTarefas());
        System.out.println(tarefas.tarefasConcluidas());
        System.out.println(tarefas.tarefasPendentes());
        tarefas.marcarTarefaConcluida("Arrumar a casa");
        tarefas.exibirTarefas();
        tarefas.marcarTarefaConcluida("Limpar a cozinha");
        tarefas.exibirTarefas();
    }
}
