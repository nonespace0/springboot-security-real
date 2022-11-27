package com.controller;

import com.model.Student;
import com.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    StudentServices studentService;

    @GetMapping("/")
    public String getPage(Model model) {
        List<Student> student = studentService.listAll();
        model.addAttribute("students", student);
        return "Table";
    }

    @GetMapping("/new")
    public String addStudent(Model model, Student student) {

        model.addAttribute("students", student);
        return "register";
    }
    @PostMapping("/save")
    public String saveStudent(Model model, Student student) {

        model.addAttribute("students", student);
        studentService.save(student);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String Update(@PathVariable Long id,Model model){
        Student student = studentService.update(id);
        model.addAttribute("students",student);
        return "register";

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        studentService.delete(id);
        return "redirect:/";
    }

}
