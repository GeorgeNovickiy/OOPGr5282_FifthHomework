package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClassEng;

public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private HashMap<Integer, Student> buferData = new HashMap<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(HashMap<Integer, Student> stud)
    {
        if(stud.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 
    public void update()
    {
        //MVP
        buferData = model.getStudents();
        if(testData(buferData))
        {
            view.printAllStudents(buferData);
        }
        else
        {
            System.out.println("Список студентов пуст!");
        }


        //MVC
        //view.printAllStudents(model.getStudents());
    }
    
    public void run()
    {
        Command com = (Command)Command.NONE;
        buferData = model.getStudents();
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                   getNewIter = false;
                   System.out.println("Выход из программы");
                   break;
                case LIST:
                   view.printAllStudents(model.getStudents());
                   break;
                case DELETE:
                    System.out.println("Введите идентификатор удаляемого студента:");
                    Scanner sc = new Scanner(System.in);
                    int idStud = sc.nextInt();
                    if (buferData.size()>idStud)
                    {
                        model.deleteStudents(idStud);
                        break;
                    }
                    System.out.println("Студента с указанным идентификатором не существует.");
                    break;
            }
        }
    }
}