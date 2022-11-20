package az.coder.task1.task13;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Student telebe1 = new Student();
        telebe1.name = "Kenan";
        telebe1.lastName = "Garib";
        telebe1.age = 35;

        Student telebe2 = new Student();
        telebe2.name = "Ferid";
        telebe2.lastName = "Audhweihf";
        telebe2.age = 18;

        Student telebe3 = new Student();
        telebe3.name = "Sahil";
        telebe3.lastName = "Garwefkwmeib";
        telebe3.age = 21;

        Student telebe4 = new Student();
        telebe4.name = "Chingiz";
        telebe4.lastName = "WEFWwedwfb";
        telebe4.age = 25;

        Student telebe5 = new Student();
        telebe5.name = "Reshad";
        telebe5.lastName = "Gawefweefrib";
        telebe5.age = 27;




        Student[] telebeArray = new Student[]{telebe1,telebe2,telebe3,telebe4,telebe5};
        Integer temp = 0;




        for (int i = 0; i < telebeArray.length - 1; i++) {
            for (int j = 0; j < telebeArray.length-1; j++) {
                if (telebeArray[j].age > telebeArray[j + 1].age){
                    temp = telebeArray[j].age;
                    telebeArray[j].age = telebeArray[j+1].age;
                    telebeArray[j+1].age = temp;

                }
            }



        }
        for (Student telebe: telebeArray) {

            System.out.println(telebe.name);
        }

    }

}
