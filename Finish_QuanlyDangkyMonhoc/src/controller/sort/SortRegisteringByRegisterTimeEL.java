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
public class SortRegisteringByRegisterTimeEL implements Comparator<Registering>{

    @Override
    public int compare(Registering o1, Registering o2) {
        return (int)(o1.getRegistedDate().getTime() - o2.getRegistedDate().getTime());
    }
}
