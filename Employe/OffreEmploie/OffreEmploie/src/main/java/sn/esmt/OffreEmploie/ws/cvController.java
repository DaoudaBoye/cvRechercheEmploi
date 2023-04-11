package sn.esmt.OffreEmploie.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.esmt.OffreEmploie.dao.CvRepository;
import sn.esmt.OffreEmploie.entities.CvEntities;

import java.util.List;

@RestController
@RequestMapping (value = "/cvuser")
@AllArgsConstructor
public class cvController {

    public CvRepository cvRepository;

    @PostMapping (path = "/save")

    public CvEntities save(@RequestBody CvEntities cvEntities){

        return cvRepository.save(cvEntities);
    }

    @GetMapping (path = "/all")

    public List<CvEntities> getAll(){
        return cvRepository.findAll();
    }

}
