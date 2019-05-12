package com.thandiswa.controller.Login;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
import com.thandiswa.service.Impl.Login.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/login")
public class LoginController {

        @Autowired
        private LoginServiceImpl service;
        private Map<String, String> values;

        @GetMapping("/create/{username}")
        public @ResponseBody
        LogIn create(@PathVariable String username){
            values = new HashMap<String,String>();
            LogIn logIn = LogInFactory.getLogIn(values,username);
            return service.create(logIn);
        }

        @GetMapping("/getall")
        @ResponseBody
        public Set<LogIn> getAll(){
            return service.getAll();
        }
}
