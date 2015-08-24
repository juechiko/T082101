
package T082101;

import java.sql.ResultSet;
import juechi.pcc.edu.*;
import java.util.ArrayList;

public class T082102 {

       public static void main(String[] args) {
       
        StudentDAO dao = new StudentDAODBImpl();
        ArrayList<Student> list = dao.getAllStudents();
        //查詢所有學生資料
        System.out.println("全部學生資料筆數: " + list.size());
        System.out.println("所有學生姓名如下:");
        for (Student s : list)
        {
            System.out.println(s.student_name);
        }
        //用學生ID找尋單筆資料
        Student rs = dao.findById(2);
         System.out.println("student id = 2 之學生資料如下:");
         System.out.println("name:" + rs.student_name);
         System.out.println("tel:" + rs.student_tel);
         // 新增一筆資料
        Student s = new Student(0, "zzz", "999");
        dao.add(s);
        System.out.println("學生資料新增完成:" + "\n"+ s.student_name  + s.student_tel);
         // 更新一筆資料
        Student s1 = dao.findById(3);
        dao.update(s1);
        System.out.println("學生第三筆資料更新完成:" + "\n" + s1.student_name  + "\n"+ s1.student_tel);
         // 刪除一筆資料
        Student s2 = dao.findById(5);
        dao.remove(s2);
        System.out.println("學生第五筆資料刪除完成:" + "\n" + s1.student_name + "\n"+ s1.student_tel);
    }
    
}
