import java.util.Objects;

/**
 * @Author: Chenxy
 * @Date: 2022/12/23  16:47
 * @Version 1.0
 */
public class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return  true;
        }
        if (obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Person person=(Person) obj;
        return Objects.equals(name,person.name);
    }
}
