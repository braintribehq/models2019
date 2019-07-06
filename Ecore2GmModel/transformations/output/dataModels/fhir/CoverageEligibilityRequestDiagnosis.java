/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityRequestDiagnosis of the Data Model fhir.
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
{@link diagnosisCodeableConcept}, 
{@link diagnosisReference}, 

* It provides of then following operations (getters and setters)
{@link getDiagnosisCodeableConcept},
{@link getDiagnosisReference},
{@link setDiagnosisCodeableConcept},
{@link setDiagnosisReference},
 */

@Description("The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.")

public interface CoverageEligibilityRequestDiagnosis extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageEligibilityRequestDiagnosis> T = EntityTypes.T(CoverageEligibilityRequestDiagnosis.class);

	/* Constants for each property name. */
	java.lang.String diagnosisCodeableConcept = "diagnosisCodeableConcept";
	java.lang.String diagnosisReference = "diagnosisReference";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getDiagnosisCodeableConcept();
	void setDiagnosisCodeableConcept(fhir.CodeableConcept diagnosisCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDiagnosisReference();
	void setDiagnosisReference(com.braintribe.model.generic.GenericEntity diagnosisReference);
}
