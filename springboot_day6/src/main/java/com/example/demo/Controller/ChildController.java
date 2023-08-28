package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.ChildModel;
import com.example.demo.Service.ChildService;

@RestController
@RequestMapping("/api/child")
public class ChildController {
	@Autowired
	ChildService cse;
	@PostMapping()
	public ChildModel add(@RequestBody ChildModel gs)
	{
		return cse.saveinfo(gs);
	}
	@GetMapping()
	public List<ChildModel> show(){
		return cse.showinfo();
	}
	@PutMapping("map")
	public ChildModel modify(@RequestBody ChildModel ss)
	{
		return cse.changeinfo(ss);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id)
	{
		cse.delete(id);
	}
	@GetMapping("sort/{name}")
	public List<ChildModel> getsortinfo(@PathVariable String name)
	{
		return cse.sortinfo(name);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<ChildModel> showpage(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return cse.pagination(pageno,pagesize);
	}
}
