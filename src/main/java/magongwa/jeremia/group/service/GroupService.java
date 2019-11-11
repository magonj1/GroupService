package magongwa.jeremia.group.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magongwa.jeremia.group.model.Group;
import magongwa.jeremia.group.repository.GroupRepository;

@Service
public class GroupService {

	@Autowired
	private GroupRepository groupRepository;
	
	public Group create(String name)
	{
		return groupRepository.save(new Group(name));
	}
	public List<Group> getAll()
	{
		return groupRepository.findAll();
	}
	
	public Group getByName(String name)
	{
		return groupRepository.findByName(name);
	}
	
	public Group update(String name)
	{
		Group group = groupRepository.findByName(name);
		group.setName(name);
		
		return groupRepository.save(group);
	}
	public void deleteAll()
	{
		groupRepository.deleteAll();
	}
	public void delete(String name)
	{
		Group group = groupRepository.findByName(name);
		groupRepository.delete(group);
	}
}
