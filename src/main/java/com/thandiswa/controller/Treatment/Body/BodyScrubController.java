package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.factory.Treatment.Body.BodyScrubFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyScrubServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/bodyScrub")
public class BodyScrubController {
    @Autowired
    private BodyScrubServiceImpl service;

    /*@GetMapping("/create/{grittyIngredients}")
    public @ResponseBody
    BodyScrub create(@PathVariable String grittyIngredients){
        BodyScrub bodyScrub = BodyScrubFactory.getBodyScrub(grittyIngredients);
        return service.create(bodyScrub);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyScrub> getAll(){
        return service.getAll();
    }
}
