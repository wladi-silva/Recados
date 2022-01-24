package chatbox.chatapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import chatbox.chatapp.models.Usuario;
import chatbox.chatapp.repository.UsuarioRepository;


@Controller
public class MensagemController {
    
    @Autowired
    private UsuarioRepository ur;
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String form(Usuario usuario) {
        
        ur.save(usuario);
        
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView listaMensagem() {
        
        ModelAndView mv = new ModelAndView("index");
        Iterable<Usuario> usuario = ur.findAll();
        mv.addObject("usuario", usuario);
        
        return mv;
    }

}