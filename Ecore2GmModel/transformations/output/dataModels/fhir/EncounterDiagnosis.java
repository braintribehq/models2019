/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EncounterDiagnosis of the Data Model fhir.
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
{@link condition}, 
{@link use}, 

* It provides of then following operations (getters and setters)
{@link getCondition},
{@link getUse},
{@link setCondition},
{@link setUse},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")

public interface EncounterDiagnosis extends GenericEntity, fhir.BackboneElement {

	EntityType<EncounterDiagnosis> T = EntityTypes.T(EncounterDiagnosis.class);

	/* Constants for each property name. */
	java.lang.String condition = "condition";
	java.lang.String use = "use";

	@Description("Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCondition();
	void setCondition(com.braintribe.model.generic.GenericEntity condition);
	@Description("Role that this diagnosis has within the encounter (e.g. admission, billing, discharge ?).")
	@Mandatory
	fhir.CodeableConcept getUse();
	void setUse(fhir.CodeableConcept use);
}
