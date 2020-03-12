package br.com.postmon.model;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
AQUI ESTOU REPRESENTADO O OBJETO DO JSON

"cidade_info": {
        "area_km2": "318,675",
        "codigo_ibge": "3518800"
        },
*/

public class CityInfo {
    @JsonProperty("area_km2")
    private String area;

    @JsonProperty("codigo_ibge")
    private String codigoIBGE;

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
}
