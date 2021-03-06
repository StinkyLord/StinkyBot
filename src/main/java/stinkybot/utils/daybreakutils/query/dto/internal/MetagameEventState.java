package stinkybot.utils.daybreakutils.query.dto.internal;

import stinkybot.utils.daybreakutils.anatomy.Collection;
import stinkybot.utils.daybreakutils.query.dto.CensusCollectionImpl;

public class MetagameEventState extends CensusCollectionImpl {

	private String metagame_event_state_id;
	private String name;
	
	public MetagameEventState() {
		super(Collection.METAGAME_EVENT_STATE);
		// TODO Auto-generated constructor stub
	}

	public String getMetagame_event_state_id() {
		return metagame_event_state_id;
	}

	public void setMetagame_event_state_id(String metagame_event_state_id) {
		this.metagame_event_state_id = metagame_event_state_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MetagameEventState [metagame_event_state_id=" + metagame_event_state_id + ", name=" + name
				+ ", nestedCollections=" + nestedCollections + ", collection=" + collection + "]";
	}

	
}
