/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Stateinvariant of the Data Model uml.
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
{@link invariant}, 

* It provides of then following operations (getters and setters)
{@link getInvariant},
{@link setInvariant},
 */

@Description("A StateInvariant is a runtime constraint on the participants of the Interaction. It may be used to specify a variety of different kinds of Constraints, such as values of Attributes or Variables, internal or external States, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline.<p>From package UML::Interactions.</p>")

public interface Stateinvariant extends GenericEntity, uml.Interactionfragment {

	EntityType<Stateinvariant> T = EntityTypes.T(Stateinvariant.class);

	/* Constants for each property name. */
	java.lang.String invariant = "invariant";

	@Description("A Constraint that should hold at runtime for this StateInvariant.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Constraint getInvariant();
	void setInvariant(uml.Constraint invariant);
}
