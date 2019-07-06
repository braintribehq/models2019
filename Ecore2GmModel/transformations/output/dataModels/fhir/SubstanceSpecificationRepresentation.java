/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationRepresentation of the Data Model fhir.
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
{@link type}, 
{@link attachment}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getAttachment},
{@link setType},
{@link setAttachment},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationRepresentation extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationRepresentation> T = EntityTypes.T(SubstanceSpecificationRepresentation.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String attachment = "attachment";

	@Description("The type of structure (e.g. Full, Partial, Representative).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("An attached file with the structural representation.")
	@Mandatory
	fhir.Attachment getAttachment();
	void setAttachment(fhir.Attachment attachment);
}
