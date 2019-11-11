package magongwa.jeremia.group.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Group")
public class Group {
	@Id
	private ObjectId group_id;
	private String name;
	
	public Group(String name)
	{
		this.name = name;
	}
	
	public ObjectId getGroup_id() {
		return group_id;
	}
	public void setGroup_id(ObjectId group_id) {
		this.group_id = group_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Group [group_id=" + group_id + ", name=" + name + "]";
	}

}