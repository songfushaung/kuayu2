package com.cn.b.BController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class BtoAcontroller {
	//响应头允许跨域
/*     @RequestMapping("/user")
	 public Map<String,String> getResult(HttpServletResponse response){
    	 response.setHeader("Access-Control-Allow-Origin", "*");
		 Map<String,String> map=new HashMap<>();
		 map.put("user", "songfushuang");
		return map;
	 } */
	//使用jsonp
/*    @RequestMapping("/user")
	 public void getResult(HttpServletResponse response, String jsonpCallback) throws Exception{
    	System.out.println(jsonpCallback);
    	 JSONObject map = new JSONObject();
		 map.put("user", "songfushuang");
		 response.setHeader("Content-type", "text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.print(jsonpCallback + "(" + map.toString() + ")");
			writer.close();
	 } */
	//nginx api网关
	  @RequestMapping("/user")
		 public Map<String,String> getResult(HttpServletResponse response){
			 Map<String,String> map=new HashMap<>();
			 map.put("user", "songfushuang");
			return map;
		 }
}
