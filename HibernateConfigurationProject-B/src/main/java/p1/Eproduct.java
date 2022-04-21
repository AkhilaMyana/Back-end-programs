package p1;

import java.math.BigDecimal;
import java.util.Date;

public class Eproduct {
	 long id;
     String name;
     BigDecimal price;
     Date date_added;
	public long getid() {
		return id;
	}
	public void setid(long iD) {
		id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getdate_added() {
		return date_added;
	}
	public void setdate_added(Date date_added) {
		this.date_added = date_added;
	}


}
