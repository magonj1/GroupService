package magongwa.jeremia.group.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Group")
public class Group {
	@Id
	private String groupId;
	private String name;
	
	public Group(String name)
	{
		this.name = name;
	}
	
	public String getGroup_id() {
		return groupId;
	}
	public void setGroup_id(String groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Group [group_id=" + groupId + ", name=" + name + "]";
	}

}