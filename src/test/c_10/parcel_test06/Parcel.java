package test.c_10.parcel_test06;

/**
 * TrackingSlip��Ȼ����������һ�����ģ����������������ⲻ����
 * @author mohan
 *
 */
public class Parcel {
	private void internalTracking(boolean b){
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id=s;
				}
				public String getSlip(){
					return id;
				}
			}
			TrackingSlip ts=new TrackingSlip("slip");
			System.out.println(ts.getSlip());
		}
	}
	
	public void track(){
		internalTracking(true);
	}
	
	public static void main(String[] args){
		new Parcel().track();
	}
}
