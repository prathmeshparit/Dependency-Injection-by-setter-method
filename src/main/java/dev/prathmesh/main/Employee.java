package dev.prathmesh.main;

public class Employee
{
    private int id;
    private String name;

    public void setName(String name){ this.name = name;}
    public void setId(int id){this.id = id;}

    public int getId(){ return id;}
    public String getString(){ return name;}

    public void show()
    {
        System.out.println(id + " " + name);
    }

}
