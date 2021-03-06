package com.thandiswa.service.Impl.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.repository.Impl.Staff.EmployeeRepositoryImpl;
import com.thandiswa.repository.Staff.EmployeeRepository;
import com.thandiswa.service.Staff.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    //@Autowired
    @Qualifier("InMemory")
    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl() {
        this.repository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee) {

        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {

        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {

        return this.repository.read(s);
    }

    @Override
    public Employee retrieveByDesc(String employeeDesc) {
        return this.repository.retrieveByDesc(employeeDesc);
    }

    @Override
    public Set<Employee> getAll() {

        return this.repository.getAll();
    }
}
