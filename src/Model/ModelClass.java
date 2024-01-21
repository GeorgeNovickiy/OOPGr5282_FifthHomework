package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private HashMap<Integer, Student> students;

    public ModelClass(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public HashMap<Integer, Student> getStudents()
    {
        return students;
    }

    @Override
    public void deleteStudents(int i) {
        students.remove(i);
    }
        
}