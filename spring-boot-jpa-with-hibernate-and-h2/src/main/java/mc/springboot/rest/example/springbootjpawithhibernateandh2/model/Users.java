package mc.springboot.rest.example.springbootjpawithhibernateandh2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Users {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;

}
