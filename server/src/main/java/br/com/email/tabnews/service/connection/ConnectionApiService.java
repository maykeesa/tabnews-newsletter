package br.com.email.tabnews.service.connection;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.email.tabnews.model.request.AllStartPageRequest;
import br.com.email.tabnews.model.request.PostRequest;

@Service
public class ConnectionApiService {

	public AllStartPageRequest findAll(int qtd) {
		RestTemplate restTemp = new RestTemplateBuilder()
				.rootUri("https://www.tabnews.com.br/api/v1/contents?page=1&per_page=" + qtd)
				.build();
		
		return restTemp.getForObject("qtd", AllStartPageRequest.class, qtd);
	}
	
	public PostRequest findPost(String user, String slug) {
		
	}
}
