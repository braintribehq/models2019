/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanCost of the Data Model fhir.
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
{@link applicability}, 
{@link qualifiers}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getApplicability},
{@link getQualifiers},
{@link getValue},
{@link setType},
{@link setApplicability},
{@link setQualifiers},
{@link setValue},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanCost extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanCost> T = EntityTypes.T(InsurancePlanCost.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String applicability = "applicability";
	java.lang.String qualifiers = "qualifiers";
	java.lang.String value = "value";

	@Description("Type of cost (copay; individual cap; family cap; coinsurance; deductible).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Whether the cost applies to in-network or out-of-network providers (in-network; out-of-network; other).")
	@Mandatory
	fhir.CodeableConcept getApplicability();
	void setApplicability(fhir.CodeableConcept applicability);
	@Description("Additional information about the cost, such as information about funding sources (e.g. HSA, HRA, FSA, RRA).")
	
	java.util.List<fhir.CodeableConcept> getQualifiers();
	void setQualifiers(java.util.List<fhir.CodeableConcept> qualifiers);

	@Description("The actual cost value. (some of the costs may be represented as percentages rather than currency, e.g. 10% coinsurance).")
	@Mandatory
	fhir.Quantity getValue();
	void setValue(fhir.Quantity value);
}
