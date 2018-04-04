import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EventDAO{


	private Connection connection;

	public EventDAO{

		connection = DbConnectionUtil.getConnection();


	}

	public List<Announcement> getAllEvents(){

		List<Event> announcements = new ArrayList<Event>();

		int i = 0;
		int rsCount = 0;
		int j = 0;

		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executableQuery("select * from Event")

			while (rs.next()){

				rsCount++;

			}


		} catch (SQL Exception e){


		}

		try {

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executableQuery("select * from Event");

			while (i < rsCount){

				while (rs.next()){

					Event event = new Event();

					event.setEventID(rs.getInt("eventID"));

					event.setEventDescription(rs.getString("eventDescription"));
					event.setEventName(rs.getString("eventName"));
					event.setEventLocation(rs.getString("eventLocation"));
					event.setEventDate(rs.getDate("eventDate"));

					event.add(event);

					i++;
					j++;

				}

			}

		} catch (SQLException){

		}
		
		return events;

	}


}