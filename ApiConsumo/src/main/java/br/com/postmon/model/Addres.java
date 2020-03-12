package br.com.postmon.model;

/*
{
"bairro": "Jardim Palmira",
"cidade": "Guarulhos",
"logradouro": "Rua Pedro Armando Donizete de Padua",
"estado_info": {
"area_km2": "248.221,996",
"codigo_ibge": "35",
"nome": "São Paulo"
},
"cep": "07075040",
"cidade_info": {
"area_km2": "318,675",
"codigo_ibge": "3518800"
},
"estado": "SP"
}
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class Addres {

    @JsonProperty("bairro")
    private String neighborhood;

    @JsonProperty("cidade")
    private String city;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("estado_info")
    private StateInfo stateInfo;

    @JsonProperty("cidade_info")
    private CityInfo cityInfo;

    @JsonProperty("estado")
    private String State;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public StateInfo getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
