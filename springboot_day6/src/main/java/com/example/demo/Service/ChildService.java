package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ChildModel;
import com.example.demo.Repo.ChildRepo;

@Service
public class ChildService {
	@Autowired
	ChildRepo br;
	public ChildModel saveinfo(ChildModel gs)
	{
		return br.save(gs);
	}
	public List<ChildModel> showinfo()
	{
		return br.findAll();
	}
	public ChildModel changeinfo(ChildModel ss) {
		return br.saveAndFlush(ss);
	}
	public void delete(int id) {
		 br.deleteById(id);
	}
	public List<ChildModel> sortinfo(String name)
	{
		return br.findAll(Sort.by(Sort.DEFAULT_DIRECTION,name));
	}
	//pagination
	public List<ChildModel> pagination(int pageno,int pagesize)
	{
		Page<ChildModel> p=br.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();
	}
}
