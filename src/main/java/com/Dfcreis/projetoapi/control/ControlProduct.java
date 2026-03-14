package com.Dfcreis.projetoapi.control;

import com.Dfcreis.projetoapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ControlProduct {

    @PostMapping
    public Produto salva(@RequestBody Produto produto){
        System.out.println("Produto salvo!: "+ produto);
        return produto;
    }

}
