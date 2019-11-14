package magongwa.jeremia.group.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.group.model.Group;
import magongwa.jeremia.group.service.GroupService;

@CrossOrigin(origins = {"http://localhost:4200"},maxAge = 4800, allowedHeaders = "*",allowCredentials = "false")
@RestController
@RequestMapping(path = "Api/Group")
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
	@GetMapping
    public ResponseEntity<List<Group>> findAll() {
        return ResponseEntity.ok(groupService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Group group) {
        return ResponseEntity.ok(groupService.save(group));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findById(@PathVariable String id) {
        Optional<Group> group = groupService.findById(id);
        if (!group.isPresent()) {
         
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(group.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Group> update(@PathVariable String id, @Valid @RequestBody Group group) {
        if (!groupService.findById(id).isPresent()) {
    
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(groupService.save(group));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        if (!groupService.findById(id).isPresent()) {
           
            ResponseEntity.badRequest().build();
        }

        groupService.deleteById(id);

        return ResponseEntity.ok().build();
    }
	

}
