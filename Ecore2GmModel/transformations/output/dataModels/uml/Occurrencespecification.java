/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Occurrencespecification of the Data Model uml.
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
{@link toAfter}, 
{@link toBefore}, 

* It provides of then following operations (getters and setters)
{@link getToAfter},
{@link getToBefore},
{@link setToAfter},
{@link setToBefore},
 */

@Description("An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions.<p>From package UML::Interactions.</p>")

public interface Occurrencespecification extends GenericEntity, uml.Interactionfragment {

	EntityType<Occurrencespecification> T = EntityTypes.T(Occurrencespecification.class);

	/* Constants for each property name. */
	java.lang.String toAfter = "toAfter";
	java.lang.String toBefore = "toBefore";

	@Description("References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Generalordering> getToAfter();
	void setToAfter(java.util.List<uml.Generalordering> toAfter);

	@Description("References the GeneralOrderings that specify EventOcurrences that must occur before this OccurrenceSpecification.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Generalordering> getToBefore();
	void setToBefore(java.util.List<uml.Generalordering> toBefore);

}
