package ca.bcit.comp2613.battleships.model;

import java.util.List;

public class Board {
    
        private String id;
        private Integer gridX;
        private Integer gridY;
        
        //variable that will have multiple ship many to many relationship
        private List < Ship > ships;
        
    
    public Board(String id, Integer gridX, Integer gridY) {
            super();
            this.id = id;
            this.gridX = gridX;
            this.gridY = gridY;
        }
    
    
    public String getBoardId() {
        return id;
    }
    
    
    public void setBoardId(String boardId) {
        this.id = boardId;
    }
    
    
    public Integer getGridX() {
        return gridX;
    }
    
    
    public void setGridX(Integer gridX) {
        this.gridX = gridX;
    }
    
    
    public Integer getGridY() {
        return gridY;
    }
    
    
    public void setGridY(Integer gridY) {
        this.gridY = gridY;
    }
    
    
    @Override
    public String toString() {
        return "Board [boardId=" + id + ", gridX=" + gridX + ", gridY="
                + gridY + "]";
    }


    
}

