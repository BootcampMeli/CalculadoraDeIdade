package com.grupo3.calculadoraidade.utils;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraDeIdadeUtils {

    public static Integer retornaIdadeDeData(Integer dia, Integer mes, Integer ano){
        LocalDate dataDeNascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();

        return Period.between(dataDeNascimento, hoje).getYears();
    }
}
