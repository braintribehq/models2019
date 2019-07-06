/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RequestGroupAction of the Data Model fhir.
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
{@link documentation}, 
{@link condition}, 
{@link relatedAction}, 
{@link timingAge}, 
{@link timingPeriod}, 
{@link timingDuration}, 
{@link timingRange}, 
{@link timingTiming}, 
{@link participant}, 
{@link type}, 
{@link resource}, 
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getDocumentation},
{@link getCondition},
{@link getRelatedAction},
{@link getTimingAge},
{@link getTimingPeriod},
{@link getTimingDuration},
{@link getTimingRange},
{@link getTimingTiming},
{@link getParticipant},
{@link getType},
{@link getResource},
{@link getAction},
{@link setCode},
{@link setDocumentation},
{@link setCondition},
{@link setRelatedAction},
{@link setTimingAge},
{@link setTimingPeriod},
{@link setTimingDuration},
{@link setTimingRange},
{@link setTimingTiming},
{@link setParticipant},
{@link setType},
{@link setResource},
{@link setAction},
 */

@Description("A group of related requests that can be used to capture intended activities that have inter-dependencies such as 'give this medication after that one'.")

public interface RequestGroupAction extends GenericEntity, fhir.BackboneElement {

	EntityType<RequestGroupAction> T = EntityTypes.T(RequestGroupAction.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String documentation = "documentation";
	java.lang.String condition = "condition";
	java.lang.String relatedAction = "relatedAction";
	java.lang.String timingAge = "timingAge";
	java.lang.String timingPeriod = "timingPeriod";
	java.lang.String timingDuration = "timingDuration";
	java.lang.String timingRange = "timingRange";
	java.lang.String timingTiming = "timingTiming";
	java.lang.String participant = "participant";
	java.lang.String type = "type";
	java.lang.String resource = "resource";
	java.lang.String action = "action";

	@Description("A code that provides meaning for the action or action group. For example, a section may have a LOINC code for a section of a documentation template.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("Didactic or other informational resources associated with the action that can be provided to the CDS recipient. Information resources can include inline text commentary and links to web resources.")
	
	java.util.List<fhir.RelatedArtifact> getDocumentation();
	void setDocumentation(java.util.List<fhir.RelatedArtifact> documentation);

	@Description("An expression that describes applicability criteria, or start/stop conditions for the action.")
	
	java.util.List<fhir.RequestGroupCondition> getCondition();
	void setCondition(java.util.List<fhir.RequestGroupCondition> condition);

	@Description("A relationship to another action such as 'before' or '30-60 minutes after start of'.")
	
	java.util.List<fhir.RequestGroupRelatedAction> getRelatedAction();
	void setRelatedAction(java.util.List<fhir.RequestGroupRelatedAction> relatedAction);

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
	@Description("The participant that should perform or be responsible for this action.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getParticipant();
	void setParticipant(java.util.List<com.braintribe.model.generic.GenericEntity> participant);

	@Description("The type of action to perform (create, update, remove).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The resource that is the target of the action (e.g. CommunicationRequest).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResource();
	void setResource(com.braintribe.model.generic.GenericEntity resource);
	@Description("Sub actions.")
	
	java.util.List<fhir.RequestGroupAction> getAction();
	void setAction(java.util.List<fhir.RequestGroupAction> action);

}
