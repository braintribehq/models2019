/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Sendsignalaction of the Data Model uml.
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
{@link signal}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getSignal},
{@link getTarget},
{@link setSignal},
{@link setTarget},
 */

@Description("A SendSignalAction is an InvocationAction that creates a Signal instance and transmits it to the target object. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instance is sent out and cannot receive reply values.<p>From package UML::Actions.</p>")

public interface Sendsignalaction extends GenericEntity, uml.Invocationaction {

	EntityType<Sendsignalaction> T = EntityTypes.T(Sendsignalaction.class);

	/* Constants for each property name. */
	java.lang.String signal = "signal";
	java.lang.String target = "target";

	@Description("The Signal whose instance is transmitted to the target.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Signal getSignal();
	void setSignal(uml.Signal signal);
	@Description("The InputPin that provides the target object to which the Signal instance is sent.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getTarget();
	void setTarget(uml.Inputpin target);
}
