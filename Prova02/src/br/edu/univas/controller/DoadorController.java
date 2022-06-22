package br.edu.univas.controller;

import br.edu.univas.database.Database;
import br.edu.univas.enums.TipoSanguineo;
import br.edu.univas.vo.Doador;


public class DoadorController {

    public void cadastrarDoador(Long cpf, String tipoSanguineo) {

        //Faltou aqui

        Doador doador = new Doador();
        //TipoSanguineo tipo = new TipoSanguineo(tipoSanguineo);
        //doador.setCpf(cpf);
        //doador.setTipoSanguineo(tipo);
        Database.addDoador(doador);
    }

    public void cadstrarDoacao(String tipoSanguineo, Long quantidade) {
        if(quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser menor que 0(zero)");

        }


    }

    

}
