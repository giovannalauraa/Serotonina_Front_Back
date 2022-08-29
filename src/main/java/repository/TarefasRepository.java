package repository;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;

public class TarefasRepository {
    private static TarefasRepository repo;

    private ArrayList<Tarefa> tarefas;

    private TarefasRepository() {
        this.tarefas = new ArrayList<>();
    }

    public static void init() {
        if (TarefasRepository.repo == null) {
            // Criando uma instância/objeto de TarefasRepository em repo
            TarefasRepository.repo = new TarefasRepository();

            // Adicionando algumas tarefas iniciais
            //Tarefa 1:
            TarefasRepository.add(
                    new Tarefa(
                            "Terminar o projeto de LTP."));
            //Tarefa 2
            TarefasRepository.add(
                    new Tarefa(
                            "Terminar a lista de matemática."));
            //Tarefa 3
            TarefasRepository.add(
                    new Tarefa(
                            "Estudar coreano."));

        } else {
            System.out.println("O banco já foi inicializado!");
        }
    }

    public static void add(Tarefa tarefas) {
        TarefasRepository.repo.tarefas.add(tarefas);
    }

    public static List<Tarefa> all() {
        return TarefasRepository.repo.tarefas;
    }

    public static Tarefa getById(int idtarefas) {
        return TarefasRepository.repo.tarefas.stream().filter((perfil) -> perfil.getId() == idtarefas).toList().get(0);
    }
}