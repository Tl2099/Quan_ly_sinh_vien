/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author TL209
 */
public class Registering implements Serializable{
    private Student student;
    private Subject subject;
    private Date registedDate;

    public Registering() {
    }

    public Registering(Student student, Subject subject, Date registedDate) {
        this.student = student;
        this.subject = subject;
        this.registedDate = registedDate;
    }
    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getRegistedDate() {
        return registedDate;
    }

    public void setRegistedDate(Date registedDate) {
        this.registedDate = registedDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.student);
        hash = 79 * hash + Objects.hashCode(this.subject);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registering other = (Registering) obj;
        if (!Objects.equals(this.student, other.student)) {
            return false;
        }
        return Objects.equals(this.subject, other.subject);
    }
    
}
