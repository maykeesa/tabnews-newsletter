package br.com.email.tabnews.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllStartPageRequest {

	@JsonProperty(value = "id")
	public String id;
	@JsonProperty(value = "owner_id")
	public String ownerId;
	@JsonProperty(value = "parent_id")
	public Object parentId;
	@JsonProperty(value = "slug")
	public String slug;
	@JsonProperty(value = "title")
	public String title;
	@JsonProperty(value = "status")
	public String status;
	@JsonProperty(value = "source_url")
	public String sourceUrl;
	@JsonProperty(value = "created_at")
	public String createdAt;
	@JsonProperty(value = "updated_at")
	public String updatedAt;
	@JsonProperty(value = "published_at")
	public String publishedAt;
	@JsonProperty(value = "deleted_at")
	public String deletedAt;
	@JsonProperty(value = "tabcoins")
	public int tabcoins;
	@JsonProperty(value = "owner_username")
	public String ownerUsername;
	@JsonProperty(value = "children_deep_count")
	public int childrenDeepCount;

	public AllStartPageRequest(){

	}
}
