package cl.praxis.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente",nullable = false,unique = true)
    private long id;
    @Column(name="nombre", nullable = false, length = 50)
    private String firstName;
    @Column(name = "apellido", nullable = false, length = 50)
    private String lastName;
    @Column(name = "rut", nullable = false)
    private int RUT;
    @Column(name = "edad", nullable = false)
    private int age;
    @Column(name = "correo", nullable = false, length = 100, unique = true)
    private String email;
}
