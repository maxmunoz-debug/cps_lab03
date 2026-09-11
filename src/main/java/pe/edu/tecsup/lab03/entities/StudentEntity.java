package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private Long id;
    private String name;
    private String email;
    private String status;

    public StudentEntity() {
        this.status = "ACTIVO";
    }
    public StudentEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = "ACTIVO";
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}