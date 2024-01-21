package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

public class ViewClass implements iGetView {

    @Override
    public void printAllStudents(HashMap<Integer, Student> students) {
        System.out.println("------------------Список студентов--------------------");
        for(Entry<Integer, Student> s :
        students.entrySet())
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }


}