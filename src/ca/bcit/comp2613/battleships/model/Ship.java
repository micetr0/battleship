package ca.bcit.comp2613.battleships.model;

import java.util.List;

public class Ship extends Object {
	
	private String id;
	private Integer position;
	private Integer positionX;
	private Integer positionY;
	private Integer endurance;
	
	//establish relationship
	private List <Board> boards;
	
	//not required because its build-in
	public Ship() {}

//generated using constructor
    public Ship(String id, Integer position, Integer endurance) {
        super();
        this.id = id;
        this.position = position;
        position = positionX + positionY;
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


    public void setPosition(Integer positionX, Integer positionY) {
        this.position = positionX + positionY;
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
        return "ship id: " + id + " position: " + position + " endurance: " + endurance; 
              
    }

    

}

