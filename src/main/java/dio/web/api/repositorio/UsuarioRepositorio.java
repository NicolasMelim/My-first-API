package dio.web.api.repositorio;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepositorio {
    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("Save - Recebendo o usuario na camada de repositorio");
        else
            System.out.println("UPDATE - Recebendo o usuario na camada de repositoiro");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id %d para excluir", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("nicolas","2605039!"));
        usuarios.add(new Usuario("gabrielle","181004"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id -  Recebendo o id para localizar o usuario", id));
        return new Usuario("nicolas","2605039!");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebemdo o username %s para localizar", username));
        return new Usuario("gabrielle","181004");
    }
}
