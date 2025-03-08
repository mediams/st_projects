package com.example.demospringex.controll;

import com.example.demospringex.entity.Teacher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {

    @GetMapping("/teacher")
    public Teacher getTeacher() {
        Teacher teacher = new Teacher(1, "John");
        return teacher;
    }

    @GetMapping("/teachers")
    public List<Teacher> getAll() {
        var teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher(1, "John"));
        teachers.add(new Teacher(2, "Mike"));
        teachers.add(new Teacher(3, "Bob"));

        return teachers;
    }

    @GetMapping("/teacher/{id}/{name}")
    public Teacher getNewTeacher(@PathVariable int id,
                                 @PathVariable String name) {
        return new Teacher(id, name);
    }

    @GetMapping("/teacher/query")
    public Teacher getTeacher(@RequestParam int id,
                              @RequestParam String name) {
        return new Teacher(id, name);
    }

    @PostMapping("/teacher/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        return teacher;
    }

    @PutMapping("/teacher/{id}/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("id") int id) {
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        return teacher;
    }

}
