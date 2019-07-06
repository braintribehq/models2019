/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstancePolymerDegreeOfPolymerisation of the Data Model fhir.
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
{@link degree}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getDegree},
{@link getAmount},
{@link setDegree},
{@link setAmount},
 */

@Description("Todo.")

public interface SubstancePolymerDegreeOfPolymerisation extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstancePolymerDegreeOfPolymerisation> T = EntityTypes.T(SubstancePolymerDegreeOfPolymerisation.class);

	/* Constants for each property name. */
	java.lang.String degree = "degree";
	java.lang.String amount = "amount";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getDegree();
	void setDegree(fhir.CodeableConcept degree);
	@Description("Todo.")
	@Mandatory
	fhir.SubstanceAmount getAmount();
	void setAmount(fhir.SubstanceAmount amount);
}
