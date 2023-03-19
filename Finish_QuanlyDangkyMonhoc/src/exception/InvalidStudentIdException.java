/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author TL209
 */
public class InvalidStudentIdException extends Exception {

    private String invalidStudentId;

    public InvalidStudentIdException() {
    }

    public InvalidStudentIdException(String invalidStudentId, String message) {
        super(message);
        this.invalidStudentId = invalidStudentId;
    }

    public String getInvalidStudentId() {
        return invalidStudentId;
    }

    public void setInvalidStudentId(String invalidStudentId) {
        this.invalidStudentId = invalidStudentId;
    }

}
