package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.factory.Treatment.Body.BodyScrubFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyScrubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bodyScrub")
public class BodyScrubController {
    @Autowired
    @Qualifier("ServiceScrubImpl")
    private BodyScrubServiceImpl service;

    @GetMapping("/create/{grittyIngredients}")
    public @ResponseBody
    BodyScrub create(@PathVariable String grittyIngredients){
        BodyScrub bodyScrub = BodyScrubFactory.getBodyScrub(grittyIngredients);
        return service.create(bodyScrub);
    }

    @PostMapping("/update")
    @ResponseBody
    public BodyScrub update(BodyScrub bodyScrub){
        return service.update(bodyScrub);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public BodyScrub read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyScrub> getAll(){
        return service.getAll();
    }
}
