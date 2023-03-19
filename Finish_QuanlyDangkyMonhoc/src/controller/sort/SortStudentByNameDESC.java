/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sort;

import java.util.Comparator;
import model.Student;

/**
 *
 * @author TL209
 */
public class SortStudentByNameDESC implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
