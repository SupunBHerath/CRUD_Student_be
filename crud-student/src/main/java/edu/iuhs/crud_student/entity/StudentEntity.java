package edu.iuhs.crud_student.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private  String s_name;
    private   int  s_age;
    private  String s_contact_number;
    private  String g_name;
    private  String g_address;
    private  String g_contact_number;
}
