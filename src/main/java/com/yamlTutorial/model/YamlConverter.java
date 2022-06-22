package com.yamlTutorial.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.net.URL;

public class YamlConverter {
    public void convertor(){
        //Mapper for working with yaml file (writValueAsString return yaml style)
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        //Mapper for working with json (writValueAsString return json style)
        ObjectMapper mapperJson = new ObjectMapper();

        try {
            URL resource = getClass().getClassLoader().getResource("yamlFile.yml");
            File file = new File(resource.toURI());
            YamlFileModel yamlFileModel = mapper.readValue(file, YamlFileModel.class);
            System.out.println("==========simple toString==========");
            System.out.println(yamlFileModel.toString());
            System.out.println("==========yaml format==========");
            System.out.println(mapper.writeValueAsString(yamlFileModel));
            System.out.println("==========json format==========");
            System.out.println(mapperJson.writerWithDefaultPrettyPrinter().writeValueAsString(yamlFileModel));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
