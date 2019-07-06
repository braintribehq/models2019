/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ResearchElementDefinitionCharacteristic of the Data Model fhir.
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
{@link definitionCodeableConcept}, 
{@link definitionExpression}, 
{@link definitionDataRequirement}, 
{@link usageContext}, 
{@link unitOfMeasure}, 
{@link studyEffectivePeriod}, 
{@link studyEffectiveDuration}, 
{@link studyEffectiveTiming}, 
{@link studyEffectiveTimeFromStart}, 
{@link participantEffectivePeriod}, 
{@link participantEffectiveDuration}, 
{@link participantEffectiveTiming}, 
{@link participantEffectiveTimeFromStart}, 

* It provides of then following operations (getters and setters)
{@link getDefinitionCodeableConcept},
{@link getDefinitionExpression},
{@link getDefinitionDataRequirement},
{@link getUsageContext},
{@link getUnitOfMeasure},
{@link getStudyEffectivePeriod},
{@link getStudyEffectiveDuration},
{@link getStudyEffectiveTiming},
{@link getStudyEffectiveTimeFromStart},
{@link getParticipantEffectivePeriod},
{@link getParticipantEffectiveDuration},
{@link getParticipantEffectiveTiming},
{@link getParticipantEffectiveTimeFromStart},
{@link setDefinitionCodeableConcept},
{@link setDefinitionExpression},
{@link setDefinitionDataRequirement},
{@link setUsageContext},
{@link setUnitOfMeasure},
{@link setStudyEffectivePeriod},
{@link setStudyEffectiveDuration},
{@link setStudyEffectiveTiming},
{@link setStudyEffectiveTimeFromStart},
{@link setParticipantEffectivePeriod},
{@link setParticipantEffectiveDuration},
{@link setParticipantEffectiveTiming},
{@link setParticipantEffectiveTimeFromStart},
 */

@Description("The ResearchElementDefinition resource describes a 'PICO' element that knowledge (evidence, assertion, recommendation) is about.")

public interface ResearchElementDefinitionCharacteristic extends GenericEntity, fhir.BackboneElement {

	EntityType<ResearchElementDefinitionCharacteristic> T = EntityTypes.T(ResearchElementDefinitionCharacteristic.class);

	/* Constants for each property name. */
	java.lang.String definitionCodeableConcept = "definitionCodeableConcept";
	java.lang.String definitionExpression = "definitionExpression";
	java.lang.String definitionDataRequirement = "definitionDataRequirement";
	java.lang.String usageContext = "usageContext";
	java.lang.String unitOfMeasure = "unitOfMeasure";
	java.lang.String studyEffectivePeriod = "studyEffectivePeriod";
	java.lang.String studyEffectiveDuration = "studyEffectiveDuration";
	java.lang.String studyEffectiveTiming = "studyEffectiveTiming";
	java.lang.String studyEffectiveTimeFromStart = "studyEffectiveTimeFromStart";
	java.lang.String participantEffectivePeriod = "participantEffectivePeriod";
	java.lang.String participantEffectiveDuration = "participantEffectiveDuration";
	java.lang.String participantEffectiveTiming = "participantEffectiveTiming";
	java.lang.String participantEffectiveTimeFromStart = "participantEffectiveTimeFromStart";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getDefinitionCodeableConcept();
	void setDefinitionCodeableConcept(fhir.CodeableConcept definitionCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Expression getDefinitionExpression();
	void setDefinitionExpression(fhir.Expression definitionExpression);
	@Description("")
	@Mandatory
	fhir.DataRequirement getDefinitionDataRequirement();
	void setDefinitionDataRequirement(fhir.DataRequirement definitionDataRequirement);
	@Description("Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.")
	
	java.util.List<fhir.UsageContext> getUsageContext();
	void setUsageContext(java.util.List<fhir.UsageContext> usageContext);

	@Description("Specifies the UCUM unit for the outcome.")
	@Mandatory
	fhir.CodeableConcept getUnitOfMeasure();
	void setUnitOfMeasure(fhir.CodeableConcept unitOfMeasure);
	@Description("")
	@Mandatory
	fhir.Period getStudyEffectivePeriod();
	void setStudyEffectivePeriod(fhir.Period studyEffectivePeriod);
	@Description("")
	@Mandatory
	fhir.Duration getStudyEffectiveDuration();
	void setStudyEffectiveDuration(fhir.Duration studyEffectiveDuration);
	@Description("")
	@Mandatory
	fhir.Timing getStudyEffectiveTiming();
	void setStudyEffectiveTiming(fhir.Timing studyEffectiveTiming);
	@Description("Indicates duration from the study initiation.")
	@Mandatory
	fhir.Duration getStudyEffectiveTimeFromStart();
	void setStudyEffectiveTimeFromStart(fhir.Duration studyEffectiveTimeFromStart);
	@Description("")
	@Mandatory
	fhir.Period getParticipantEffectivePeriod();
	void setParticipantEffectivePeriod(fhir.Period participantEffectivePeriod);
	@Description("")
	@Mandatory
	fhir.Duration getParticipantEffectiveDuration();
	void setParticipantEffectiveDuration(fhir.Duration participantEffectiveDuration);
	@Description("")
	@Mandatory
	fhir.Timing getParticipantEffectiveTiming();
	void setParticipantEffectiveTiming(fhir.Timing participantEffectiveTiming);
	@Description("Indicates duration from the participant's study entry.")
	@Mandatory
	fhir.Duration getParticipantEffectiveTimeFromStart();
	void setParticipantEffectiveTimeFromStart(fhir.Duration participantEffectiveTimeFromStart);
}
