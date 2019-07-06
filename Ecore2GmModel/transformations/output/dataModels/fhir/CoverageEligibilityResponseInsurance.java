/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityResponseInsurance of the Data Model fhir.
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
{@link benefitPeriod}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getCoverage},
{@link getBenefitPeriod},
{@link getItem},
{@link setCoverage},
{@link setBenefitPeriod},
{@link setItem},
 */

@Description("This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.")

public interface CoverageEligibilityResponseInsurance extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageEligibilityResponseInsurance> T = EntityTypes.T(CoverageEligibilityResponseInsurance.class);

	/* Constants for each property name. */
	java.lang.String coverage = "coverage";
	java.lang.String benefitPeriod = "benefitPeriod";
	java.lang.String item = "item";

	@Description("Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCoverage();
	void setCoverage(com.braintribe.model.generic.GenericEntity coverage);
	@Description("The term of the benefits documented in this response.")
	@Mandatory
	fhir.Period getBenefitPeriod();
	void setBenefitPeriod(fhir.Period benefitPeriod);
	@Description("Benefits and optionally current balances, and authorization details by category or service.")
	
	java.util.List<fhir.CoverageEligibilityResponseItem> getItem();
	void setItem(java.util.List<fhir.CoverageEligibilityResponseItem> item);

}
