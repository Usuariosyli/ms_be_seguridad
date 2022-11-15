package com.be_seguridad.se.Repositorios;
import com.be_seguridad.se.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
