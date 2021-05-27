package com.grupo3.calculadoraidade.controller;

import com.grupo3.calculadoraidade.utils.CalculadoraDeIdadeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CalculadoraDeIdadeController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer calculaIdade(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) {
        return CalculadoraDeIdadeUtils.retornaIdadeDeData(dia, mes, ano);
    }
}
