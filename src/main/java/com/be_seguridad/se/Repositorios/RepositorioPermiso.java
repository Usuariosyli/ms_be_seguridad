package com.be_seguridad.se.Repositorios;
import com.be_seguridad.se.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
