/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Actionexecutionspecification of the Data Model uml.
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
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getAction},
{@link setAction},
 */

@Description("An ActionExecutionSpecification is a kind of ExecutionSpecification representing the execution of an Action.<p>From package UML::Interactions.</p>")

public interface Actionexecutionspecification extends GenericEntity, uml.Executionspecification {

	EntityType<Actionexecutionspecification> T = EntityTypes.T(Actionexecutionspecification.class);

	/* Constants for each property name. */
	java.lang.String action = "action";

	@Description("Action whose execution is occurring.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Action getAction();
	void setAction(uml.Action action);
}
