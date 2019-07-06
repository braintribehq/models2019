/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductCountryLanguage of the Data Model fhir.
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
{@link country}, 
{@link jurisdiction}, 
{@link language}, 

* It provides of then following operations (getters and setters)
{@link getCountry},
{@link getJurisdiction},
{@link getLanguage},
{@link setCountry},
{@link setJurisdiction},
{@link setLanguage},
 */

@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).")

public interface MedicinalProductCountryLanguage extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductCountryLanguage> T = EntityTypes.T(MedicinalProductCountryLanguage.class);

	/* Constants for each property name. */
	java.lang.String country = "country";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String language = "language";

	@Description("Country code for where this name applies.")
	@Mandatory
	fhir.CodeableConcept getCountry();
	void setCountry(fhir.CodeableConcept country);
	@Description("Jurisdiction code for where this name applies.")
	@Mandatory
	fhir.CodeableConcept getJurisdiction();
	void setJurisdiction(fhir.CodeableConcept jurisdiction);
	@Description("Language code for this name.")
	@Mandatory
	fhir.CodeableConcept getLanguage();
	void setLanguage(fhir.CodeableConcept language);
}
