package com.thandiswa.controller.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import com.thandiswa.service.Impl.Login.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/register")
public class RegisterController {
    @Autowired
    private RegisterServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Register create(@PathVariable String name){
        values = new HashMap<String,String>();
        Register register = RegisterFactory.getRegister(values,name);
        return service.create(register);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Register> getAll(){
        return service.getAll();
    }

}
