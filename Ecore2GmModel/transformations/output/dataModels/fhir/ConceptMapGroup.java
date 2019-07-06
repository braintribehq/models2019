/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConceptMapGroup of the Data Model fhir.
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
{@link element}, 
{@link unmapped}, 

* It provides of then following operations (getters and setters)
{@link getElement},
{@link getUnmapped},
{@link setElement},
{@link setUnmapped},
 */

@Description("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.")

public interface ConceptMapGroup extends GenericEntity, fhir.BackboneElement {

	EntityType<ConceptMapGroup> T = EntityTypes.T(ConceptMapGroup.class);

	/* Constants for each property name. */
	java.lang.String element = "element";
	java.lang.String unmapped = "unmapped";

	@Description("Mappings for an individual concept in the source to one or more concepts in the target.")
	
	java.util.List<fhir.ConceptMapElement> getElement();
	void setElement(java.util.List<fhir.ConceptMapElement> element);

	@Description("What to do when there is no mapping for the source concept. 'Unmapped' does not include codes that are unmatched, and the unmapped element is ignored in a code is specified to have equivalence = unmatched.")
	@Mandatory
	fhir.ConceptMapUnmapped getUnmapped();
	void setUnmapped(fhir.ConceptMapUnmapped unmapped);
}
