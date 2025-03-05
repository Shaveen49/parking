public class Vehicle {

    private String name;
    private String model;


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }

    public void inParking(){
        System.out.println("Parking:"+name + " " + model);
    }

    public void outParking(){
        System.out.println("Parking:"+name + " " + model);
    }



}
