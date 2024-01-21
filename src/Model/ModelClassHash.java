package Model;

import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel {

    private HashMap<Integer, Student> students;

/**
 * Конструктор для инициализации группы студентов с хранилищем типа HashMap<int,Student>
 * @param students - имя группы студентов
 */

    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }

/**
 * Метод получения списка студентов группы
 */

    public HashMap<Integer, Student> getStudents()
    {
        return students;
    }


    
    @Override
    public void deleteStudents(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudents'");
    }


        
}