package com.thandiswa.controller.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import com.thandiswa.service.Impl.Login.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    @Qualifier("ServiceRegisterImpl")
    private RegisterServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public Register create(Register register){
        return service.create(register);
    }

    @PostMapping("/update")
    @ResponseBody
    public Register update (Register register){
        return  service.update(register);
    }

    @GetMapping("/delete/{email}")
    @ResponseBody
    public void delete(@PathVariable String email){
        service.delete(email);
    }

    @GetMapping("/read/{email}")
    @ResponseBody
    public Register read(@PathVariable String email){
        return service.read(email);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Register> getAll(){
        return service.getAll();
    }

}
