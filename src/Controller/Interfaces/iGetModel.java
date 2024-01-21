package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public HashMap<Integer, Student> getStudents();
    public void deleteStudents(int i);

}