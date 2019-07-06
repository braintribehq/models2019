/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Consent of the Data Model fhir.
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
{@link scope}, 
{@link category}, 
{@link patient}, 
{@link performer}, 
{@link organization}, 
{@link sourceAttachment}, 
{@link sourceReference}, 
{@link policy}, 
{@link policyRule}, 
{@link verification}, 
{@link provision}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getScope},
{@link getCategory},
{@link getPatient},
{@link getPerformer},
{@link getOrganization},
{@link getSourceAttachment},
{@link getSourceReference},
{@link getPolicy},
{@link getPolicyRule},
{@link getVerification},
{@link getProvision},
{@link setIdentifier},
{@link setScope},
{@link setCategory},
{@link setPatient},
{@link setPerformer},
{@link setOrganization},
{@link setSourceAttachment},
{@link setSourceReference},
{@link setPolicy},
{@link setPolicyRule},
{@link setVerification},
{@link setProvision},
 */

@Description("A record of a healthcare consumer?s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.If the element is present, it must have either a @value, an @id, or extensions")

public interface Consent extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Consent> T = EntityTypes.T(Consent.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String scope = "scope";
	java.lang.String category = "category";
	java.lang.String patient = "patient";
	java.lang.String performer = "performer";
	java.lang.String organization = "organization";
	java.lang.String sourceAttachment = "sourceAttachment";
	java.lang.String sourceReference = "sourceReference";
	java.lang.String policy = "policy";
	java.lang.String policyRule = "policyRule";
	java.lang.String verification = "verification";
	java.lang.String provision = "provision";

	@Description("Unique identifier for this copy of the Consent Statement.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A selector of the type of consent being presented: ADR, Privacy, Treatment, Research.  This list is now extensible.")
	@Mandatory
	fhir.CodeableConcept getScope();
	void setScope(fhir.CodeableConcept scope);
	@Description("A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("The patient/healthcare consumer to whom this consent applies.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPerformer();
	void setPerformer(java.util.List<com.braintribe.model.generic.GenericEntity> performer);

	@Description("The organization that manages the consent, and the framework within which it is executed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getOrganization();
	void setOrganization(java.util.List<com.braintribe.model.generic.GenericEntity> organization);

	@Description("")
	@Mandatory
	fhir.Attachment getSourceAttachment();
	void setSourceAttachment(fhir.Attachment sourceAttachment);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSourceReference();
	void setSourceReference(com.braintribe.model.generic.GenericEntity sourceReference);
	@Description("The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law.")
	
	java.util.List<fhir.ConsentPolicy> getPolicy();
	void setPolicy(java.util.List<fhir.ConsentPolicy> policy);

	@Description("A reference to the specific base computable regulation or policy.")
	@Mandatory
	fhir.CodeableConcept getPolicyRule();
	void setPolicyRule(fhir.CodeableConcept policyRule);
	@Description("Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the patient, his/her family or another authorized person.")
	
	java.util.List<fhir.ConsentVerification> getVerification();
	void setVerification(java.util.List<fhir.ConsentVerification> verification);

	@Description("An exception to the base policy of this consent. An exception can be an addition or removal of access permissions.")
	@Mandatory
	fhir.ConsentProvision getProvision();
	void setProvision(fhir.ConsentProvision provision);
}
