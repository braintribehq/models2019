/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InsurancePlanLimit of the Data Model fhir.
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
{@link value}, 
{@link code}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link getCode},
{@link setValue},
{@link setCode},
 */

@Description("Details of a Health Insurance product/plan provided by an organization.")

public interface InsurancePlanLimit extends GenericEntity, fhir.BackboneElement {

	EntityType<InsurancePlanLimit> T = EntityTypes.T(InsurancePlanLimit.class);

	/* Constants for each property name. */
	java.lang.String value = "value";
	java.lang.String code = "code";

	@Description("The maximum amount of a service item a plan will pay for a covered benefit.  For examples. wellness visits, or eyeglasses.")
	@Mandatory
	fhir.Quantity getValue();
	void setValue(fhir.Quantity value);
	@Description("The specific limit on the benefit.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
}
