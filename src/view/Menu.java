package view;

import Manager.StudentManager;
import Model.Student;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    private Scanner inputIn = new Scanner(System.in);
    private Scanner inputString =new Scanner(System.in);
    public void showMainMenu(){
        int choice;
        do {
            System.out.println("-----Quản Lý Sinh Viên-----\n1. Thêm Sinh Viên\n2. Xóa Sinh Viên\n3. Sửa Sinh viên" +
                    "\n4. Tìm Kiếm theo Id\n5. Hiển thị tất cả\n0. thoat");
            System.out.println("nhập vào lựa chọn");
            choice = inputIn.nextInt();
            switch (choice){
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    break;
                case 5:
                    showAll();
                    break;

            }
        } while (choice!=0);

    }
    public void showMenuEdit(){
        System.out.println("-----menu sửa----");
        System.out.println("nhập id muốn sửa");
        int id = inputIn.nextInt();
        System.out.println("-----menu thêm mới----");
        System.out.println("nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = inputString.nextLine();
        System.out.println("nhập điểm toán:");
        double math = inputIn.nextDouble();
        System.out.println("nhập điểm tiếng anh:");
        double english = inputIn.nextDouble();
        System.out.println("nhập điểm lịch sử:");
        double history = inputIn.nextDouble();
        Student newStudent = new Student(id ,name, gender, math, english, history);

        studentManager.edit(id, newStudent);
        System.out.println("=====> sửa thanành công");

    }
    public void showAll(){
        Student[] students = studentManager.findAll();
    int size = studentManager.getSize();
        System.out.println("danh sách sinh viên là: ");
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
            
        }
    }
    public void showMenuAdd(){
        System.out.println("-----menu thêm mới----");
        System.out.println("nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("nhập giới tính: ");
        String gender = inputString.nextLine();
        System.out.println("nhập điểm toán:");
        double math = inputIn.nextDouble();
        System.out.println("nhập điểm tiếng anh:");
        double english = inputIn.nextDouble();
        System.out.println("nhập điểm lịch sử:");
        double history = inputIn.nextDouble();
        Student student = new Student(name, gender, math, english, history);
        studentManager.add(student);
        System.out.println("---thêm sinh viên mới thành công---");
    }
}
