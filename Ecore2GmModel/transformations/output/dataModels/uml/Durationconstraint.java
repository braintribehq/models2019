/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Durationconstraint of the Data Model uml.
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

@Description("A DurationConstraint is a Constraint that refers to a DurationInterval.<p>From package UML::Values.</p>")

public interface Durationconstraint extends GenericEntity, uml.Intervalconstraint {

	EntityType<Durationconstraint> T = EntityTypes.T(Durationconstraint.class);

	/* Constants for each property name. */
	java.lang.String firstEvent = "firstEvent";

	@Description("The value of firstEvent[i] is related to constrainedElement[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters constrainedElement[i]. If firstEvent[i] is false, then the corresponding observation event is the last time instant the execution is within constrainedElement[i].<p>From package UML::Values.</p>")
	@Mandatory
	java.util.List<types.Boolean> getFirstEvent();
	void setFirstEvent(java.util.List<types.Boolean> firstEvent);

}
