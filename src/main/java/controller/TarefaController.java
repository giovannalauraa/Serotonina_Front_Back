package controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Tarefa;
import repository.TarefasRepository;

@RestController
@CrossOrigin
public class TarefaController {

     @GetMapping("/tarefas")
     public List<Tarefa> listaTodasTarefas(){
         return TarefasRepository.all();
     }

     @GetMapping("/teste")
     public String teste(){
         return "Terefas API";
     }

     @GetMapping("/tarefas/{id}")
     public Tarefa recuperarTarefasById(@PathVariable("id") int idtarefas){
         return TarefasRepository.getById(idtarefas);
     }

     @PostMapping("/tarefas-1")
     public void addTarefas(
         @RequestBody Tarefa tarefas) {
             TarefasRepository.add(tarefas);
         }
}