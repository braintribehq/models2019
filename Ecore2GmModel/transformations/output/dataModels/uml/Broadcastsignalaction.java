/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Broadcastsignalaction of the Data Model uml.
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

* It provides of then following operations (getters and setters)
{@link getSignal},
{@link setSignal},
 */

@Description("A BroadcastSignalAction is an InvocationAction that transmits a Signal instance to all the potential target objects in the system. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instances are sent out and cannot receive reply values.<p>From package UML::Actions.</p>")

public interface Broadcastsignalaction extends GenericEntity, uml.Invocationaction {

	EntityType<Broadcastsignalaction> T = EntityTypes.T(Broadcastsignalaction.class);

	/* Constants for each property name. */
	java.lang.String signal = "signal";

	@Description("The Signal whose instances are to be sent.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Signal getSignal();
	void setSignal(uml.Signal signal);
}
