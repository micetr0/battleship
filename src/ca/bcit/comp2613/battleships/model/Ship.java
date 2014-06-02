package ca.bcit.comp2613.battleships.model;

import java.util.List;

public class Ship extends Object {
	
	private String id;
	private Integer positionX;
	private Integer positionY;
	private Integer endurance;
	private List <Board> boards;
	
	//not required because its build-in
	public Ship() {}

//generated using constructor
    public Ship(String id, Integer positionX, Integer positionY, Integer endurance) {
        super();
        this.id = id;
        this.positionX = positionX;
        this.positionY = positionY;
        this.endurance = endurance;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public Integer getPositionX() {
        return positionX;
    }


    public void setPositionX(Integer position) {
        this.positionX = positionX;
    }
    
    public Integer getPositionY() {
        return positionY;
    }


    public void setPositionY(Integer position) {
        this.positionY = positionY;
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
        return "ship id: " + id + " position: " + positionX +", " + positionY + " endurance: " + endurance; 
              
    }

    

}

