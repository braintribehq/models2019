/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Trigger of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link event}, 
{@link port}, 

* It provides of then following operations (getters and setters)
{@link getEvent},
{@link getPort},
{@link setEvent},
{@link setPort},
 */

@Description("A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred.<p>From package UML::CommonBehavior.</p>")

public interface Trigger extends GenericEntity, uml.Namedelement {

	EntityType<Trigger> T = EntityTypes.T(Trigger.class);

	/* Constants for each property name. */
	java.lang.String event = "event";
	java.lang.String port = "port";

	@Description("The Event that detected by the Trigger.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Event getEvent();
	void setEvent(uml.Event event);
	@Description("A optional Port of through which the given effect is detected.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<uml.Port> getPort();
	void setPort(java.util.List<uml.Port> port);

}
