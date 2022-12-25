package az.coder.task1.ExceptionTryCatchTest;

public class Student {
    public static Student find(String id) throws StudentException {
        if (id.equals("123")) {
            return new Student();
        }else {
            throw new StudentException("Bele bir telebe yoxdur!");
        }
    }

}
