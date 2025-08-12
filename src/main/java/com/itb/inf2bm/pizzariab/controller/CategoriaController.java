package com.itb.inf2bm.pizzariab.controller;

import com.itb.inf2bm.pizzariab.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    List<Categoria> categorias = new ArrayList<Categoria>();



    @GetMapping
    public List<Categoria> finAll() {


        Categoria c1 = new Categoria();

        c1.setId(1L);
        c1.setNome("Salgadas");
        c1.setDescricao("Pizzas com ingredientes salgados");

        Categoria c2 = new Categoria();

        c2.setId(2L);
        c2.setNome("Doces");
        c2.setDescricao("Pizzas com ingredientes doces");


        categorias.add(c1);
        categorias.add(c2);
        return categorias;

    }

}
