package com.and.middle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import retrofit.CrudRetrofitDAO;
import retrofit.CrudRetrofitVO;

@RestController @RequestMapping("/retrofit")
public class RetrofitController {
	@Autowired CrudRetrofitDAO dao;
	
	@RequestMapping(value ="/list", produces = "text/html;charset=utf-8")
	public String List() {
		return new Gson().toJson(dao.select());
	}
	@RequestMapping("/insert")
	public String insert(CrudRetrofitVO vo) {
		return new Gson().toJson(dao.insert(vo));
	}
	@RequestMapping("/update")
	public String update(CrudRetrofitVO vo) {
		return new Gson().toJson(dao.insert(vo));
	}
	@RequestMapping("/delete")
	public String delete(CrudRetrofitVO vo) {
		return new Gson().toJson(dao.insert(vo));
	}

}
