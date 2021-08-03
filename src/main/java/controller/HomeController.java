package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.UserService;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getHome(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "home";
    }

    @GetMapping("/addUser")
    public String getAddUser(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            if (bindingResult.hasFieldErrors("age"))
                modelMap.addAttribute("errAge", "Age not in range");
            if (bindingResult.hasFieldErrors("firstName"))
                modelMap.addAttribute("errFirstName", "Invalid");
            if (bindingResult.hasFieldErrors("lastName"))
                modelMap.addAttribute("errLastName", "Invalid");
            if (bindingResult.hasFieldErrors("phone"))
                modelMap.addAttribute("errPhone", "Invalid");
            if (bindingResult.hasFieldErrors("email"))
                modelMap.addAttribute("errEmail", "Invalid");
            return "addUser";
        } else
            modelMap.addAttribute("user",user);
            //userService.addUser(user);
        return "success";
    }
}