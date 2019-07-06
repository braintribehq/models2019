/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EpisodeOfCare of the Data Model fhir.
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
{@link statusHistory}, 
{@link type}, 
{@link diagnosis}, 
{@link patient}, 
{@link managingOrganization}, 
{@link period}, 
{@link referralRequest}, 
{@link careManager}, 
{@link team}, 
{@link account}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getStatusHistory},
{@link getType},
{@link getDiagnosis},
{@link getPatient},
{@link getManagingOrganization},
{@link getPeriod},
{@link getReferralRequest},
{@link getCareManager},
{@link getTeam},
{@link getAccount},
{@link setIdentifier},
{@link setStatusHistory},
{@link setType},
{@link setDiagnosis},
{@link setPatient},
{@link setManagingOrganization},
{@link setPeriod},
{@link setReferralRequest},
{@link setCareManager},
{@link setTeam},
{@link setAccount},
 */

@Description("An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.If the element is present, it must have either a @value, an @id, or extensions")

public interface EpisodeOfCare extends GenericEntity, fhir.FhirDomainResource {

	EntityType<EpisodeOfCare> T = EntityTypes.T(EpisodeOfCare.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String statusHistory = "statusHistory";
	java.lang.String type = "type";
	java.lang.String diagnosis = "diagnosis";
	java.lang.String patient = "patient";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String period = "period";
	java.lang.String referralRequest = "referralRequest";
	java.lang.String careManager = "careManager";
	java.lang.String team = "team";
	java.lang.String account = "account";

	@Description("The EpisodeOfCare may be known by different identifiers for different contexts of use, such as when an external agency is tracking the Episode for funding purposes.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource).")
	
	java.util.List<fhir.EpisodeOfCareStatusHistory> getStatusHistory();
	void setStatusHistory(java.util.List<fhir.EpisodeOfCareStatusHistory> statusHistory);

	@Description("A classification of the type of episode of care; e.g. specialist referral, disease management, type of funded care.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("The list of diagnosis relevant to this episode of care.")
	
	java.util.List<fhir.EpisodeOfCareDiagnosis> getDiagnosis();
	void setDiagnosis(java.util.List<fhir.EpisodeOfCareDiagnosis> diagnosis);

	@Description("The patient who is the focus of this episode of care.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The organization that has assumed the specific responsibilities for the specified duration.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingOrganization();
	void setManagingOrganization(com.braintribe.model.generic.GenericEntity managingOrganization);
	@Description("The interval during which the managing organization assumes the defined responsibility.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReferralRequest();
	void setReferralRequest(java.util.List<com.braintribe.model.generic.GenericEntity> referralRequest);

	@Description("The practitioner that is the care manager/care coordinator for this patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCareManager();
	void setCareManager(com.braintribe.model.generic.GenericEntity careManager);
	@Description("The list of practitioners that may be facilitating this episode of care for specific purposes.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getTeam();
	void setTeam(java.util.List<com.braintribe.model.generic.GenericEntity> team);

	@Description("The set of accounts that may be used for billing for this EpisodeOfCare.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAccount();
	void setAccount(java.util.List<com.braintribe.model.generic.GenericEntity> account);

}
