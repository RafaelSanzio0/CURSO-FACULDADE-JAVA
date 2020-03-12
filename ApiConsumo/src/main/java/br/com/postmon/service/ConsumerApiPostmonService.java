package br.com.postmon.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConsumerApiPostmonService {

    @Value("${url.postmon}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void consumer(String cep){
        RestTemplate restTemplate = new RestTemplate();
        this.url = url + cep;
    }

    public static void main(String[] args) {
        ConsumerApiPostmonService consumerApiPostmonService = new ConsumerApiPostmonService();
        consumerApiPostmonService.addCep("07075040");
        System.out.println(consumerApiPostmonService.getUrl());

    }


}
