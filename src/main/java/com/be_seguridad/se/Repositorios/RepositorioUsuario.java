package com.be_seguridad.se.Repositorios;
import com.be_seguridad.se.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
}