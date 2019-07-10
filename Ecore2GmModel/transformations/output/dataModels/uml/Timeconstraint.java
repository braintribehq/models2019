/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Timeconstraint of the Data Model uml.
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
{@link firstEvent}, 

* It provides of then following operations (getters and setters)
{@link getFirstEvent},
{@link setFirstEvent},
 */

@Description("A TimeConstraint is a Constraint that refers to a TimeInterval.<p>From package UML::Values.</p>")

public interface Timeconstraint extends GenericEntity, uml.Intervalconstraint {

	EntityType<Timeconstraint> T = EntityTypes.T(Timeconstraint.class);

	/* Constants for each property name. */
	java.lang.String firstEvent = "firstEvent";

	@Description("The value of firstEvent is related to the constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within the constrainedElement.<p>From package UML::Values.</p>")
	@Mandatory
	types.Boolean getFirstEvent();
	void setFirstEvent(types.Boolean firstEvent);
}
