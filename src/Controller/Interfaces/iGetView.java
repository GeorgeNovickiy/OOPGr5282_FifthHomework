package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Domain.Student;

public interface iGetView {
    void printAllStudents(HashMap<Integer, Student> students);
    String prompt(String msg);
}