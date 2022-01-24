package chatbox.chatapp.repository;

import org.springframework.data.repository.CrudRepository;

import chatbox.chatapp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

    
}