package magongwa.jeremia.group.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import magongwa.jeremia.group.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group,String>{

	public Group findByName(String name);
	
}
