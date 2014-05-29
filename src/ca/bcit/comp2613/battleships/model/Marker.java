package ca.bcit.comp2613.battleships.model;

public class Marker {
    

    private String id;
    private Integer positionX;
    private Integer positionY;
    private String hit;
    private String miss;
    
    
    public Marker(String id, Integer positionX, Integer positionY, String hit,String miss) {
        
        super();
        this.id = id;
        this.positionX = positionX;
        this.positionY = positionY;
        this.hit = hit;
        this.miss = miss;
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


    public String getHit() {
        return hit;
    }


    public void setHit(String hit) {
        this.hit = hit;
    }


    public String getMiss() {
        return miss;
    }


    public void setMiss(String miss) {
        this.miss = miss;
    }


    @Override
    public String toString() {
        return "Marker [id=" + id + ", positionX=" + positionX + ", positionY="
                + positionY + ", hit=" + hit + ", miss=" + miss + "]";
    }    

}

