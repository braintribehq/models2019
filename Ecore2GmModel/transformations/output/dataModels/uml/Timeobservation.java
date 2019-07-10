/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Timeobservation of the Data Model uml.
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
{@link firstEvent}, 

* It provides of then following operations (getters and setters)
{@link getEvent},
{@link getFirstEvent},
{@link setEvent},
{@link setFirstEvent},
 */

@Description("A TimeObservation is a reference to a time instant during an execution. It points out the NamedElement in the model to observe and whether the observation is when this NamedElement is entered or when it is exited.<p>From package UML::Values.</p>")

public interface Timeobservation extends GenericEntity, uml.Observation {

	EntityType<Timeobservation> T = EntityTypes.T(Timeobservation.class);

	/* Constants for each property name. */
	java.lang.String event = "event";
	java.lang.String firstEvent = "firstEvent";

	@Description("The TimeObservation is determined by the entering or exiting of the event Element during execution.<p>From package UML::Values.</p>")
	@Mandatory
	uml.Namedelement getEvent();
	void setEvent(uml.Namedelement event);
	@Description("The value of firstEvent is related to the event. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the event Element. If firstEvent is false, then the corresponding observation event is the time instant the execution exits the event Element.<p>From package UML::Values.</p>")
	@Mandatory
	types.Boolean getFirstEvent();
	void setFirstEvent(types.Boolean firstEvent);
}
