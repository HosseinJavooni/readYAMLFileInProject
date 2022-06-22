package com.yamlTutorial.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter @Setter @ToString
public class YamlFileModel {
    /*
    firstName: Hossein
lastName: Javooni
skills:
  - java
  - sql
  - database
  caleague:
    CTO: vahid
    JavaDeveloper: Hamed
    ASP_Developer: Zahra
    Analyzer: Amir Moahmmad
age: 38
     */
    private String firstName;
    private String lastName;
    private List<String> skills;
    private Map<String, String> caleague;
    private int age;
}
