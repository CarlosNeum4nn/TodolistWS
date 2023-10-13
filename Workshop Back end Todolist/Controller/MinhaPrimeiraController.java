package br.com.poderosocarlinho.todolist.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8090/primeiraRota/primeiroMetodo/
public class MinhaPrimeiraController {

  /* 
  *Métodos de acesso do HTTP*
    Get - Buscar uma informação 
    Post - Adicionar dado ou informação 
    Put - Alterar dado ou informação 
    Delete - Remover um dado
    Patch - Quando queremos alterar somente ums parte da info/dado
    */ 

/*Método (Funcionalidade) de uma classe*/   
@GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Fruncionou"; 
    }
}
