package bitlab.Spring_Sprint_Task1.controller;
import bitlab.Spring_Sprint_Task1.db.DbManager;
import bitlab.Spring_Sprint_Task1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model) {
        List<Student> studentList = DbManager.getStudents();
        model.addAttribute("studenty", studentList);
        return "home";
    }

    @GetMapping("/student/add")
    public String getAddStudentPage(){
        return "addStudent";
    }

    @PostMapping("/student/add")
    public String addStudent(Student student) {
        DbManager.addStudent(student);
        return "redirect:/";
    }

}
