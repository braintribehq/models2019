/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductSpecialDesignation of the Data Model fhir.
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
{@link intendedUse}, 
{@link indicationCodeableConcept}, 
{@link indicationReference}, 
{@link status}, 
{@link species}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getIntendedUse},
{@link getIndicationCodeableConcept},
{@link getIndicationReference},
{@link getStatus},
{@link getSpecies},
{@link setIdentifier},
{@link setType},
{@link setIntendedUse},
{@link setIndicationCodeableConcept},
{@link setIndicationReference},
{@link setStatus},
{@link setSpecies},
 */

@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).")

public interface MedicinalProductSpecialDesignation extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductSpecialDesignation> T = EntityTypes.T(MedicinalProductSpecialDesignation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String intendedUse = "intendedUse";
	java.lang.String indicationCodeableConcept = "indicationCodeableConcept";
	java.lang.String indicationReference = "indicationReference";
	java.lang.String status = "status";
	java.lang.String species = "species";

	@Description("Identifier for the designation, or procedure number.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The type of special designation, e.g. orphan drug, minor use.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The intended use of the product, e.g. prevention, treatment.")
	@Mandatory
	fhir.CodeableConcept getIntendedUse();
	void setIntendedUse(fhir.CodeableConcept intendedUse);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getIndicationCodeableConcept();
	void setIndicationCodeableConcept(fhir.CodeableConcept indicationCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIndicationReference();
	void setIndicationReference(com.braintribe.model.generic.GenericEntity indicationReference);
	@Description("For example granted, pending, expired or withdrawn.")
	@Mandatory
	fhir.CodeableConcept getStatus();
	void setStatus(fhir.CodeableConcept status);
	@Description("Animal species for which this applies.")
	@Mandatory
	fhir.CodeableConcept getSpecies();
	void setSpecies(fhir.CodeableConcept species);
}
