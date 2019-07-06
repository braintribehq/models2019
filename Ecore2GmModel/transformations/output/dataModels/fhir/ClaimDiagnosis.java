/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimDiagnosis of the Data Model fhir.
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
{@link type}, 
{@link onAdmission}, 
{@link packageCode}, 

* It provides of then following operations (getters and setters)
{@link getDiagnosisCodeableConcept},
{@link getDiagnosisReference},
{@link getType},
{@link getOnAdmission},
{@link getPackageCode},
{@link setDiagnosisCodeableConcept},
{@link setDiagnosisReference},
{@link setType},
{@link setOnAdmission},
{@link setPackageCode},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")

public interface ClaimDiagnosis extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimDiagnosis> T = EntityTypes.T(ClaimDiagnosis.class);

	/* Constants for each property name. */
	java.lang.String diagnosisCodeableConcept = "diagnosisCodeableConcept";
	java.lang.String diagnosisReference = "diagnosisReference";
	java.lang.String type = "type";
	java.lang.String onAdmission = "onAdmission";
	java.lang.String packageCode = "packageCode";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getDiagnosisCodeableConcept();
	void setDiagnosisCodeableConcept(fhir.CodeableConcept diagnosisCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDiagnosisReference();
	void setDiagnosisReference(com.braintribe.model.generic.GenericEntity diagnosisReference);
	@Description("When the condition was observed or the relative ranking.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("Indication of whether the diagnosis was present on admission to a facility.")
	@Mandatory
	fhir.CodeableConcept getOnAdmission();
	void setOnAdmission(fhir.CodeableConcept onAdmission);
	@Description("A package billing code or bundle code used to group products and services to a particular health condition (such as heart attack) which is based on a predetermined grouping code system.")
	@Mandatory
	fhir.CodeableConcept getPackageCode();
	void setPackageCode(fhir.CodeableConcept packageCode);
}
