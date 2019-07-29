package com.example.demo;

//パッケージのimport
//Controllerの機能をimport
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//RequestMapping=ルーティングのこと
import org.springframework.web.bind.annotation.RequestMapping;
//アノテーション
@Controller
public class HomeController {
//	indexメソッド
//	このURLにアクセスしたらメソッドが実行される
	@RequestMapping("/")
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("message", "hello world");
		return "hello";
	}
}
