package api.payload;

import java.util.ArrayList;

public class PetPojoMain {

	private int id;
	private String name;
	private String photoUrls[];
	private String status = "available";
	private PetCategaryPojo category;
	private PetTagsPojo tagging;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(String[] photoUrls) {
		this.photoUrls = photoUrls;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public PetCategaryPojo getCategory() {
		return category;
	}

	public void setCategory(PetCategaryPojo category) {
		this.category = category;
	}

	public PetTagsPojo getTagging() {
		return tagging;
	}

	public void setTagging(PetTagsPojo tagging) {
		this.tagging = tagging;
	}
	

	

}
