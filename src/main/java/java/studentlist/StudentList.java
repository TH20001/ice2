/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package java.studentlist;

/**
 *
 * @author
 */
public class StudentList {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("my");
        s1.setId(12);
        s1.setSem(3);
        
        Student s2 = new Student();

        s2.setName("rats");
        s2.setId(2);
        s2.setSem(2);
        
        Student s3 = new Student();
        s3.setName("left me lol");
        s3.setId(3);
        s3.setSem(1);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0; i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getId() + " " + list[i].getSem());
        }
    }
}
