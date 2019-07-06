/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinitionGoal of the Data Model fhir.
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
{@link category}, 
{@link description}, 
{@link priority}, 
{@link start}, 
{@link addresses}, 
{@link documentation}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getDescription},
{@link getPriority},
{@link getStart},
{@link getAddresses},
{@link getDocumentation},
{@link getTarget},
{@link setCategory},
{@link setDescription},
{@link setPriority},
{@link setStart},
{@link setAddresses},
{@link setDocumentation},
{@link setTarget},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")

public interface PlanDefinitionGoal extends GenericEntity, fhir.BackboneElement {

	EntityType<PlanDefinitionGoal> T = EntityTypes.T(PlanDefinitionGoal.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String description = "description";
	java.lang.String priority = "priority";
	java.lang.String start = "start";
	java.lang.String addresses = "addresses";
	java.lang.String documentation = "documentation";
	java.lang.String target = "target";

	@Description("Indicates a category the goal falls within.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("Human-readable and/or coded description of a specific desired objective of care, such as 'control blood pressure' or 'negotiate an obstacle course' or 'dance with child at wedding'.")
	@Mandatory
	fhir.CodeableConcept getDescription();
	void setDescription(fhir.CodeableConcept description);
	@Description("Identifies the expected level of importance associated with reaching/sustaining the defined goal.")
	@Mandatory
	fhir.CodeableConcept getPriority();
	void setPriority(fhir.CodeableConcept priority);
	@Description("The event after which the goal should begin being pursued.")
	@Mandatory
	fhir.CodeableConcept getStart();
	void setStart(fhir.CodeableConcept start);
	@Description("Identifies problems, conditions, issues, or concerns the goal is intended to address.")
	
	java.util.List<fhir.CodeableConcept> getAddresses();
	void setAddresses(java.util.List<fhir.CodeableConcept> addresses);

	@Description("Didactic or other informational resources associated with the goal that provide further supporting information about the goal. Information resources can include inline text commentary and links to web resources.")
	
	java.util.List<fhir.RelatedArtifact> getDocumentation();
	void setDocumentation(java.util.List<fhir.RelatedArtifact> documentation);

	@Description("Indicates what should be done and within what timeframe.")
	
	java.util.List<fhir.PlanDefinitionTarget> getTarget();
	void setTarget(java.util.List<fhir.PlanDefinitionTarget> target);

}
