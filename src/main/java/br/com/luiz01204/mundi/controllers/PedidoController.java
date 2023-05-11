package br.com.luiz01204.mundi.controllers;

import br.com.luiz01204.mundi.dto.NovoPedido;
import br.com.luiz01204.mundi.model.Pedido;
import br.com.luiz01204.mundi.model.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    PedidoRepository repository;

    @GetMapping("cadastrar")
    public String formulario(NovoPedido novoPedido){
        return "pedido/cadastrar";
    }

    @PostMapping("novo")
    public String novo(@Valid NovoPedido dados, BindingResult result){
        if (result.hasErrors()){
            return "pedido/cadastrar";
        }
        repository.save(new Pedido(dados));
        return "redirect:/home";
    }
}
