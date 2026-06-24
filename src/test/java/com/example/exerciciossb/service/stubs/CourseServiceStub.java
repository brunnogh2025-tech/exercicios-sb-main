package com.example.exerciciossb.service.stubs;

import testes_unitarios.service.CourseService;

import java.util.Arrays;
import java.util.List;

public class CourseServiceStub implements CourseService {

    public List<String> retrieveCourses(String student) {
        return Arrays.asList("Formação Microsserviços 2026: do Zero ao Deploy na Google Cloud com Spring Boot, Kubernetes e Docker ➡\uFE0F https://pub.erudio.com.br/kr/yut_ms_java\n" ,
                "\uD83C\uDFAF Formação Docker e Kubernetes 2026: do Zero ao Deploy Profissional na AWS, Azure e GCP com GitHub Actions ➡\uFE0F https://pub.erudio.com.br/kr/yut_dock...\n" ,
                "\uD83C\uDFAF Docker do Zero à Maestria - Contêinerização Desmistificada ➡\uFE0F https://pub.erudio.com.br/kr/yut_docker\n" ,
                "\uD83C\uDFAF Java Continuous Integration e Delivery com AWS e Github Actions ➡\uFE0F https://pub.erudio.com.br/kr/yut_ci_c...\n" ,
                "\uD83C\uDFAF Formação Spring Boot com Kotlin: REST APIs Profissionais do Zero ao Deploy na AWS com Docker e Kubernetes ➡\uFE0F https://pub.erudio.com.br/kr/yut_rest...\n" ,
                "\uD83C\uDFAF Carreira em TI do Zero ao Exterior: Currículo, Entrevistas, Negociação e Crescimento Profissional ➡\uFE0F https://pub.erudio.com.br/kr/yut_jobs");
    }
}
