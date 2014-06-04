package ca.bcit.comp2613.battleships.model;

public class Marker {
    

    private String id;
    private Integer positionX;
    private Integer positionY;
    enum markerResult {hit, miss};

    public Marker(String id, Integer positionX, Integer positionY) {
        
        super();
        this.id = id;
        this.positionX = positionX;
        this.positionY = positionY;
       

    }


    public Marker() {
		// TODO Auto-generated constructor stub
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
        return positionY;
    }


    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }


    @Override
    public String toString() {
        return "Marker id=" + id + ", positionX=" + positionX + ", positionY="
                + positionY + "]";
    }    

}

