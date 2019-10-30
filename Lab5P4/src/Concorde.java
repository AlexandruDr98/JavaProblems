
public class Concorde extends AvioaneCalatori{
public void goSuperSonic() {
	System.out.println(super.getPlaneID()+"_"+super.getEnginePower()+"-Supersonic mode activated");
}

public void goSubSonic() {
	System.out.println(super.getPlaneID()+"_"+super.getEnginePower()+"-Supersonic mode deactivated");
	
}

}
