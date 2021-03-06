/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ElementDefinitionSlicing of the Data Model fhir.
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
{@link discriminator}, 

* It provides of then following operations (getters and setters)
{@link getDiscriminator},
{@link setDiscriminator},
 */

@Description("Captures constraints on each element within the resource, profile, or extension.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface ElementDefinitionSlicing extends GenericEntity, fhir.BackboneElement {

	EntityType<ElementDefinitionSlicing> T = EntityTypes.T(ElementDefinitionSlicing.class);

	/* Constants for each property name. */
	java.lang.String discriminator = "discriminator";

	@Description("Designates which child elements are used to discriminate between the slices when processing an instance. If one or more discriminators are provided, the value of the child elements in the instance data SHALL completely distinguish which slice the element in the resource matches based on the allowed values for those elements in each of the slices.")
	
	java.util.List<fhir.ElementDefinitionDiscriminator> getDiscriminator();
	void setDiscriminator(java.util.List<fhir.ElementDefinitionDiscriminator> discriminator);

}
