package org.learning.springpizza.controller;

import java.util.List;
import org.learning.springpizza.model.Pizza;
import org.learning.springpizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PizzaController {

  @Autowired
  private PizzaRepository pizzaRepository;

  @GetMapping
  public String index(Model model) {
    // recupero la lista di pizze da database
    List<Pizza> pizzaList = pizzaRepository.findAll();
    model.addAttribute("pizzaList", pizzaList);
    // ritorno la view
    return "index";
  }
}
