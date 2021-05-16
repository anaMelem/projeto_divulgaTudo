package divulgatudo.cadastroanuncio.repository;

import divulgatudo.cadastroanuncio.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro,Long > {

}
