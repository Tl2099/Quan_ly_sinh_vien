/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TL209
 */
public class InvalidDateOfBirthException extends Exception {

    private String invalidDob;

    public InvalidDateOfBirthException() {
    }

    public InvalidDateOfBirthException(String invalidDob, String message) {
        super(message);
        this.invalidDob = invalidDob;
    }

    public String getInvalidDob() {
        return invalidDob;
    }

    public void setInvalidDob(String invalidDob) {
        this.invalidDob = invalidDob;
    }

}
