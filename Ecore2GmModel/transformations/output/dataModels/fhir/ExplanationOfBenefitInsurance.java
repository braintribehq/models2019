/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitInsurance of the Data Model fhir.
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
{@link coverage}, 

* It provides of then following operations (getters and setters)
{@link getCoverage},
{@link setCoverage},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitInsurance extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitInsurance> T = EntityTypes.T(ExplanationOfBenefitInsurance.class);

	/* Constants for each property name. */
	java.lang.String coverage = "coverage";

	@Description("Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCoverage();
	void setCoverage(com.braintribe.model.generic.GenericEntity coverage);
}
