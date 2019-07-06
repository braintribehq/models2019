/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenDefinitionAdditive of the Data Model fhir.
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
{@link additiveCodeableConcept}, 
{@link additiveReference}, 

* It provides of then following operations (getters and setters)
{@link getAdditiveCodeableConcept},
{@link getAdditiveReference},
{@link setAdditiveCodeableConcept},
{@link setAdditiveReference},
 */

@Description("A kind of specimen with associated set of requirements.")

public interface SpecimenDefinitionAdditive extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenDefinitionAdditive> T = EntityTypes.T(SpecimenDefinitionAdditive.class);

	/* Constants for each property name. */
	java.lang.String additiveCodeableConcept = "additiveCodeableConcept";
	java.lang.String additiveReference = "additiveReference";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getAdditiveCodeableConcept();
	void setAdditiveCodeableConcept(fhir.CodeableConcept additiveCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAdditiveReference();
	void setAdditiveReference(com.braintribe.model.generic.GenericEntity additiveReference);
}
