package kr.codesqaud.cafe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kr.codesqaud.cafe.domain.Article;
import kr.codesqaud.cafe.service.ArticleService;

@Controller
public class ArticleQueryController {
	private final ArticleService articleService;

	public ArticleQueryController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@GetMapping("/")
	public String getArticleList(Model model) {
		List<Article> articles = articleService.findArticles();
		model.addAttribute("articles", articles);
		return "index";
	}

	@GetMapping("/questions/form")
	public String getArticleForm() {
		return "qna/form";
	}

	@GetMapping("/articles/{index}")
	public String showArticle(@PathVariable long index, Model model) {
		articleService.increaseHits(index);
		Article article = articleService.findByIndex(index);
		model.addAttribute("article", article);
		return "qna/detail";
	}
}