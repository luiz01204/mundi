package br.com.luiz01204.mundi.controllers;

import br.com.luiz01204.mundi.model.Pedido;
import br.com.luiz01204.mundi.model.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private PedidoRepository repository;

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos = repository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

}
