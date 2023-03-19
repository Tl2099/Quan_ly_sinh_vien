/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.sort;

import java.util.Comparator;
import model.Registering;

/**
 *
 * @author TL209
 */
public class SortRegisteringByStudentNameAZ implements Comparator<Registering>{

    @Override
    public int compare(Registering o1, Registering o2) {
        return o1.getStudent().getName().compareTo(o2.getStudent().getName());
    }
}
