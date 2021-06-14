package ex40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FilteringRecordsTest {
    FilteringRecords app = new FilteringRecords();
    Map<String, String> name = new HashMap<>();
    Map<String, String> position = new HashMap<>();
    Map<String, String> separation = new HashMap<>();

    public List<Map> createDatabase(){
        List<Map> list = new ArrayList<Map>();
        addWorker("John", "Johnson", "Manager", "2016-12-31");
        addWorker("Tou","Xiong", "Software Engineer", "2016-10-05");
        addWorker("Michaela", "Michaelson", "District Manager","2015-12-19");
        addWorker("Jake", "Jacobson", "Programmer", "");
        addWorker("Jacquelyn", "Jackson", "DBA", "");
        addWorker("Sally", "Webber", "Web Developer", "2015-12-18");
        list.add(name);
        list.add(position);
        list.add(separation);
        return list;
    }
    public void addWorker(String fname, String lname, String pos, String sep){
        name.put(lname, fname);
        position.put(lname, pos);
        separation.put(lname, sep);
    }

    @Test
    public void test1(){
        createDatabase();
        app.printOutput(app.searchDatabase("Jac"));
    }

    @Test
    public void test2(){
        createDatabase();
        app.printOutput(app.searchDatabase("Michael"));
    }

    @Test
    public void test3(){
        createDatabase();
        app.printOutput(app.searchDatabase("John"));
    }

}