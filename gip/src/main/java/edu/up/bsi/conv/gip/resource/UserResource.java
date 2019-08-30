package edu.up.bsi.conv.gip.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.up.bsi.conv.gip.entity.User;
import edu.up.bsi.conv.gip.repository.IUserRepository;

@RestController
@RequestMapping("user")
public class UserResource {
	
	@Autowired
	private IUserRepository repository;
	
	@GetMapping(path = "/get_all", produces="application/json") 
	//@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Iterable<User> listAll() {
		Iterable<User> list = repository.findAll();
		return list;
	}
	//MediaType.APPLICATION_XML_VALUE, 
	@PostMapping(produces="application/json")
	public User add(@RequestBody @Valid User user) {
		return repository.save(user);
	}

	@DeleteMapping(path = "/{id}", produces="application/json")
	public User delete(@PathVariable Integer id) {
		User user = repository.findById(id).orElse(null);
		repository.delete(user);
		return user;
	}
	
	@GetMapping(path = "/{id}", produces="application/json")
	public @ResponseBody User getById(@PathVariable Integer id) {
		User user = repository.findById(id).orElse(null);
		return user;
	}

}
