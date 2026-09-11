package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    // Método integrado del Líder
    public void showMessage() {
        System.out.println("Controlador unificado en Sprint 2");
    }

    // Método del Colaborador
    public void create(Long id, String name, String email) {
        StudentEntity student = new StudentEntity(id, name, email);
        service.registerStudent(student);
        System.out.println("Estudiante registrado exitosamente: " + name);
    }

    // Método para eliminar del Líder
    public void delete(Long id) {
        System.out.println("Eliminando estudiante con ID: " + id + " (por Responsable)");
    }
}