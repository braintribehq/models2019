/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Startobjectbehavioraction of the Data Model uml.
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
{@link object}, 

* It provides of then following operations (getters and setters)
{@link getObject},
{@link setObject},
 */

@Description("A StartObjectBehaviorAction is an InvocationAction that starts the execution either of a directly instantiated Behavior or of the classifierBehavior of an object. Argument values may be supplied for the input Parameters of the Behavior. If the Behavior is invoked synchronously, then output values may be obtained for output Parameters.<p>From package UML::Actions.</p>")

public interface Startobjectbehavioraction extends GenericEntity, uml.Callaction {

	EntityType<Startobjectbehavioraction> T = EntityTypes.T(Startobjectbehavioraction.class);

	/* Constants for each property name. */
	java.lang.String object = "object";

	@Description("An InputPin that holds the object that is either a Behavior to be started or has a classifierBehavior to be started.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
}
