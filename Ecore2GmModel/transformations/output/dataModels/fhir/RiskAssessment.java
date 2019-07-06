/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RiskAssessment of the Data Model fhir.
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
{@link identifier}, 
{@link basedOn}, 
{@link parent}, 
{@link method}, 
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link occurrencePeriod}, 
{@link condition}, 
{@link performer}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link basis}, 
{@link prediction}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getParent},
{@link getMethod},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getOccurrencePeriod},
{@link getCondition},
{@link getPerformer},
{@link getReasonCode},
{@link getReasonReference},
{@link getBasis},
{@link getPrediction},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setParent},
{@link setMethod},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setOccurrencePeriod},
{@link setCondition},
{@link setPerformer},
{@link setReasonCode},
{@link setReasonReference},
{@link setBasis},
{@link setPrediction},
{@link setNote},
 */

@Description("An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.If the element is present, it must have either a @value, an @id, or extensions")

public interface RiskAssessment extends GenericEntity, fhir.FhirDomainResource {

	EntityType<RiskAssessment> T = EntityTypes.T(RiskAssessment.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String parent = "parent";
	java.lang.String method = "method";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String condition = "condition";
	java.lang.String performer = "performer";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String basis = "basis";
	java.lang.String prediction = "prediction";
	java.lang.String note = "note";

	@Description("Business identifier assigned to the risk assessment.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A reference to the request that is fulfilled by this risk assessment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getBasedOn();
	void setBasedOn(com.braintribe.model.generic.GenericEntity basedOn);
	@Description("A reference to a resource that this risk assessment is part of, such as a Procedure.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getParent();
	void setParent(com.braintribe.model.generic.GenericEntity parent);
	@Description("The algorithm, process or mechanism used to evaluate the risk.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("The type of the risk assessment performed.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The patient or group the risk assessment applies to.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter where the assessment was performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("For assessments or prognosis specific to a particular condition, indicates the condition being assessed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCondition();
	void setCondition(com.braintribe.model.generic.GenericEntity condition);
	@Description("The provider or software application that performed the assessment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("The reason the risk assessment was performed.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Resources supporting the reason the risk assessment was performed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Indicates the source data considered as part of the assessment (for example, FamilyHistory, Observations, Procedures, Conditions, etc.).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasis();
	void setBasis(java.util.List<com.braintribe.model.generic.GenericEntity> basis);

	@Description("Describes the expected outcome for the subject.")
	
	java.util.List<fhir.RiskAssessmentPrediction> getPrediction();
	void setPrediction(java.util.List<fhir.RiskAssessmentPrediction> prediction);

	@Description("Additional comments about the risk assessment.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
