/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRecurrencePattern of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RecurrenceType}, 
{@link DayComponent}, 
{@link WeekdayComponent}, 
{@link MonthComponent}, 
{@link Position}, 
{@link Interval}, 
{@link Occurrences}, 
{@link TimePeriods}, 

* It provides of then following operations (getters and setters)
{@link getRecurrenceType},
{@link getDayComponent},
{@link getWeekdayComponent},
{@link getMonthComponent},
{@link getPosition},
{@link getInterval},
{@link getOccurrences},
{@link getTimePeriods},
{@link setRecurrenceType},
{@link setDayComponent},
{@link setWeekdayComponent},
{@link setMonthComponent},
{@link setPosition},
{@link setInterval},
{@link setOccurrences},
{@link setTimePeriods},
 */

@Description("")

public interface IfcRecurrencePattern extends GenericEntity {

	EntityType<IfcRecurrencePattern> T = EntityTypes.T(IfcRecurrencePattern.class);

	/* Constants for each property name. */
	java.lang.String RecurrenceType = "RecurrenceType";
	java.lang.String DayComponent = "DayComponent";
	java.lang.String WeekdayComponent = "WeekdayComponent";
	java.lang.String MonthComponent = "MonthComponent";
	java.lang.String Position = "Position";
	java.lang.String Interval = "Interval";
	java.lang.String Occurrences = "Occurrences";
	java.lang.String TimePeriods = "TimePeriods";

	@Description("")
	@Mandatory
	ifc4.IfcRecurrenceTypeEnum getRecurrenceType();
	void setRecurrenceType(ifc4.IfcRecurrenceTypeEnum RecurrenceType);
	@Description("")
	
	java.util.List<java.lang.Long> getDayComponent();
	void setDayComponent(java.util.List<java.lang.Long> DayComponent);

	@Description("")
	
	java.util.List<java.lang.Long> getWeekdayComponent();
	void setWeekdayComponent(java.util.List<java.lang.Long> WeekdayComponent);

	@Description("")
	
	java.util.List<java.lang.Long> getMonthComponent();
	void setMonthComponent(java.util.List<java.lang.Long> MonthComponent);

	@Description("")
	@Mandatory
	java.lang.Long getPosition();
	void setPosition(java.lang.Long Position);
	@Description("")
	@Mandatory
	java.lang.Long getInterval();
	void setInterval(java.lang.Long Interval);
	@Description("")
	@Mandatory
	java.lang.Long getOccurrences();
	void setOccurrences(java.lang.Long Occurrences);
	@Description("")
	
	java.util.List<ifc4.IfcTimePeriod> getTimePeriods();
	void setTimePeriods(java.util.List<ifc4.IfcTimePeriod> TimePeriods);

}
