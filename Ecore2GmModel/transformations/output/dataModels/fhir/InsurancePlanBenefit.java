/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanBenefit of the Data Model fhir.
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
{@link type}, 
{@link limit}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getLimit},
{@link setType},
{@link setLimit},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanBenefit extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanBenefit> T = EntityTypes.T(InsurancePlanBenefit.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String limit = "limit";

	@Description("Type of benefit (primary care; speciality care; inpatient; outpatient).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The specific limits on the benefit.")
	
	java.util.List<fhir.InsurancePlanLimit> getLimit();
	void setLimit(java.util.List<fhir.InsurancePlanLimit> limit);

}
