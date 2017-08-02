/**
 * 
 */
package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.Set;

/**
 * @author hoang
 * 
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int product_id;
	private String product_name;
	private String product_description;
	private String product_avatar;
	private Set<String> product_category;
	
	public int getProduct_id() {
		return product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public Set<String> getProduct_category() {
		return product_category;
	}
	public String getProduct_description() {
		return product_description;
	}
	public String getProduct_avatar() {
		return product_avatar;
	}

}
