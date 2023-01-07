
package fastfoodjava;

public class menuList {
	public String nameA,nameB,nameC,nameD,nameE;
	public double priceA,priceB,priceC,priceD,priceE;
        public double total,totalA,totalB,totalC,totalD,totalE,overAllTotal;
        public char more;
        public int numOrderA,numOrderB,numOrderC,numOrderD,numOrderE;

	public menuList(){
            nameA = "";
            nameB = "";
            nameC = "";
            nameD = "";
            nameE = "";
	}
//nameA
	public String getNameA(){
		return nameA;
	}
	public void setNameA(String nameA){
			this.nameA = nameA;
	}
//nameB
	public String getNameB(){
		return nameB;
	}
	public void setNameB(String nameB){
//nameC			this.nameB = nameB;
	}
	public String getNameC(){
		return nameC;
	}
	public void setNameC(String nameC){
			this.nameC = nameC;
	}
//nameD
	public String getNameD(){
		return nameD;
	}
	public void setNameD(String nameD){
			this.nameD = nameD;
	}
//nameE
	public String getNameE(){
		return nameE;
	}
	public void setNameE(String nameE){
			this.nameE = nameE;
	}
//priceA
	public double getPriceA(){
		return priceA;
	}
	public void setPriceA(double priceA){
			this.priceA = priceA;
	}
//priceB
	public double getPriceB(){
		return priceB;
	}
	public void setPriceB(double priceB){
			this.priceB = priceB;
	}
//priceC
	public double getPriceC(){
		return priceC;
	}
	public void setPriceC(double priceC){
			this.priceC = priceC;
	}
//priceD
	public double getPriceD(){
		return priceD;
	}
	public void setPriceD(double priceD){
			this.priceD = priceD;
	}
//priceE
	public double getPriceE(){
		return priceE;
	}
	public void setPriceE(double priceE){
			this.priceE = priceE;
	}
 //totalA 
        public double getTotalA(){
            totalA = priceA * numOrderA;
            return totalA;
        }

 //numOrderA
        public int getNumOrderA(){
            return numOrderA;
        }
        public void setNumOrderA(int numOrderA){
            this.numOrderA = numOrderA;
	}
//totalB
        public double getTotalB(){
            totalB = priceB * numOrderB;
            return totalB;
        }
//numOrderB
        public int getNumOrderB(){
            return numOrderB;
        }
        public void setNumOrderB(int numOrderB){
            this.numOrderB = numOrderB;
	}
//totalC
        public double getTotalC(){
            totalC = priceC* numOrderC;
            return totalC;
        }
//numOrderC
        public int getNumOrderC(){
            return numOrderC;
        }
        public void setNumOrderC(int numOrderC){
            this.numOrderC = numOrderC;
	}
//totalD
        public double getTotalD(){
            totalD = priceD * numOrderD;
            return totalD;
        }
//numOrderD
        public int getNumOrderD(){
            return numOrderD;
        }
        public void setNumOrderD(int numOrderD){
            this.numOrderD = numOrderD;
	}
//totalE
        public double getTotalE(){
            totalE = priceE * numOrderE;
            return totalE;
        }
//numOrderE
        public int getNumOrderE(){
            return numOrderE;
        }
        public void setNumOrderE(int numOrderE){
            this.numOrderE = numOrderE;
	}
//overAllTotal
        public double getOverAllTotal(){
            return overAllTotal;
        }
        public void setOverAllTotal(double overAllTotal){
            this.overAllTotal = overAllTotal;
	}
}
