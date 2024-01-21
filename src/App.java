import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassFile;
import Model.Domain.Student;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("Andrey", 25);
        Student student2 = new Student("Nastya", 22);
        Student student3 = new Student("Vasya", 20);
        Student student4 = new Student("Masha", 21);
        Student student5 = new Student("Kolya", 24);

        HashMap<Integer, Student> studList = new HashMap<>();
        studList.put(0, student1);
        studList.put(1, student2);
        studList.put(2, student3);
        studList.put(3, student4);
        studList.put(4, student5);

        iGetModel modelFile = new ModelClassFile("StudentDB.csv");
        iGetModel model = new ModelClass(studList);
        iGetView view = new ViewClassEng();

        ControllerClass controller = new ControllerClass(model, view);

        controller.run();
        

    }
}
