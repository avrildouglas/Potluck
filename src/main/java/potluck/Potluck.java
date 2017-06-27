package potluck;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "foods")
public class Potluck {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Min(1)
		
	private Long plId;
	private String name;
	private String food;
	
	
	public Long getPlId() {
		return plId;
	}
	
	public void setPlId(Long plId) {
		this.plId = plId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFood() {
		return food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}

}
