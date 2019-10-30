
public class Avioane {
	private String planeID;
	private int totalEnginePower;

	public String getPlaneID() {
		return this.planeID;
	}
	public int getEnginePower() {
		return this.totalEnginePower;
	}
   public void takeOff() {
	   System.out.println( this.getPlaneID()+"_"+this.getEnginePower()+"-Initiating takeoff procedure-Starting engines-Accelerating down the runway-Taking off-Retracting gear-Takeoff complete");
   
   }
	
   public void fly() {
	   System.out.println( this.getPlaneID()+"_"+this.totalEnginePower+"_Flying");
	   
   }
  public void land() {
	  System.out.println( this.getPlaneID()+"-"+this.getEnginePower()+"Initiating landing procedure-Enabling airbrakes-Lowering gear-Contacting runway-decelerating-stopping engines-Landing complete");
  }

}
