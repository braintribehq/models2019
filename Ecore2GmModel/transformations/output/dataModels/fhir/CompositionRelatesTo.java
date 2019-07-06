/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CompositionRelatesTo of the Data Model fhir.
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
{@link targetIdentifier}, 
{@link targetReference}, 

* It provides of then following operations (getters and setters)
{@link getTargetIdentifier},
{@link getTargetReference},
{@link setTargetIdentifier},
{@link setTargetReference},
 */

@Description("A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).")

public interface CompositionRelatesTo extends GenericEntity, fhir.BackboneElement {

	EntityType<CompositionRelatesTo> T = EntityTypes.T(CompositionRelatesTo.class);

	/* Constants for each property name. */
	java.lang.String targetIdentifier = "targetIdentifier";
	java.lang.String targetReference = "targetReference";

	@Description("")
	@Mandatory
	fhir.Identifier getTargetIdentifier();
	void setTargetIdentifier(fhir.Identifier targetIdentifier);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTargetReference();
	void setTargetReference(com.braintribe.model.generic.GenericEntity targetReference);
}
