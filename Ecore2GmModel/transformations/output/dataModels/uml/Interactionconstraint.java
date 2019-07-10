/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interactionconstraint of the Data Model uml.
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
{@link maxint}, 
{@link minint}, 

* It provides of then following operations (getters and setters)
{@link getMaxint},
{@link getMinint},
{@link setMaxint},
{@link setMinint},
 */

@Description("An InteractionConstraint is a Boolean expression that guards an operand in a CombinedFragment.<p>From package UML::Interactions.</p>")

public interface Interactionconstraint extends GenericEntity, uml.Constraint {

	EntityType<Interactionconstraint> T = EntityTypes.T(Interactionconstraint.class);

	/* Constants for each property name. */
	java.lang.String maxint = "maxint";
	java.lang.String minint = "minint";

	@Description("The maximum number of iterations of a loop<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Valuespecification getMaxint();
	void setMaxint(uml.Valuespecification maxint);
	@Description("The minimum number of iterations of a loop<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Valuespecification getMinint();
	void setMinint(uml.Valuespecification minint);
}
