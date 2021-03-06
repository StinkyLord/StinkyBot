package stinkybot.utils.daybreakutils.query.dto.internal;

import stinkybot.utils.daybreakutils.anatomy.Collection;
import stinkybot.utils.daybreakutils.query.dto.CensusCollectionImpl;

public class FireGroup extends CensusCollectionImpl {

	private String fire_group_id;
	
	public FireGroup() {
		super(Collection.FIRE_GROUP);
		// TODO Auto-generated constructor stub
	}

	public String getFire_group_id() {
		return fire_group_id;
	}

	public void setFire_group_id(String fire_group_id) {
		this.fire_group_id = fire_group_id;
	}

	@Override
	public String toString() {
		return "FireGroup [fire_group_id=" + fire_group_id + ", nestedCollections=" + nestedCollections
				+ ", collection=" + collection + "]";
	}

}
