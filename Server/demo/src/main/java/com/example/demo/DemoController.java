package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;


@RestController
public class DemoController 
{
	@PostMapping("/lower")
	public String labtest(@RequestBody Map<String,String> data)
	{
		String str=data.get("result");
		
		change myObj= new change();
		String substring= myObj.answer(str);
		
		return substring;
	}	
}
