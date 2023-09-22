package Manager;

import Model.Student;

public class StudentManager implements IManager<Student>{
    private Student[] list = new Student[100];
    private int size = 0;
    @Override
    public void add(Student e) {
        this.list[size] = e;
        this.size++;

    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        for (int i = index; i < size ; i++) {
            this.list[i] = this.list[i+1];

        }
        size--;


    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        this.list[index] = student;


    }
    public int findById(int id){
        for (int i = 0; i < size; i++) {
            if (id==this.list[i].getId()) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public Student[] findAll() {
        return this.list;
    }

    @Override
    public boolean checkId(int id) {
        return false;
    }

    public int getSize(){
        return this.size;
    }
}
