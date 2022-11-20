package az.coder.task1.FateBook;


public class Friends {
    private String name;
    private String surName;
    private Integer age;


    public Friends() {


    }

    public Friends(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


