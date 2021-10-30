package com.heima.test.service;

import com.heima.test.dao.StudentDao;
import com.heima.test.domain.Student;
//业务的逻辑处理
public class StudentService {
    //1.创建StudentDAO(库管)
    private StudentDao studentDao = new StudentDao();
    public  boolean addStudent(Student stu){
        //2.将学生对象。传递给StudentDao 库管中的addStudent方法
        //3.将返回的boolean类型结果，返还给StudentController
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        StudentDao studentDao = new StudentDao();
        Student[] stus = studentDao.findAllStudent();
        //假设ID在数组中不存在
        boolean exists = false;
        for(int i = 0; i<stus.length;i++){
            Student student = stus[i];
            if(student != null &&student.getId().equals(id)){
                exists = true;
                break;
            }
        }

        return exists;
    }

    public Student[] findAllStudent() {
        //1，调用库管对象的findAllStudent获取学生对象数组
        Student[] allstudent = studentDao.findAllStudent();
        //2.判断数组中是否有学生信息（有：返回地址，没有：返回null）
        boolean flag = false;
        for(int i = 0;i<allstudent.length;i++){
            Student stu = allstudent[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            return allstudent;
        }else{
            return null;
        }
    }

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public void updateService(String updateId, Student newStu) {
        studentDao.updateStudent(updateId,newStu);
    }
}
