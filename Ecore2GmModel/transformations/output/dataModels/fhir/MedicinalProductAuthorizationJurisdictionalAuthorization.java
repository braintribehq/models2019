/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductAuthorizationJurisdictionalAuthorization of the Data Model fhir.
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
{@link country}, 
{@link jurisdiction}, 
{@link legalStatusOfSupply}, 
{@link validityPeriod}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCountry},
{@link getJurisdiction},
{@link getLegalStatusOfSupply},
{@link getValidityPeriod},
{@link setIdentifier},
{@link setCountry},
{@link setJurisdiction},
{@link setLegalStatusOfSupply},
{@link setValidityPeriod},
 */

@Description("The regulatory authorization of a medicinal product.")

public interface MedicinalProductAuthorizationJurisdictionalAuthorization extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductAuthorizationJurisdictionalAuthorization> T = EntityTypes.T(MedicinalProductAuthorizationJurisdictionalAuthorization.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String country = "country";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String legalStatusOfSupply = "legalStatusOfSupply";
	java.lang.String validityPeriod = "validityPeriod";

	@Description("The assigned number for the marketing authorization.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Country of authorization.")
	@Mandatory
	fhir.CodeableConcept getCountry();
	void setCountry(fhir.CodeableConcept country);
	@Description("Jurisdiction within a country.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The legal status of supply in a jurisdiction or region.")
	@Mandatory
	fhir.CodeableConcept getLegalStatusOfSupply();
	void setLegalStatusOfSupply(fhir.CodeableConcept legalStatusOfSupply);
	@Description("The start and expected end date of the authorization.")
	@Mandatory
	fhir.Period getValidityPeriod();
	void setValidityPeriod(fhir.Period validityPeriod);
}
