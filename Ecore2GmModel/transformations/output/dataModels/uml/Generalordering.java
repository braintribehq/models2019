/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Generalordering of the Data Model uml.
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
{@link after}, 
{@link before}, 

* It provides of then following operations (getters and setters)
{@link getAfter},
{@link getBefore},
{@link setAfter},
{@link setBefore},
 */

@Description("A GeneralOrdering represents a binary relation between two OccurrenceSpecifications, to describe that one OccurrenceSpecification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order.<p>From package UML::Interactions.</p>")

public interface Generalordering extends GenericEntity, uml.Namedelement {

	EntityType<Generalordering> T = EntityTypes.T(Generalordering.class);

	/* Constants for each property name. */
	java.lang.String after = "after";
	java.lang.String before = "before";

	@Description("The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Occurrencespecification getAfter();
	void setAfter(uml.Occurrencespecification after);
	@Description("The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Occurrencespecification getBefore();
	void setBefore(uml.Occurrencespecification before);
}
