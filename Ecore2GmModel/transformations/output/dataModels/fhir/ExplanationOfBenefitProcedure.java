/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitProcedure of the Data Model fhir.
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
{@link procedureCodeableConcept}, 
{@link procedureReference}, 
{@link udi}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getProcedureCodeableConcept},
{@link getProcedureReference},
{@link getUdi},
{@link setType},
{@link setProcedureCodeableConcept},
{@link setProcedureReference},
{@link setUdi},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitProcedure extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitProcedure> T = EntityTypes.T(ExplanationOfBenefitProcedure.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String procedureCodeableConcept = "procedureCodeableConcept";
	java.lang.String procedureReference = "procedureReference";
	java.lang.String udi = "udi";

	@Description("When the condition was observed or the relative ranking.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getProcedureCodeableConcept();
	void setProcedureCodeableConcept(fhir.CodeableConcept procedureCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProcedureReference();
	void setProcedureReference(com.braintribe.model.generic.GenericEntity procedureReference);
	@Description("Unique Device Identifiers associated with this line item.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getUdi();
	void setUdi(java.util.List<com.braintribe.model.generic.GenericEntity> udi);

}
