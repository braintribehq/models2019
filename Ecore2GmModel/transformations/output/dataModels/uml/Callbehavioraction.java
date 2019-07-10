/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Callbehavioraction of the Data Model uml.
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
{@link behavior}, 

* It provides of then following operations (getters and setters)
{@link getBehavior},
{@link setBehavior},
 */

@Description("A CallBehaviorAction is a CallAction that invokes a Behavior directly. The argument values of the CallBehaviorAction are passed on the input Parameters of the invoked Behavior. If the call is synchronous, the execution of the CallBehaviorAction waits until the execution of the invoked Behavior completes and the values of output Parameters of the Behavior are placed on the result OutputPins. If the call is asynchronous, the CallBehaviorAction completes immediately and no results values can be provided.<p>From package UML::Actions.</p>")

public interface Callbehavioraction extends GenericEntity, uml.Callaction {

	EntityType<Callbehavioraction> T = EntityTypes.T(Callbehavioraction.class);

	/* Constants for each property name. */
	java.lang.String behavior = "behavior";

	@Description("The Behavior being invoked.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Behavior getBehavior();
	void setBehavior(uml.Behavior behavior);
}
