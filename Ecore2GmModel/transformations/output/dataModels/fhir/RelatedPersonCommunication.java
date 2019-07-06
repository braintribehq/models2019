/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RelatedPersonCommunication of the Data Model fhir.
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
{@link language}, 

* It provides of then following operations (getters and setters)
{@link getLanguage},
{@link setLanguage},
 */

@Description("Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.")

public interface RelatedPersonCommunication extends GenericEntity, fhir.BackboneElement {

	EntityType<RelatedPersonCommunication> T = EntityTypes.T(RelatedPersonCommunication.class);

	/* Constants for each property name. */
	java.lang.String language = "language";

	@Description("The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. 'en' for English, or 'en-US' for American English versus 'en-EN' for England English.")
	@Mandatory
	fhir.CodeableConcept getLanguage();
	void setLanguage(fhir.CodeableConcept language);
}
