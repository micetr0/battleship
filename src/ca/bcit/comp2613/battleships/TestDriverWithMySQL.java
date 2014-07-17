package ca.bcit.comp2613.battleships;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import ca.bcit.comp2613.battleships.model.Board;
import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.model.ShipType;
import ca.bcit.comp2613.battleships.repository.BoardRepository;
import ca.bcit.comp2613.battleships.repository.ShipRepository;
import ca.bcit.comp2613.battleships.util.ShipUtil;

@EnableAutoConfiguration
@ImportResource("applicationContext.xml")

public class TestDriverWithMySQL {

    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(TestDriverWithMySQL.class);
        
        ShipRepository shipRepository = context.getBean(ShipRepository.class);
        BoardRepository boardRepository = context.getBean(BoardRepository.class);
        
        Random generator = new Random();
        //
        Board board = new Board();
        boardRepository.save(board);
        int shipTypeAssign = 0;

        for (int i = 0; i < 10; i++) {
            Ship ship = new Ship();
            ship.setId(Integer.toString(i));
            ship.setPositionX(generator.nextInt(20));
            ship.setPositionY(generator.nextInt(20));

            shipTypeAssign = generator.nextInt(4) + 2;
            if (shipTypeAssign == 2) {
                ship.setShipType(ShipType.DESTROYER);
                ship.setEndurance(2);
            } else if (shipTypeAssign == 3) {
                ship.setShipType(ShipType.SUBMARINE);
                ship.setEndurance(3);
            } else if (shipTypeAssign == 4) {
                ship.setShipType(ShipType.BATTLESHIP);
                ship.setEndurance(4);
            } else if (shipTypeAssign == 5) {
                ship.setShipType(ShipType.CARRIER);
                ship.setEndurance(5);
            }
            shipRepository.save(ship);
        }
        Ship ship = shipRepository.findOne("2");
        System.out.println(ship);
    }
}
