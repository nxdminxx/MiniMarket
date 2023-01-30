package MiniMarket;

public class Product {
    String prodID;
    String prodName;
    String prodDescription;
	double prodPrice;
	String category;

    public Product () {
        prodID = null;
		prodName = null;
        prodDescription = null;
		prodPrice = 0.0;
		category = null;
    }

    public Product(String prodID, String prodName, String prodDescription, double prodPrice, String category) {
		this.prodID = prodID;
		this.prodName = prodName;
        this.prodDescription = prodDescription;
		this.prodPrice = prodPrice;
		this.category = category;
	}
	

	//Accessors
	public String getProdID () {
		return prodID;
	}
	
	public String getProdName () {
		return prodName;
	}
	
    public String getProdDescription () {
		return prodDescription;
	}

	public double getProdPrice () {
		return prodPrice;
	}
		
	public String getCategory () {
		return category;
	}
	
	
    //Mutators
	public void setProdID (String newProdID) {
		prodID = newProdID;
	}
	
	public void setProdName (String newProdName) {
		prodName = newProdName;
	}
	
    public void setProdDescription (String newProdDescription) {
		prodDescription = newProdDescription;
	}

	public void setProdPrice (double newProdPrice) {
		prodPrice = newProdPrice;
	}
	
	public void setCategory (String newCategory) {
		category = newCategory;
	}


    public String toString () {
        return prodName +"\t" +prodDescription +"\t\t" +prodPrice;
    }
}
