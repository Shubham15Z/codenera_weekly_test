/*
Q11.Given a list of Event objects with attributes eventName and eventDate, 
use the Stream API to find the event with the earliest date. 
Assume the Event class has a getDate() method that returns the event date.
 */

package wt.may17.pkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Event
{
	private String eventName;
	private Date eventDate;
	public Event(String eventName, Date eventDate) {
		super();
		this.eventName = eventName;
		this.eventDate = eventDate;
	}
	public String getEventName() {
		return eventName;
	}
	public Date getEventDate() {
		return eventDate;
	}
	@Override
	public String toString() {
		return "\neventName = " + eventName + ", eventDate = " + eventDate;
	}

}

public class Question11
{
	public static void main(String[] args) throws ParseException 
	{
		List<Event> events = new ArrayList<Event>();
		events.add(new Event("Techfest", new SimpleDateFormat("yyyy-MM-dd").parse("2025-09-12")));
		events.add(new Event("Innovate", new SimpleDateFormat("yyyy-MM-dd").parse("2025-11-08")));
		events.add(new Event("Codeathon", new SimpleDateFormat("yyyy-MM-dd").parse("2025-08-20")));
		events.add(new Event("DevCon", new SimpleDateFormat("yyyy-MM-dd").parse("2025-02-15")));
		events.add(new Event("CyberSec", new SimpleDateFormat("yyyy-MM-dd").parse("2025-10-05")));
		
//		Event earliest = events.stream().min(Comparator.comparing(Event::getEventDate)).orElse(null);
		Event earliest = events.stream().min((e1, e2) -> e1.getEventDate().compareTo(e2.getEventDate())).orElse(null);
		
		System.out.println("Earliest Event : "+earliest);
	}
}
