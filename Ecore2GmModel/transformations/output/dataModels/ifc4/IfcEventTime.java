/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcEventTime of the Data Model iai.
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
{@link ActualDate}, 
{@link EarlyDate}, 
{@link LateDate}, 
{@link ScheduleDate}, 

* It provides of then following operations (getters and setters)
{@link getActualDate},
{@link getEarlyDate},
{@link getLateDate},
{@link getScheduleDate},
{@link setActualDate},
{@link setEarlyDate},
{@link setLateDate},
{@link setScheduleDate},
 */

@Description("")

public interface IfcEventTime extends GenericEntity, ifc4.IfcSchedulingTime {

	EntityType<IfcEventTime> T = EntityTypes.T(IfcEventTime.class);

	/* Constants for each property name. */
	java.lang.String ActualDate = "ActualDate";
	java.lang.String EarlyDate = "EarlyDate";
	java.lang.String LateDate = "LateDate";
	java.lang.String ScheduleDate = "ScheduleDate";

	@Description("")
	@Mandatory
	java.lang.String getActualDate();
	void setActualDate(java.lang.String ActualDate);
	@Description("")
	@Mandatory
	java.lang.String getEarlyDate();
	void setEarlyDate(java.lang.String EarlyDate);
	@Description("")
	@Mandatory
	java.lang.String getLateDate();
	void setLateDate(java.lang.String LateDate);
	@Description("")
	@Mandatory
	java.lang.String getScheduleDate();
	void setScheduleDate(java.lang.String ScheduleDate);
}
