/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcEvent of the Data Model iai.
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
{@link PredefinedType}, 
{@link EventTriggerType}, 
{@link UserDefinedEventTriggerType}, 
{@link EventOccurenceTime}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getEventTriggerType},
{@link getUserDefinedEventTriggerType},
{@link getEventOccurenceTime},
{@link setPredefinedType},
{@link setEventTriggerType},
{@link setUserDefinedEventTriggerType},
{@link setEventOccurenceTime},
 */

@Description("")

public interface IfcEvent extends GenericEntity, ifc4.IfcProcess {

	EntityType<IfcEvent> T = EntityTypes.T(IfcEvent.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String EventTriggerType = "EventTriggerType";
	java.lang.String UserDefinedEventTriggerType = "UserDefinedEventTriggerType";
	java.lang.String EventOccurenceTime = "EventOccurenceTime";

	@Description("")
	@Mandatory
	ifc4.IfcEventTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcEventTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcEventTriggerTypeEnum getEventTriggerType();
	void setEventTriggerType(ifc4.IfcEventTriggerTypeEnum EventTriggerType);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedEventTriggerType();
	void setUserDefinedEventTriggerType(java.lang.String UserDefinedEventTriggerType);
	@Description("")
	@Mandatory
	ifc4.IfcEventTime getEventOccurenceTime();
	void setEventOccurenceTime(ifc4.IfcEventTime EventOccurenceTime);
}
