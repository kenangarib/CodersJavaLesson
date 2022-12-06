package az.coder.task1.task16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Employer<String> managerEmployer = new Manager<>("Manager");
        //Employer<String> developerEmployer = new Developer<>("Developer");
        //Employer<String> testerEmployer = new Tester<>("Tester");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(String.valueOf(new Manager<>("Manager")));
        arrayList.add(String.valueOf(new Developer<>("Developer")));
        arrayList.add(String.valueOf(new Tester<>("Tester")));
        arrayList.sort(null);
        System.out.println(arrayList);

    }
}
