/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Timeevent of the Data Model uml.
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
{@link isRelative}, 
{@link when}, 

* It provides of then following operations (getters and setters)
{@link getIsRelative},
{@link getWhen},
{@link setIsRelative},
{@link setWhen},
 */

@Description("A TimeEvent is an Event that occurs at a specific point in time.<p>From package UML::CommonBehavior.</p>")

public interface Timeevent extends GenericEntity, uml.Event {

	EntityType<Timeevent> T = EntityTypes.T(Timeevent.class);

	/* Constants for each property name. */
	java.lang.String isRelative = "isRelative";
	java.lang.String when = "when";

	@Description("Specifies whether the TimeEvent is specified as an absolute or relative time.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	types.Boolean getIsRelative();
	void setIsRelative(types.Boolean isRelative);
	@Description("Specifies the time of the TimeEvent.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Timeexpression getWhen();
	void setWhen(uml.Timeexpression when);
}
