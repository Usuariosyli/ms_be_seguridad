package com.be_seguridad.se.Repositorios;
import com.be_seguridad.se.Modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {
}
