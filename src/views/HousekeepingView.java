public class HousekeepingView {
	private RequestLogView logView;
	private HotelMapView mapView;
	private JFrame frame;
	private JPanel mapViewPanel;
	private JPanel logViewPanel;
	private JPanel roomPanel;
	private JPopupMenu popup;
	
/*************************************************************
 This constructor will take the hotel map view 
and the housekeeping requestLog to create the 
Housekeeping View.
**************************************************************/	
public HouseKeepingView(HotelMapView h, RequestLogView r) {
	this.mapView = h;
	this.LogView = r;
}
/* method to display room information on the screen */
public HotelRoom displayRoom(HotelRoom h) {

}

}
