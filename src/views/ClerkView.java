package views;
public class ClerkView {
private HotelMapView mapView;
private AddGuestView addGuest;
private Hotel hotel;
private Calendar calendar;
private JButton addGuest;
private JButton logout;
private JFrame frame;
private JPanel hotelStats;
private JPanel hotelMap;
private JPanel clerkPanel;

/*************************************************************
 This constructor will take the hotel map view 
and the hotel model to create the Clerk View.
The hotel model will be used to generate stats
for the ClerK View.  The hotel map view will create
the hotel map for this view.
**************************************************************/	
public ClerkView (HotelMapView map,  Hotel h) {
	this.mapView = map;
	this.hotel = h;
}

}

