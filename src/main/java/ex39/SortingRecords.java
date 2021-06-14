package ex39;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.*;
public class SortingRecords {

    Map<String, String> name = new HashMap<>();
    Map<String, String> position = new HashMap<>();
    Map<String, String> separation = new HashMap<>();

    public static void main(String[] args){
        SortingRecords app = new SortingRecords();

        List<Map> database = app.createDatabase();
        String[] sortedLastNames = app.sortLastNames();
        app.printOutput(sortedLastNames);
    }

    public void printOutput(String[] sortedLastNames){
        System.out.print("Name\t\t\t\t | Position\t\t\t   | Separation Date\n");
        System.out.print("---------------------|---------------------|----------------\n");
        for(int i = 0; i < name.size(); i++){
            System.out.printf("%-10s %-10s| %-20s| %s\n", name.get(sortedLastNames[i]),
                    sortedLastNames[i], position.get(sortedLastNames[i]),
                    separation.get(sortedLastNames[i]));
        }
    }

    public String[] sortLastNames(){
        String[] str = name.keySet().toArray(new String[0]);
        String temp;
        for (int i = 0; i < name.size(); i++)
        {
            for (int j = i + 1; j < name.size(); j++) {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }

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
}
