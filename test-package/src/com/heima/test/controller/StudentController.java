package com.heima.test.controller;

import com.heima.test.domain.Student;
import com.heima.test.service.StudentService;

import java.util.Scanner;

//与客服打交道
public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    //开启学生管理系统
    public void start() {


        studentLoop:while(true){
            System.out.println("------欢迎黑马学生管理系统------");
            System.out.println("请输入您的选择：1，增加学生  2，删除学生  3，修改学生  4,查看学生  5，退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    //System.out.println("增加");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除");
                    deleteStudentById();

                    break;
                case "3":
                    //System.out.println("修改");
                    updateStudent();

                    break;
                case "4":
                    //System.out.println("查看");
                    findAllStudent();
                case "5":
                    System.out.println("感谢您使用学生管理系统");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break ;



            }
        }

    }

    public void updateStudent() {
       String updateId = inputStudentId();

       /* String updateId;
        while(true){                  ~！~！~！~！~优化代码
            //1.键盘录入要删除的学生id
            System.out.println("请输入您要删除的学生id：");
            updateId = sc.next();
            //2.判断id在容器中是否存在，如果不存在，这需要一直录入
            boolean exists = studentService.isExists(updateId);
            if(!exists){
                System.out.println("您输入的ID不存在，请重新输入");
            }else{
                break;
            }
        }*/
        /*System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        Student newStu = new Student();
        newStu.setId(updateId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirthday(birthday);*/

        Student newStu = inputStudentInfo(updateId);
        studentService.updateService(updateId,newStu);
        System.out.println("修改成功");
    }

    public void deleteStudentById() {
        String delId = inputStudentId();


       /* String delId;
        while(true){                   ~~~~!!!!!优化代码
            //1.键盘录入要删除的学生id
            System.out.println("请输入您要删除的学生id：");
            delId = sc.next();
            //2.判断id在容器中是否存在，如果不存在，这需要一直录入
            boolean exists = studentService.isExists(delId);
            if(!exists){
                System.out.println("您输入的ID不存在，请重新输入");
            }else{
                break;
            }
        }*/
        //3.调用业务员中单deleteStudentById根据id，删除1学生
        studentService.deleteStudentById(delId);
        //4。提示删除成功
        System.out.println("删除成功");
    }

    public void findAllStudent() {
        //1.调用业务员中的获取方法，得到学生的对象数组
        Student[] stus = studentService.findAllStudent();
        //2.判断数组的内存地址，是否为null
        if(stus == null){
            System.out.println("查无信息，请添加后重试");
            return;
        }
        //遍历数组，获取学生信息并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for(int i = 0;i<stus.length;i++){
            Student stu = stus[i];
            if(stu != null){
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }
        }
    }

    public void addStudent() {
        //StudentService studentService = new StudentService();
        //1.键盘接受学生信息

        String id;
        while(true){
            System.out.println("请输入学生ID");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("学号已经被占用，请重新输入");
            }else{
                break;
            }
        }

        Student stu = inputStudentInfo(id);
        /*System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String bitrtday = sc.next();
        //2.将学生信息封装为学生对象
        Student stu = new Student();
        //学生的4个信息
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);                ~!~!~优化代码
        stu.setBirthday(bitrtday);
        //3.将学生对象，传递给StudentService（业务员）张红的addStudent方法*/

        boolean result = studentService.addStudent(stu);

        //4.根据返回的boolean类型结果，在控制台打印成功\失败
        if(result){
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
    }

    //键盘录入学生id
    public String inputStudentId() {
        String id;
        while (true) {
            //1.键盘录入要删除的学生id
            System.out.println("请输入学生id：");
            id = sc.next();
            //2.判断id在容器中是否存在，如果不存在，这需要一直录入
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("您输入的ID不存在，请重新输入");
            } else {
                break;
            }
        }
        return id;
    }
    //键盘录入学生信息
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String bitrtday = sc.next();
        //2.将学生信息封装为学生对象
        Student stu = new Student();
        //学生的4个信息
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(bitrtday);
        return stu;
    }
}
