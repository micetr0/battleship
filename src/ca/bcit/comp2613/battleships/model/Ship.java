package ca.bcit.comp2613.battleships.model;

public class Ship extends Object {
	
	private String id;
	private Integer position;
	private Integer endurance;
	
	//not required because its build-in
	public Ship() {}

//generated using constructor
    public Ship(String id, Integer position, Integer endurance) {
        super();
        this.id = id;
        this.position = position;
        this.endurance = endurance;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public Integer getPosition() {
        return position;
    }


    public void setPosition(Integer position) {
        this.position = position;
    }


    public Integer getEndurance() {
        return endurance;
    }


    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ship id: " + id + "position " + position + "endurance" + endurance; 
              
    }

    

}

