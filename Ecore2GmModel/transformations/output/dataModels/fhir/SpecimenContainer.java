/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenContainer of the Data Model fhir.
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
{@link identifier}, 
{@link type}, 
{@link capacity}, 
{@link specimenQuantity}, 
{@link additiveCodeableConcept}, 
{@link additiveReference}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getCapacity},
{@link getSpecimenQuantity},
{@link getAdditiveCodeableConcept},
{@link getAdditiveReference},
{@link setIdentifier},
{@link setType},
{@link setCapacity},
{@link setSpecimenQuantity},
{@link setAdditiveCodeableConcept},
{@link setAdditiveReference},
 */

@Description("A sample to be used for analysis.")

public interface SpecimenContainer extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenContainer> T = EntityTypes.T(SpecimenContainer.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String capacity = "capacity";
	java.lang.String specimenQuantity = "specimenQuantity";
	java.lang.String additiveCodeableConcept = "additiveCodeableConcept";
	java.lang.String additiveReference = "additiveReference";

	@Description("Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The type of container associated with the specimen (e.g. slide, aliquot, etc.).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The capacity (volume or other measure) the container may contain.")
	@Mandatory
	fhir.Quantity getCapacity();
	void setCapacity(fhir.Quantity capacity);
	@Description("The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type.")
	@Mandatory
	fhir.Quantity getSpecimenQuantity();
	void setSpecimenQuantity(fhir.Quantity specimenQuantity);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getAdditiveCodeableConcept();
	void setAdditiveCodeableConcept(fhir.CodeableConcept additiveCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAdditiveReference();
	void setAdditiveReference(com.braintribe.model.generic.GenericEntity additiveReference);
}
