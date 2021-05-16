package divulgatudo.cadastroanuncio.service;

import divulgatudo.cadastroanuncio.model.Cadastro;
import divulgatudo.cadastroanuncio.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository repository;

    public Cadastro save(Cadastro cadastro){
        return repository.save(cadastro);
    }

    public List<Cadastro>get(){
        return repository.findAll();
    }

    public Optional<Cadastro> getById(Long id){
        return repository.findById(id);
    }
}
