
public class Mig extends AvioaneLupta{

	public void highSpeedGeometry() {
		System.out.println(super.getPlaneID()+"_"+super.getEnginePower()+"-High speed geometry selected");
		
	}
	public void normalGeometry() {
		System.out.println(super.getPlaneID()+"_"+super.getEnginePower()+"-Normal geometry selected");
	}
}
