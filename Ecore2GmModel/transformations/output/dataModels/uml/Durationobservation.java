/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Durationobservation of the Data Model uml.
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

@Description("A DurationObservation is a reference to a duration during an execution. It points out the NamedElement(s) in the model to observe and whether the observations are when this NamedElement is entered or when it is exited.<p>From package UML::Values.</p>")

public interface Durationobservation extends GenericEntity, uml.Observation {

	EntityType<Durationobservation> T = EntityTypes.T(Durationobservation.class);

	/* Constants for each property name. */
	java.lang.String event = "event";
	java.lang.String firstEvent = "firstEvent";

	@Description("The DurationObservation is determined as the duration between the entering or exiting of a single event Element during execution, or the entering/exiting of one event Element and the entering/exiting of a second.<p>From package UML::Values.</p>")
	@Mandatory
	java.util.List<uml.Namedelement> getEvent();
	void setEvent(java.util.List<uml.Namedelement> event);

	@Description("The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters event[i]. If firstEvent[i] is false, then the corresponding observation event is the time instant the execution exits event[i].<p>From package UML::Values.</p>")
	@Mandatory
	java.util.List<types.Boolean> getFirstEvent();
	void setFirstEvent(java.util.List<types.Boolean> firstEvent);

}
