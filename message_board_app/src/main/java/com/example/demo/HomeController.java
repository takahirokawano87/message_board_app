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
//		第一引数が「何という名前で渡すか」第二引数が「内容」
		modelMap.addAttribute("message", "hello! world!");
//		helloという名のhtmlファイルを指定する
		return "hello";
	}
}
