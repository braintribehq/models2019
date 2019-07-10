/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Callevent of the Data Model uml.
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
{@link operation}, 

* It provides of then following operations (getters and setters)
{@link getOperation},
{@link setOperation},
 */

@Description("A CallEvent models the receipt by an object of a message invoking a call of an Operation.<p>From package UML::CommonBehavior.</p>")

public interface Callevent extends GenericEntity, uml.Messageevent {

	EntityType<Callevent> T = EntityTypes.T(Callevent.class);

	/* Constants for each property name. */
	java.lang.String operation = "operation";

	@Description("Designates the Operation whose invocation raised the CalEvent.<p>From package UML::CommonBehavior.</p>")
	@Mandatory
	uml.Operation getOperation();
	void setOperation(uml.Operation operation);
}