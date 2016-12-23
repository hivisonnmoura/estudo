package tutorial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;


/**
 * Created by hivisonmoura on 2016-12-23.
 */
public class EmployeeRepository extends CrudRepository<Employee, Long> {

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @Override
    void delete(Long aLong);
}
