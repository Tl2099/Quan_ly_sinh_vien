/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sort;

import java.util.Comparator;
import model.Subject;

/**
 *
 * @author TL209
 */
public class SortSubjectByNameDESC implements Comparator<Subject>{
    @Override
    public int compare(Subject o1, Subject o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
