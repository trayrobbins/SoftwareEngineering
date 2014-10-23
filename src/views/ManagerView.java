public class ManagerView {
	private AddEmployeeView addEmployee;
	private AddGuestView addGuest;
	private ClerkView clerkView;
	private ConciergeView conciergeView;
	private HotelMapView mapView;
	private HousekeepingView housekeepingView;
	private MaintenanceView maintenanceView;
	private RoomServiceView roomServiceView;
	private JFrame frame;
	private JPanel panel;
	private JButton logout;
	private JTabbedPane tabbedPane;

/*************************************************************
 This constructor will take all employee views and 
give the availability to the manager to access all employee
views through a tabbed pane view that will have job
functions by tabs.
**************************************************************/	
public ManagerView(addEmployeeView addEmployee, AddGuestView addGuest, 
ClerkView clerkView, ConciergeView conciergeView, 
HotelMapView mapView, HousekeepingView housekeepingView, 
MaintenanceView maintenanceView,
RoomServiceView roomServiceView) {
	this.addEmployee = addEmployee;
	this.addGuest = addGuest;
	this.clerkView = clerkView;
	this.conciergeView = conciergeView;
	this.mapView = mapView;
	this.housekeepingView = housekeepingView;
	this.maintenanceView = maintenanceView;
	this.roomServiceView = roomServiceView;
}

}
