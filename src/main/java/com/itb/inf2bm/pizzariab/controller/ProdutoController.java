package com.itb.inf2bm.pizzariab.controller;

import com.itb.inf2bm.pizzariab.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<Produto>();



    @GetMapping
    public List<Produto> findAll() {


        Produto p1 = new Produto();

        p1.setId(1L);
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Pizza de calabresa com bastante cebola");
        p1.setValorVenda(49.60);

        Produto p2 = new Produto();

        p2.setId(2L);
        p2.setNome("Pizza de Muçarela");
        p2.setDescricao("Pizza de muçarela com tomate");
        p2.setValorVenda(49.60);


        produtos.add(p1);
        produtos.add(p2);
        return produtos;

    }

}
