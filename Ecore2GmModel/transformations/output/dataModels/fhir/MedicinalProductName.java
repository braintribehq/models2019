/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductName of the Data Model fhir.
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
{@link namePart}, 
{@link countryLanguage}, 

* It provides of then following operations (getters and setters)
{@link getNamePart},
{@link getCountryLanguage},
{@link setNamePart},
{@link setCountryLanguage},
 */

@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).")

public interface MedicinalProductName extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductName> T = EntityTypes.T(MedicinalProductName.class);

	/* Constants for each property name. */
	java.lang.String namePart = "namePart";
	java.lang.String countryLanguage = "countryLanguage";

	@Description("Coding words or phrases of the name.")
	
	java.util.List<fhir.MedicinalProductNamePart> getNamePart();
	void setNamePart(java.util.List<fhir.MedicinalProductNamePart> namePart);

	@Description("Country where the name applies.")
	
	java.util.List<fhir.MedicinalProductCountryLanguage> getCountryLanguage();
	void setCountryLanguage(java.util.List<fhir.MedicinalProductCountryLanguage> countryLanguage);

}
