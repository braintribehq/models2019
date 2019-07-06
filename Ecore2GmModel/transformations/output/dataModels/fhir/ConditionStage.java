/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConditionStage of the Data Model fhir.
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
{@link summary}, 
{@link assessment}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getSummary},
{@link getAssessment},
{@link getType},
{@link setSummary},
{@link setAssessment},
{@link setType},
 */

@Description("A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.")

public interface ConditionStage extends GenericEntity, fhir.BackboneElement {

	EntityType<ConditionStage> T = EntityTypes.T(ConditionStage.class);

	/* Constants for each property name. */
	java.lang.String summary = "summary";
	java.lang.String assessment = "assessment";
	java.lang.String type = "type";

	@Description("A simple summary of the stage such as 'Stage 3'. The determination of the stage is disease-specific.")
	@Mandatory
	fhir.CodeableConcept getSummary();
	void setSummary(fhir.CodeableConcept summary);
	@Description("Reference to a formal record of the evidence on which the staging assessment is based.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAssessment();
	void setAssessment(java.util.List<com.braintribe.model.generic.GenericEntity> assessment);

	@Description("The kind of staging, such as pathological or clinical staging.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
}
