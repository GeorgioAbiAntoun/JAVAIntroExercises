package Duck;

public class Duck {

    public String gender;
    public int age;

    public Duck (String type, int age){

        this.gender = type;
        this.age = age;

    }

    public void setGender(String gender){

        this.gender = gender;

    }

    public void setAge(int age){

        this.age = age;

    }

    public String getGender(){

        return this.gender;

    }

    public int getAge(){

        return this.age;

    }

}

//This class allows the establishment of inheritance
//The Mallard/Redhead/RubberDuck/WoodenDuck have a "is a" relationship with the Duck super class