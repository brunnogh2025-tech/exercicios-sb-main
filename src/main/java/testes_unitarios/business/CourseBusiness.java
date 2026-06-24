package testes_unitarios.business;

import testes_unitarios.service.CourseService;

import java.util.ArrayList;
import java.util.List;


//CourseBusiness = System (Method) Under Test
public class CourseBusiness{
    private CourseService service;

    public CourseBusiness(CourseService service){
        this.service = service;
    }

    public List<String> retriveCoursesRelatedToString(String student){
        var filteredCourses = new ArrayList<String>();
        if("Foo Bar".equals(student)){
            return filteredCourses;
        }
        var allCourses = service.retrieveCourses(student);

        for (String course : allCourses){
            if (course.contains("Spring")){
                filteredCourses.add(course);
            }
        }

        return filteredCourses;
    }
}
