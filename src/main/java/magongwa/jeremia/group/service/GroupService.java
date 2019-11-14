package magongwa.jeremia.group.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magongwa.jeremia.group.model.Group;
import magongwa.jeremia.group.repository.GroupRepository;

@Service
public class GroupService {

	@Autowired
	private GroupRepository groupRepository;
	
	
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Optional<Group> findById(String id) {
        return groupRepository.findById(id);
    }

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public void deleteById(String id) {
    	groupRepository.deleteById(id);
    }
}
