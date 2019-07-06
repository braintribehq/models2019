/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CareTeam of the Data Model fhir.
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
{@link category}, 
{@link subject}, 
{@link encounter}, 
{@link period}, 
{@link participant}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link managingOrganization}, 
{@link telecom}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCategory},
{@link getSubject},
{@link getEncounter},
{@link getPeriod},
{@link getParticipant},
{@link getReasonCode},
{@link getReasonReference},
{@link getManagingOrganization},
{@link getTelecom},
{@link getNote},
{@link setIdentifier},
{@link setCategory},
{@link setSubject},
{@link setEncounter},
{@link setPeriod},
{@link setParticipant},
{@link setReasonCode},
{@link setReasonReference},
{@link setManagingOrganization},
{@link setTelecom},
{@link setNote},
 */

@Description("The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.If the element is present, it must have either a @value, an @id, or extensions")

public interface CareTeam extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CareTeam> T = EntityTypes.T(CareTeam.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String category = "category";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String period = "period";
	java.lang.String participant = "participant";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String telecom = "telecom";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this care team by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Identifies what kind of team.  This is to support differentiation between multiple co-existing teams, such as care plan team, episode of care team, longitudinal care team.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Identifies the patient or group whose intended care is handled by the team.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this CareTeam was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Indicates when the team did (or is intended to) come into effect and end.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Identifies all people and organizations who are expected to be involved in the care team.")
	
	java.util.List<fhir.CareTeamParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.CareTeamParticipant> participant);

	@Description("Describes why the care team exists.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Condition(s) that this care team addresses.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("The organization responsible for the care team.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManagingOrganization();
	void setManagingOrganization(java.util.List<com.braintribe.model.generic.GenericEntity> managingOrganization);

	@Description("A central contact detail for the care team (that applies to all members).")
	
	java.util.List<fhir.ContactPoint> getTelecom();
	void setTelecom(java.util.List<fhir.ContactPoint> telecom);

	@Description("Comments made about the CareTeam.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
