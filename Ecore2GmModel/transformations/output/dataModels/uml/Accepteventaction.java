/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Accepteventaction of the Data Model uml.
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
{@link isUnmarshall}, 
{@link result}, 
{@link trigger}, 

* It provides of then following operations (getters and setters)
{@link getIsUnmarshall},
{@link getResult},
{@link getTrigger},
{@link setIsUnmarshall},
{@link setResult},
{@link setTrigger},
 */

@Description("An AcceptEventAction is an Action that waits for the occurrence of one or more specific Events.<p>From package UML::Actions.</p>")

public interface Accepteventaction extends GenericEntity, uml.Action {

	EntityType<Accepteventaction> T = EntityTypes.T(Accepteventaction.class);

	/* Constants for each property name. */
	java.lang.String isUnmarshall = "isUnmarshall";
	java.lang.String result = "result";
	java.lang.String trigger = "trigger";

	@Description("Indicates whether there is a single OutputPin for a SignalEvent occurrence, or multiple OutputPins for attribute values of the instance of the Signal associated with a SignalEvent occurrence.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsUnmarshall();
	void setIsUnmarshall(types.Boolean isUnmarshall);
	@Description("OutputPins holding the values received from an Event occurrence.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getResult();
	void setResult(java.util.List<uml.Outputpin> result);

	@Description("The Triggers specifying the Events of which the AcceptEventAction waits for occurrences.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Trigger> getTrigger();
	void setTrigger(java.util.List<uml.Trigger> trigger);

}
