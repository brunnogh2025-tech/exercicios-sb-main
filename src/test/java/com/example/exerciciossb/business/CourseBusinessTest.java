package com.example.exerciciossb.business;

import com.example.exerciciossb.service.stubs.CourseServiceStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testes_unitarios.business.CourseBusiness;
import testes_unitarios.service.CourseService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CourseBusinessTest {

    @Test
    void testCoursesRelatedToSpring_When_UsingAFooBarStudent(){
        //Given
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        List<String> expected = List.of("Formação Microsserviços 2026: do Zero ao Deploy na Google Cloud com Spring Boot, Kubernetes e Docker ➡\uFE0F https://pub.erudio.com.br/kr/yut_ms_java\n",
                "\uD83C\uDFAF Formação Spring Boot com Kotlin: REST APIs Profissionais do Zero ao Deploy na AWS com Docker e Kubernetes ➡\uFE0F https://pub.erudio.com.br/kr/yut_rest...\n");
        //When
        List<String> current = business.retriveCoursesRelatedToString("Foo Bar");
        //Went
        Assertions.assertEquals(expected.size(),current.size());

    }

}
