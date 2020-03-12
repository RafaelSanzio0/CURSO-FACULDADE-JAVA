package br.com.postmon.model;
/*
"estado_info": {
"area_km2": "248.221,996",
"codigo_ibge": "35",
"nome": "São Paulo"
},
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo {
    @JsonProperty("area_km2")
    private String area;

    @JsonProperty("codigo_ibge")
    private String codigoIBGE;

    @JsonProperty("nome")
    private String nome;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
