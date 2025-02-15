package Aggregation.Ex1;

import java.util.ArrayList;

public class StudentList {

     ArrayList<Student> StudentList = new ArrayList<>();

    public void displayStudent() {
        for (Student i : StudentList) {
            i.display();
        }
    }

    public Student FindStudentID(String IDtoFind) {
        for (Student i : StudentList) {
            if (i.StudentID.equals(IDtoFind)) {
                return i;
            }
        }
        return null;
    }

    public boolean delete(String idToDelete) {
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).StudentID.equals(idToDelete)) {
                StudentList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void editStudentById(String idToEdit) {
        Student student = FindStudentID(idToEdit);
        if (student != null) {
            student.editStudentById(idToEdit);
        }
    }
    public void add(Student student) {
        StudentList.add(student);
    }
    
}
