package br.com.noviapp.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WelcomeController.PATH)
public class WelcomeController {
	
	public static final String PATH = "/";
	
	@RequestMapping("")
    @ResponseBody
    public String ola(){
        return "Ola, Bem vindo ao sistema NoviMenu";
    }

}
