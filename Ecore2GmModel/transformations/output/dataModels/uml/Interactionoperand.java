/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interactionoperand of the Data Model uml.
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
{@link fragment}, 
{@link guard}, 

* It provides of then following operations (getters and setters)
{@link getFragment},
{@link getGuard},
{@link setFragment},
{@link setGuard},
 */

@Description("An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represents one operand of the expression given by the enclosing CombinedFragment.<p>From package UML::Interactions.</p>")

public interface Interactionoperand extends GenericEntity, uml.Namespace, uml.Interactionfragment {

	EntityType<Interactionoperand> T = EntityTypes.T(Interactionoperand.class);

	/* Constants for each property name. */
	java.lang.String fragment = "fragment";
	java.lang.String guard = "guard";

	@Description("The fragments of the operand.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Interactionfragment> getFragment();
	void setFragment(java.util.List<uml.Interactionfragment> fragment);

	@Description("Constraint of the operand.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interactionconstraint getGuard();
	void setGuard(uml.Interactionconstraint guard);
}
