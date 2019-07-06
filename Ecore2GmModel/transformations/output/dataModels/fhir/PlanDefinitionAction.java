/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinitionAction of the Data Model fhir.
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
{@link code}, 
{@link reason}, 
{@link documentation}, 
{@link subjectCodeableConcept}, 
{@link subjectReference}, 
{@link trigger}, 
{@link condition}, 
{@link input}, 
{@link output}, 
{@link relatedAction}, 
{@link timingAge}, 
{@link timingPeriod}, 
{@link timingDuration}, 
{@link timingRange}, 
{@link timingTiming}, 
{@link participant}, 
{@link type}, 
{@link dynamicValue}, 
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getReason},
{@link getDocumentation},
{@link getSubjectCodeableConcept},
{@link getSubjectReference},
{@link getTrigger},
{@link getCondition},
{@link getInput},
{@link getOutput},
{@link getRelatedAction},
{@link getTimingAge},
{@link getTimingPeriod},
{@link getTimingDuration},
{@link getTimingRange},
{@link getTimingTiming},
{@link getParticipant},
{@link getType},
{@link getDynamicValue},
{@link getAction},
{@link setCode},
{@link setReason},
{@link setDocumentation},
{@link setSubjectCodeableConcept},
{@link setSubjectReference},
{@link setTrigger},
{@link setCondition},
{@link setInput},
{@link setOutput},
{@link setRelatedAction},
{@link setTimingAge},
{@link setTimingPeriod},
{@link setTimingDuration},
{@link setTimingRange},
{@link setTimingTiming},
{@link setParticipant},
{@link setType},
{@link setDynamicValue},
{@link setAction},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")

public interface PlanDefinitionAction extends GenericEntity, fhir.BackboneElement {

	EntityType<PlanDefinitionAction> T = EntityTypes.T(PlanDefinitionAction.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String reason = "reason";
	java.lang.String documentation = "documentation";
	java.lang.String subjectCodeableConcept = "subjectCodeableConcept";
	java.lang.String subjectReference = "subjectReference";
	java.lang.String trigger = "trigger";
	java.lang.String condition = "condition";
	java.lang.String input = "input";
	java.lang.String output = "output";
	java.lang.String relatedAction = "relatedAction";
	java.lang.String timingAge = "timingAge";
	java.lang.String timingPeriod = "timingPeriod";
	java.lang.String timingDuration = "timingDuration";
	java.lang.String timingRange = "timingRange";
	java.lang.String timingTiming = "timingTiming";
	java.lang.String participant = "participant";
	java.lang.String type = "type";
	java.lang.String dynamicValue = "dynamicValue";
	java.lang.String action = "action";

	@Description("A code that provides meaning for the action or action group. For example, a section may have a LOINC code for the section of a documentation template.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("A description of why this action is necessary or appropriate.")
	
	java.util.List<fhir.CodeableConcept> getReason();
	void setReason(java.util.List<fhir.CodeableConcept> reason);

	@Description("Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.")
	
	java.util.List<fhir.RelatedArtifact> getDocumentation();
	void setDocumentation(java.util.List<fhir.RelatedArtifact> documentation);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getSubjectCodeableConcept();
	void setSubjectCodeableConcept(fhir.CodeableConcept subjectCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubjectReference();
	void setSubjectReference(com.braintribe.model.generic.GenericEntity subjectReference);
	@Description("A description of when the action should be triggered.")
	
	java.util.List<fhir.TriggerDefinition> getTrigger();
	void setTrigger(java.util.List<fhir.TriggerDefinition> trigger);

	@Description("An expression that describes applicability criteria or start/stop conditions for the action.")
	
	java.util.List<fhir.PlanDefinitionCondition> getCondition();
	void setCondition(java.util.List<fhir.PlanDefinitionCondition> condition);

	@Description("Defines input data requirements for the action.")
	
	java.util.List<fhir.DataRequirement> getInput();
	void setInput(java.util.List<fhir.DataRequirement> input);

	@Description("Defines the outputs of the action, if any.")
	
	java.util.List<fhir.DataRequirement> getOutput();
	void setOutput(java.util.List<fhir.DataRequirement> output);

	@Description("A relationship to another action such as 'before' or '30-60 minutes after start of'.")
	
	java.util.List<fhir.PlanDefinitionRelatedAction> getRelatedAction();
	void setRelatedAction(java.util.List<fhir.PlanDefinitionRelatedAction> relatedAction);

	@Description("")
	@Mandatory
	fhir.Age getTimingAge();
	void setTimingAge(fhir.Age timingAge);
	@Description("")
	@Mandatory
	fhir.Period getTimingPeriod();
	void setTimingPeriod(fhir.Period timingPeriod);
	@Description("")
	@Mandatory
	fhir.Duration getTimingDuration();
	void setTimingDuration(fhir.Duration timingDuration);
	@Description("")
	@Mandatory
	fhir.Range getTimingRange();
	void setTimingRange(fhir.Range timingRange);
	@Description("")
	@Mandatory
	fhir.Timing getTimingTiming();
	void setTimingTiming(fhir.Timing timingTiming);
	@Description("Indicates who should participate in performing the action described.")
	
	java.util.List<fhir.PlanDefinitionParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.PlanDefinitionParticipant> participant);

	@Description("The type of action to perform (create, update, remove).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Customizations that should be applied to the statically defined resource. For example, if the dosage of a medication must be computed based on the patient's weight, a customization would be used to specify an expression that calculated the weight, and the path on the resource that would contain the result.")
	
	java.util.List<fhir.PlanDefinitionDynamicValue> getDynamicValue();
	void setDynamicValue(java.util.List<fhir.PlanDefinitionDynamicValue> dynamicValue);

	@Description("Sub actions that are contained within the action. The behavior of this action determines the functionality of the sub-actions. For example, a selection behavior of at-most-one indicates that of the sub-actions, at most one may be chosen as part of realizing the action definition.")
	
	java.util.List<fhir.PlanDefinitionAction> getAction();
	void setAction(java.util.List<fhir.PlanDefinitionAction> action);

}
