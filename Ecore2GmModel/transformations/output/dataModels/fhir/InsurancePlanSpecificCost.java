/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanSpecificCost of the Data Model fhir.
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
{@link category}, 
{@link benefit}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getBenefit},
{@link setCategory},
{@link setBenefit},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanSpecificCost extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanSpecificCost> T = EntityTypes.T(InsurancePlanSpecificCost.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String benefit = "benefit";

	@Description("General category of benefit (Medical; Dental; Vision; Drug; Mental Health; Substance Abuse; Hospice, Home Health).")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("List of the specific benefits under this category of benefit.")
	
	java.util.List<fhir.InsurancePlanBenefit1> getBenefit();
	void setBenefit(java.util.List<fhir.InsurancePlanBenefit1> benefit);

}
