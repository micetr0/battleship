package ca.bcit.comp2613.battleships.model;

public class Board {
    
        private String boardId;
        private Integer gridX;
        private Integer gridY;
        
    
    public Board(String boardId, Integer gridX, Integer gridY) {
            super();
            this.boardId = boardId;
            this.gridX = gridX;
            this.gridY = gridY;
        }
    
    
    public String getBoardId() {
        return boardId;
    }
    
    
    public void setBoardId(String boardId) {
        this.boardId = boardId;
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
        return "Board [boardId=" + boardId + ", gridX=" + gridX + ", gridY="
                + gridY + "]";
    }


    
}

