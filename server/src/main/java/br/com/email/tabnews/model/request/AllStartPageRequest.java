package br.com.email.tabnews.model.request;

import java.util.List;

import lombok.Data;

@Data
public class AllStartPageRequest {

	private List<PostStartPageRequest> postsStartPage;
}
