/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EvidenceVariableCharacteristic of the Data Model fhir.
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
{@link definitionReference}, 
{@link definitionCodeableConcept}, 
{@link definitionExpression}, 
{@link definitionDataRequirement}, 
{@link definitionTriggerDefinition}, 
{@link usageContext}, 
{@link participantEffectivePeriod}, 
{@link participantEffectiveDuration}, 
{@link participantEffectiveTiming}, 
{@link timeFromStart}, 

* It provides of then following operations (getters and setters)
{@link getDefinitionReference},
{@link getDefinitionCodeableConcept},
{@link getDefinitionExpression},
{@link getDefinitionDataRequirement},
{@link getDefinitionTriggerDefinition},
{@link getUsageContext},
{@link getParticipantEffectivePeriod},
{@link getParticipantEffectiveDuration},
{@link getParticipantEffectiveTiming},
{@link getTimeFromStart},
{@link setDefinitionReference},
{@link setDefinitionCodeableConcept},
{@link setDefinitionExpression},
{@link setDefinitionDataRequirement},
{@link setDefinitionTriggerDefinition},
{@link setUsageContext},
{@link setParticipantEffectivePeriod},
{@link setParticipantEffectiveDuration},
{@link setParticipantEffectiveTiming},
{@link setTimeFromStart},
 */

@Description("The EvidenceVariable resource describes a 'PICO' element that knowledge (evidence, assertion, recommendation) is about.")

public interface EvidenceVariableCharacteristic extends GenericEntity, fhir.BackboneElement {

	EntityType<EvidenceVariableCharacteristic> T = EntityTypes.T(EvidenceVariableCharacteristic.class);

	/* Constants for each property name. */
	java.lang.String definitionReference = "definitionReference";
	java.lang.String definitionCodeableConcept = "definitionCodeableConcept";
	java.lang.String definitionExpression = "definitionExpression";
	java.lang.String definitionDataRequirement = "definitionDataRequirement";
	java.lang.String definitionTriggerDefinition = "definitionTriggerDefinition";
	java.lang.String usageContext = "usageContext";
	java.lang.String participantEffectivePeriod = "participantEffectivePeriod";
	java.lang.String participantEffectiveDuration = "participantEffectiveDuration";
	java.lang.String participantEffectiveTiming = "participantEffectiveTiming";
	java.lang.String timeFromStart = "timeFromStart";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDefinitionReference();
	void setDefinitionReference(com.braintribe.model.generic.GenericEntity definitionReference);
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
	@Description("")
	@Mandatory
	fhir.TriggerDefinition getDefinitionTriggerDefinition();
	void setDefinitionTriggerDefinition(fhir.TriggerDefinition definitionTriggerDefinition);
	@Description("Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.")
	
	java.util.List<fhir.UsageContext> getUsageContext();
	void setUsageContext(java.util.List<fhir.UsageContext> usageContext);

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
	fhir.Duration getTimeFromStart();
	void setTimeFromStart(fhir.Duration timeFromStart);
}
