/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWorkCalendar of the Data Model iai.
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
{@link WorkingTimes}, 
{@link ExceptionTimes}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getWorkingTimes},
{@link getExceptionTimes},
{@link getPredefinedType},
{@link setWorkingTimes},
{@link setExceptionTimes},
{@link setPredefinedType},
 */

@Description("")

public interface IfcWorkCalendar extends GenericEntity, ifc4.IfcControl {

	EntityType<IfcWorkCalendar> T = EntityTypes.T(IfcWorkCalendar.class);

	/* Constants for each property name. */
	java.lang.String WorkingTimes = "WorkingTimes";
	java.lang.String ExceptionTimes = "ExceptionTimes";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	
	java.util.List<ifc4.IfcWorkTime> getWorkingTimes();
	void setWorkingTimes(java.util.List<ifc4.IfcWorkTime> WorkingTimes);

	@Description("")
	
	java.util.List<ifc4.IfcWorkTime> getExceptionTimes();
	void setExceptionTimes(java.util.List<ifc4.IfcWorkTime> ExceptionTimes);

	@Description("")
	@Mandatory
	ifc4.IfcWorkCalendarTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcWorkCalendarTypeEnum PredefinedType);
}
