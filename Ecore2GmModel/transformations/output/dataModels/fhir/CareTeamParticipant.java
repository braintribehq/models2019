/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CareTeamParticipant of the Data Model fhir.
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
{@link role}, 
{@link member}, 
{@link onBehalfOf}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link getMember},
{@link getOnBehalfOf},
{@link getPeriod},
{@link setRole},
{@link setMember},
{@link setOnBehalfOf},
{@link setPeriod},
 */

@Description("The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.")

public interface CareTeamParticipant extends GenericEntity, fhir.BackboneElement {

	EntityType<CareTeamParticipant> T = EntityTypes.T(CareTeamParticipant.class);

	/* Constants for each property name. */
	java.lang.String role = "role";
	java.lang.String member = "member";
	java.lang.String onBehalfOf = "onBehalfOf";
	java.lang.String period = "period";

	@Description("Indicates specific responsibility of an individual within the care team, such as 'Primary care physician', 'Trained social worker counselor', 'Caregiver', etc.")
	
	java.util.List<fhir.CodeableConcept> getRole();
	void setRole(java.util.List<fhir.CodeableConcept> role);

	@Description("The specific person or organization who is participating/expected to participate in the care team.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getMember();
	void setMember(com.braintribe.model.generic.GenericEntity member);
	@Description("The organization of the practitioner.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOnBehalfOf();
	void setOnBehalfOf(com.braintribe.model.generic.GenericEntity onBehalfOf);
	@Description("Indicates when the specific member or organization did (or is intended to) come into effect and end.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
