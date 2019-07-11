/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWorkTime of the Data Model iai.
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
{@link RecurrencePattern}, 
{@link Start}, 
{@link Finish}, 

* It provides of then following operations (getters and setters)
{@link getRecurrencePattern},
{@link getStart},
{@link getFinish},
{@link setRecurrencePattern},
{@link setStart},
{@link setFinish},
 */

@Description("")

public interface IfcWorkTime extends GenericEntity, ifc4.IfcSchedulingTime {

	EntityType<IfcWorkTime> T = EntityTypes.T(IfcWorkTime.class);

	/* Constants for each property name. */
	java.lang.String RecurrencePattern = "RecurrencePattern";
	java.lang.String Start = "Start";
	java.lang.String Finish = "Finish";

	@Description("")
	@Mandatory
	ifc4.IfcRecurrencePattern getRecurrencePattern();
	void setRecurrencePattern(ifc4.IfcRecurrencePattern RecurrencePattern);
	@Description("")
	@Mandatory
	java.lang.String getStart();
	void setStart(java.lang.String Start);
	@Description("")
	@Mandatory
	java.lang.String getFinish();
	void setFinish(java.lang.String Finish);
}
