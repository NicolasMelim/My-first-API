package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepositorio repositorio;

    @GetMapping()
    public List<Usuario> getUsers(){
        return repositorio.findAll();
    }

    @GetMapping("/{username}")
    public Usuario deleteUser(@PathVariable("username") String username){
        return repositorio.findByUsername(username);
    }

    @DeleteMapping("{id}")
    public void Delete(@PathVariable("id")  Integer id){
        repositorio.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody  Usuario usuario){
        repositorio.save(usuario);

    }
    @PutMapping()
    public void putUser(@RequestBody  Usuario usuario){
        repositorio.save(usuario);

    }
}
