package be.studio12.studio12petclinic.services;

import be.studio12.studio12petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
