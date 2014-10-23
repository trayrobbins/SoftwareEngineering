package views;

import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConciergeView {
	private RequestLogView transportationLogView;
	private RequestLogView eventLogView;
	private JFrame frame;
	private JPanel transportationPanel;
	private JPanel eventPanel;
	private JPanel conciergePanel;
	private Calendar eventCalendar;
	private Calendar transportationCalendar;
	private Guest guest;
	private JButton logout;
	
/*************************************************************
 This constructor will take the transportation request
log and the event request log view to add to the 
Concierge View.
**************************************************************/	
public ConciergeView(RequestLogView t, RequestLogView e) {
	this.transporationLogView = t;
	this.eventLogView = e;
}

/* this method will display the calendar information for a specific day */
public Calendar displayCalendarInfo(Calendar c) {

}

/* this method will display guest information if a guest is clicked on in one of the request logs*/
public Guest displayGuestInfo(Guest g) {

}

}
