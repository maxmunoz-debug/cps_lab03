package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void showMessage() {
<<<<<<< HEAD
        System.out.println("Controlador unificado en Sprint 2");
=======
        System.out.println("Controlador actualizado por Colaborador en Sprint 2");
>>>>>>> 4b5845980da024ec9fa7436bc421425da55ff8d1
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

    // Método para eliminar del Líder
    public void delete(Long id) {
        System.out.println("Eliminando estudiante con ID: " + id + " (por Responsable)");
    }
}