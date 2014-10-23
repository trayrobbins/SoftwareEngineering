public class MaintenanceView {
	private RequestLogView LogView;
	private HotelMapView mapView;
	private JFrame frame;
	private JPanel mapViewPanel;
	private JPanel logViewPanel;
	private JPanel roomPanel;
	
/*************************************************************
 This constructor will take the hotel map view 
and the Maintenance requestLog to create the 
Maintenance View.
**************************************************************/
public MaintenanceView(HotelMapView h, RequestLogView r) {
	this.mapView = h;
	this.LogView = r;
}

/* method to display room information on the screen */
public HotelRoom displayRoom(HotelRoom h) {

}

}
