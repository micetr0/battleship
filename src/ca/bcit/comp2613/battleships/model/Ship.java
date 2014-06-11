package ca.bcit.comp2613.battleships.model;

import java.util.List;

public class Ship extends Object {
	
	public String id;
	private Integer positionX;
	private Integer positionY;
	private Integer endurance;
	public ShipType ShipType;
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


    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionX;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }


    public Integer getEndurance() {
        return endurance;
    }


    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }
    
    public ShipType getShipType() {
        return ShipType;
    }
    
    public void setShipType(ShipType ShipType) {
        this.ShipType = ShipType;
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        //removed endurance
        return "ship id: " + id + " position x: " + positionX +  " position y: " + positionY + " ship type: " + ShipType; 
              
    }

    

}

