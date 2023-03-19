/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import exception.InvalidDateOfBirthException;
import exception.InvalidEmailException;
import exception.InvalidNameException;
import exception.InvalidPersonIdException;
import exception.InvalidPhoneNumberException;
import exception.InvalidStudentIdException;
import java.util.List;
import model.Registering;

/**
 *
 * @author TL209
 */
public interface InfoFilter {

    boolean isStudentIdValid(String id) throws InvalidStudentIdException;

    boolean isPersonIdValid(String id) throws InvalidPersonIdException;

    boolean isNameValid(String name) throws InvalidNameException;

    boolean isEmailValid(String email) throws InvalidEmailException;

    boolean isPhoneNumberValid(String phoneNumber) throws InvalidPhoneNumberException;

    boolean isDateOfBirthValid(String dobString) throws InvalidDateOfBirthException;
    
    boolean isRecordExist(List<Registering> registerings, Registering r);
}
