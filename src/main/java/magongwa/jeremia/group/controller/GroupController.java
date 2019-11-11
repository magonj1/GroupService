package magongwa.jeremia.group.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.group.model.Group;
import magongwa.jeremia.group.service.GroupService;

@RestController
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
	@RequestMapping("/create")
	public String Create(@RequestParam String name)
	{
		Group group  = groupService.create(name);
	
		return group.toString();
	}
	@RequestMapping("/getAll")
	public List<Group> getGroups()
	{
		return groupService.getAll();
	}
	@RequestMapping("/get")
	public Group getGroup(@RequestParam String name)
	{
		return groupService.getByName(name);
	}
	@RequestMapping("/update")
	public String update(@RequestParam String name)
	{
		return groupService.update(name).toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String name)
	{
		groupService.delete(name);
		return "Deleted "+name;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		groupService.deleteAll();
		return "Deleted all the Records";
	}
	

}
