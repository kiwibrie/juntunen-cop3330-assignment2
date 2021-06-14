package ex40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.*;
public class FilteringRecords {
    static Scanner in = new Scanner(System.in);

    Map<String, String> name = new HashMap<>();
    Map<String, String> position = new HashMap<>();
    Map<String, String> separation = new HashMap<>();

    public static void main(String[] args){
        FilteringRecords app = new FilteringRecords();

        List<Map> database = app.createDatabase();
        String search = app.getInput();
        ArrayList<String> foundKeys = app.searchDatabase(search);
        app.printOutput(foundKeys);

    }

    public void printOutput(ArrayList<String> foundKeys){
        System.out.print("Name\t\t\t\t | Position\t\t\t   | Separation Date\n");
        System.out.print("---------------------|---------------------|----------------\n");
        for(int i = 0; i < foundKeys.size(); i++){
            System.out.printf("%-10s %-10s| %-20s| %s\n", name.get(foundKeys.get(i)),
                    foundKeys.get(i), position.get(foundKeys.get(i)),
                    separation.get(foundKeys.get(i)));
        }
    }

    public ArrayList<String> searchDatabase(String search){
        ArrayList<String> array = new ArrayList<>();
        String[] str = name.keySet().toArray(new String[0]);
        for(int i = 0; i < name.size(); i++){
            if(str[i].contains(search)){
                array.add(str[i]);
            }
        }
        return array;
    }

    public String getInput(){
        System.out.print("Enter a search string: ");
        return in.nextLine();
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
