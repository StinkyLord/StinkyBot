package stinkybot.utils.daybreakutils.query.dto.internal;

import stinkybot.utils.daybreakutils.anatomy.Collection;
import stinkybot.utils.daybreakutils.query.dto.CensusCollectionImpl;

public class ResourceType extends CensusCollectionImpl {

	private String resource_type_id;
	private String description;
	
	public ResourceType() {
		super(Collection.RESOURCE_TYPE);
		// TODO Auto-generated constructor stub
	}

	public String getResource_type_id() {
		return resource_type_id;
	}

	public void setResource_type_id(String resource_type_id) {
		this.resource_type_id = resource_type_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ResourceType [resource_type_id=" + resource_type_id + ", description=" + description
				+ ", nestedCollections=" + nestedCollections + ", collection=" + collection + "]";
	}


}
