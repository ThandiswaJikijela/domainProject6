package com.thandiswa.controller.Login;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
import com.thandiswa.service.Impl.Login.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController
@RequestMapping("login")
public class LoginController {

        @Autowired
        @Qualifier("ServiceLoginImpl")
        private LoginServiceImpl service;

        @PostMapping("/create")
        @ResponseBody
        public LogIn create (LogIn logIn){
            return service.create(logIn);
        }

        @PostMapping("/update")
        @ResponseBody
        public LogIn update (LogIn logIn){
            return  service.update(logIn);
        }

        @GetMapping("/delete/{password}")
        @ResponseBody
        public void delete(@PathVariable String password){
            service.delete(password);
        }

        @GetMapping("/read/{password}")
        @ResponseBody
        public LogIn read(@PathVariable String password){
            return service.read(password);
        }

        @GetMapping("/getAll")
        @ResponseBody
        public Set<LogIn> getAll(){
            return service.getAll();
        }
}
