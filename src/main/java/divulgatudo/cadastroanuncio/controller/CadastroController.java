package divulgatudo.cadastroanuncio.controller;

import divulgatudo.cadastroanuncio.model.Cadastro;
import divulgatudo.cadastroanuncio.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cadastro")
public class CadastroController {

    @Autowired
    public CadastroService service;

    @GetMapping("/todos")
    public List<Cadastro> get(){
        return service.get();
    }

    @PostMapping("/novo")
    public Cadastro save(@RequestBody Cadastro cadastro){
        return service.save(cadastro);
    }
    @GetMapping("/{id}")
    public Optional<Cadastro> getById(@PathVariable Long id){
        return service.getById(id);
    }
}
