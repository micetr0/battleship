package ca.bcit.comp2613.battleships;

import javax.persistence.PersistenceUnit;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import ca.bcit.comp2613.battleships.model.Ship;
import ca.bcit.comp2613.battleships.repository.*;
@EnableAutoConfiguration
@ImportResource("applicationContext.xml")

public class MySQLConfig {

	
}


