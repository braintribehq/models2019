/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EpisodeOfCareDiagnosis of the Data Model fhir.
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
{@link role}, 

* It provides of then following operations (getters and setters)
{@link getCondition},
{@link getRole},
{@link setCondition},
{@link setRole},
 */

@Description("An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.")

public interface EpisodeOfCareDiagnosis extends GenericEntity, fhir.BackboneElement {

	EntityType<EpisodeOfCareDiagnosis> T = EntityTypes.T(EpisodeOfCareDiagnosis.class);

	/* Constants for each property name. */
	java.lang.String condition = "condition";
	java.lang.String role = "role";

	@Description("A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCondition();
	void setCondition(com.braintribe.model.generic.GenericEntity condition);
	@Description("Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge ?).")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
}
