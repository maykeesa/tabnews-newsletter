package br.com.email.tabnews.service.connection;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.email.tabnews.model.request.AllStartPageRequest;
import br.com.email.tabnews.model.request.PostRequest;

@Service
public class ConnectionApiService {

	public List<AllStartPageRequest> getAll(int qtd) {
		String url = "https://www.tabnews.com.br/api/v1/contents?page=1&per_page=" + qtd;
		RestTemplate restTemp = new RestTemplateBuilder()
				.rootUri(url)
				.build();
		
		return Arrays.asList(restTemp.getForObject(url, AllStartPageRequest[].class));
	}
	
	
	public PostRequest getPost(String user, String slug) {
		String url = "https://www.tabnews.com.br/api/v1/contents/"+ user +"/" + slug;
		RestTemplate restTemp = new RestTemplateBuilder()
				.rootUri(url)
				.build();
		
		return restTemp.getForObject(url, PostRequest.class);
	}
	
	
	
	/*
	 * - Pega Thumb do artigo
	public String getPostThumb(String user, String slug) {
		String url = "https://www.tabnews.com.br/api/v1/contents/"+ user +"/" + slug + "/thumbnail";
		RestTemplate restTemp = new RestTemplateBuilder()
				.rootUri(url)
				.build();
		
		return restTemp.getForObject(url, String.class);
	}
	*/
}
