package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void showMessage() {
        System.out.println("Controlador actualizado por Colaborador en Sprint 2");
    }
    public void create(Long id, String name, String email) {
        StudentEntity student = new StudentEntity(id, name, email);
        service.registerStudent(student);
        System.out.println("Estudiante registrado: " + name);
    }
    public void findAndDisplay(Long id) {
        StudentEntity student = service.getStudentById(id);
        if (student != null) {
            System.out.println("Estudiante encontrado: " + student.getName() + " - Estado: " + student.getStatus());
        } else {
            System.out.println("Estudiante no encontrado con ID: " + id);
        }
    }
}