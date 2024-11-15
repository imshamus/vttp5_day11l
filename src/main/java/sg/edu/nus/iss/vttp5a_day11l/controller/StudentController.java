package sg.edu.nus.iss.vttp5a_day11l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5a_day11l.model.Student;

@Controller     // /students/allStudents but the /allStudents actually just extra, can omit
@RequestMapping("/students")
public class StudentController {
    
    List<Student> students;

    public StudentController() {
        students = new ArrayList<>();
    }    

    @ResponseBody
    // @GetMapping("/allStudents")
    @RequestMapping(path={"", "/allStudents"}, method=RequestMethod.GET)
    public List<Student> getStudentList() throws ParseException
    {
        // Convert a Date string to epoch (Long)
        String dob = "18 Dec 1975 10:25:00.000 GMT+08:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS Z");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();
        
        Student s1 = new Student(1, "Damien", "Loo", epochDob, "DLoo@nus.edu.sg", "25 HKMT 119624");
        students.add(s1);

        Student s2 = new Student(2, "Justin", "Low", epochDob, "JLow@nus.edu.sg", "25 HKMT 119624");
        students.add(s2);

        Student s3 = new Student(3, "Kenneth", "Koh", epochDob, "KKoh@nus.edu.sg", "25 HKMT 119624");
        students.add(s3);

        /* // convert epoch Long to Date
        Long epochTime = 188103300000L;
        Date dTime = new Date(epochTime);
        String formattedTime = sdf.format(dTime);
        System.out.println(formattedTime); */

        return students;
    }
    
}
