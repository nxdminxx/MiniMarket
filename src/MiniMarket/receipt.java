
package MiniMarket;

public class receipt {
    public double priceA,priceB,priceC,priceD,priceE,overAllTotal,overAllTotalTax;
    public double totalEntreeA=0,totalEntreeB=0,totalEntreeC=0,totalEntreeD=0,totalEntreeE=0;
    public double totalSideDishA=0,totalSideDishB=0,totalSideDishC=0,totalSideDishD=0,totalSideDishE=0;
    public double totalDrinkA=0, totalDrinkB=0, totalDrinkC=0, totalDrinkD=0, totalDrinkE=0;

//totalEntreeA
	public double getTotalEntreeA(){
		return totalEntreeA;
	}
	public void setTotalEntreeA(double totalEntree){
			this.totalEntreeA = totalEntreeA;
	}
//totalEntreeB
	public double getTotalEntreeB(){
		return totalEntreeB;
	}
	public void setTotalEntreeB(double totalEntreeB){
			this.totalEntreeB= totalEntreeB;
	} 
//totalEntreeC
	public double getTotalEntreeC(){
		return totalEntreeC;
	}
	public void setTotalEntreeC(double totalEntreeC){
			this.totalEntreeC= totalEntreeC;
	} 
//totalEntreeD
	public double getTotalEntreeD(){
		return totalEntreeD;
	}
	public void setTotalEntreeD(double totalEntreeD){
			this.totalEntreeD= totalEntreeD;
	} 
//totalEntreeE
	public double getTotalEntreeE(){
		return totalEntreeE;
	}
	public void setTotalEntreeE(double totalEntreeE){
			this.totalEntreeE = totalEntreeE;
	}         
//totalSideDishA
	public double getTotalSideDishA(){
		return totalSideDishA;
	}
	public void setTotalSideDishA(double totalSideDishA){
			this.totalSideDishA= totalSideDishA;
	}
 //totalSideDishB
	public double getTotalSideDishB(){
		return totalSideDishB;
	}
	public void setTotalSideDishB(double totalSideDishB){
			this.totalSideDishB= totalSideDishB;
	}
 //totalSideDishC
	public double getTotalSideDishC(){
		return totalSideDishC;
	}
	public void setTotalSideDishC(double totalSideDishC){
			this.totalSideDishC= totalSideDishC;
	}       
 //totalSideDishD
	public double getTotalSideDishD(){
		return totalSideDishD;
	}
	public void setTotalSideDishD(double totalSideDishD){
			this.totalSideDishD= totalSideDishD;
	}
 //totalSideDishE
	public double getTotalSideDishE(){
		return totalSideDishE;
	}
	public void setTotalSideDishE(double totalSideDishE){
			this.totalSideDishE= totalSideDishE;
	}       
//totalDrinkA
	public double getTotalDrinkA(){
		return totalDrinkA;
	}
	public void setTotalDrinkA(double totalDrinkA){
			this.totalDrinkA = totalDrinkA;
	}
//totalDrinkB
	public double getTotalDrinkB(){
		return totalDrinkB;
	}
	public void setTotalDrinkB(double totalDrinkB){
			this.totalDrinkB = totalDrinkB;
	}
//totalDrinkC
	public double getTotalDrinkC(){
		return totalDrinkC;
	}
	public void setTotalDrinkC(double totalDrinkC){
			this.totalDrinkC = totalDrinkC;
	}
//totalDrinkD
	public double getTotalDrinkD(){
		return totalDrinkD;
	}
	public void setTotalDrinkD(double totalDrinkD){
			this.totalDrinkD = totalDrinkD;
	}
//totalDrinkE
	public double getTotalDrinkE(){
		return totalDrinkE;
	}
	public void setTotalDrinkE(double totalDrink){
			this.totalDrinkE = totalDrinkE;
	}        
//overAllTotal
	public double getOverAllTotal(){
                overAllTotal= ( totalEntreeA + totalEntreeB + totalEntreeC + 
                        totalEntreeD +totalEntreeD + totalSideDishA +
                        totalSideDishB + totalSideDishC + totalSideDishD + 
                        totalSideDishE + totalDrinkA + totalDrinkB + 
                        totalDrinkC + totalDrinkD + totalDrinkE )* 0.05;
                overAllTotal = overAllTotal + totalEntreeA + totalEntreeB + totalEntreeC + 
                        totalEntreeD +totalEntreeD + totalSideDishA +
                        totalSideDishB + totalSideDishC + totalSideDishD + 
                        totalSideDishE + totalDrinkA + totalDrinkB + 
                        totalDrinkC + totalDrinkD + totalDrinkE;
		return overAllTotal;
	}
	public void setOverAllTotal(double overAllTotal){
			this.overAllTotal = overAllTotal;
	}
     
}
