package br.com.email.tabnews.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostRequest {

	@JsonProperty(value = "id", required = false)
    public String id;
	@JsonProperty(value = "owner_id", required = false)
    public String ownerId;
	@JsonProperty(value = "parent_id", required = false)
    public Object parentId;
	@JsonProperty(value = "slug", required = false)
    public String slug;
	@JsonProperty(value = "title", required = false)
    public String title;
	@JsonProperty(value = "body", required = false)
    public String body;
	@JsonProperty(value = "status", required = false)
    public String status;
	@JsonProperty(value = "source_url", required = false)
    public String sourceUrl;
	@JsonProperty(value = "created_at", required = false)
    public String createdAt;
	@JsonProperty(value = "updated_at", required = false)
    public String updatedAt;
	@JsonProperty(value = "publishedAt", required = false)
    public String published_at;
	@JsonProperty(value = "deleted_at", required = false)
    public String deletedAt;
	@JsonProperty(value = "owner_username", required = false)
    public String ownerUsername;
	@JsonProperty(value = "tabcoins", required = false)
    public int tabcoins;
	@JsonProperty(value = "children_deep_count", required = false)
    public int childrenDeepCount;
    
    public PostRequest() {
    	
    }
}
