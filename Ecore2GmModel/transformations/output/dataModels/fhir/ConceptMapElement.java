/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConceptMapElement of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link setTarget},
 */

@Description("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.")

public interface ConceptMapElement extends GenericEntity, fhir.BackboneElement {

	EntityType<ConceptMapElement> T = EntityTypes.T(ConceptMapElement.class);

	/* Constants for each property name. */
	java.lang.String target = "target";

	@Description("A concept from the target value set that this concept maps to.")
	
	java.util.List<fhir.ConceptMapTarget> getTarget();
	void setTarget(java.util.List<fhir.ConceptMapTarget> target);

}
