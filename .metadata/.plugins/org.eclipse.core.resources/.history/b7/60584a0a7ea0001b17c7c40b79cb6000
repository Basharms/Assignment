/**
 * 
 */
package assignment.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * @author Administrator
 *
 */
public class AssignmentUtil {


	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			Calendar cc = stringToCalendar("01/12/2012");
			System.out.println(cc.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Calendar stringToCalendar(final String dateTime) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String format = "dd/MM/yyyy";
        if (dateTime != null && dateTime.trim().length() > 0) {
            DateFormat formatter = new SimpleDateFormat(format);
            Date date = formatter.parse(dateTime);

            calendar.setTime(date);
        }

        return calendar;
    }
	
	public static Session initHibernateSession()  throws HibernateException {

		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");
			sessionFactory = con.buildSessionFactory();

			return sessionFactory.openSession();
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void destroy() {
		if (sessionFactory != null) {
			sessionFactory.close();
			sessionFactory = null;
		}
	}

}
