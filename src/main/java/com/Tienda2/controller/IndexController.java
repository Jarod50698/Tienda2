package com.Tienda2.controller;

import com.Tienda2.dao.ClienteDao;
import com.Tienda2.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
@Autowired
private ClienteDao clienteDao;
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
       // String mensaje = "Estamos en la semana 4";
       // model.addAttribute("text", mensaje);

        //Cliente cliente = new Cliente("Jonathan", "brenes", "j50@gmail.com", "6666666");
        //model.addAttribute("cliente", cliente);

        //Cliente cliente2 = new Cliente("Juan", "Fonseca", "juancho@gmail.com", "69999666");
        //Cliente cliente3 = new Cliente("Pedro", "Fonseca", "juancho@gmail.com", "69999666");
       //var clientes = Arrays.asList(cliente, cliente2,cliente3);
        //var clientes = Arrays.asList();
       var clientes=clienteDao.findAll();
        model.addAttribute("clientes", clientes);

        return "index";
    }
}
