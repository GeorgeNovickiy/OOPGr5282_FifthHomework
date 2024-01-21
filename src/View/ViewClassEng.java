package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClassEng implements iGetView {

/**
 * Метод печати списка всех студентов на английском языке
 */
    @Override
    public void printAllStudents(HashMap<Integer, Student> students) {
        System.out.println("------------------List of students--------------------");
        for(Entry<Integer, Student> s :
        students.entrySet())
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------");
    }

/**
 * Метод приглашающий пользователя к вводу текстовой информации
 */

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
    
}
