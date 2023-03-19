/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TL209
 */
public class InvalidPhoneNumberException extends Exception{
    private String invalidPhoneNumber;

    public InvalidPhoneNumberException() {
    }

    public InvalidPhoneNumberException(String invalidPhoneNumber, String message) {
        super(message);
        this.invalidPhoneNumber = invalidPhoneNumber;
    }

    public String getInvalidPhoneNumber() {
        return invalidPhoneNumber;
    }

    public void setInvalidPhoneNumber(String invalidPhoneNumber) {
        this.invalidPhoneNumber = invalidPhoneNumber;
    }
    
    
}
