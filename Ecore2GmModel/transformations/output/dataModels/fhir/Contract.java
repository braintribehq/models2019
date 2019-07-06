/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Contract of the Data Model fhir.
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
{@link legalState}, 
{@link instantiatesCanonical}, 
{@link contentDerivative}, 
{@link applies}, 
{@link expirationType}, 
{@link subject}, 
{@link authority}, 
{@link domain}, 
{@link site}, 
{@link author}, 
{@link scope}, 
{@link topicCodeableConcept}, 
{@link topicReference}, 
{@link type}, 
{@link subType}, 
{@link contentDefinition}, 
{@link term}, 
{@link supportingInfo}, 
{@link relevantHistory}, 
{@link signer}, 
{@link friendly}, 
{@link legal}, 
{@link rule}, 
{@link legallyBindingAttachment}, 
{@link legallyBindingReference}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getLegalState},
{@link getInstantiatesCanonical},
{@link getContentDerivative},
{@link getApplies},
{@link getExpirationType},
{@link getSubject},
{@link getAuthority},
{@link getDomain},
{@link getSite},
{@link getAuthor},
{@link getScope},
{@link getTopicCodeableConcept},
{@link getTopicReference},
{@link getType},
{@link getSubType},
{@link getContentDefinition},
{@link getTerm},
{@link getSupportingInfo},
{@link getRelevantHistory},
{@link getSigner},
{@link getFriendly},
{@link getLegal},
{@link getRule},
{@link getLegallyBindingAttachment},
{@link getLegallyBindingReference},
{@link setIdentifier},
{@link setLegalState},
{@link setInstantiatesCanonical},
{@link setContentDerivative},
{@link setApplies},
{@link setExpirationType},
{@link setSubject},
{@link setAuthority},
{@link setDomain},
{@link setSite},
{@link setAuthor},
{@link setScope},
{@link setTopicCodeableConcept},
{@link setTopicReference},
{@link setType},
{@link setSubType},
{@link setContentDefinition},
{@link setTerm},
{@link setSupportingInfo},
{@link setRelevantHistory},
{@link setSigner},
{@link setFriendly},
{@link setLegal},
{@link setRule},
{@link setLegallyBindingAttachment},
{@link setLegallyBindingReference},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.If the element is present, it must have either a @value, an @id, or extensions")

public interface Contract extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Contract> T = EntityTypes.T(Contract.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String legalState = "legalState";
	java.lang.String instantiatesCanonical = "instantiatesCanonical";
	java.lang.String contentDerivative = "contentDerivative";
	java.lang.String applies = "applies";
	java.lang.String expirationType = "expirationType";
	java.lang.String subject = "subject";
	java.lang.String authority = "authority";
	java.lang.String domain = "domain";
	java.lang.String site = "site";
	java.lang.String author = "author";
	java.lang.String scope = "scope";
	java.lang.String topicCodeableConcept = "topicCodeableConcept";
	java.lang.String topicReference = "topicReference";
	java.lang.String type = "type";
	java.lang.String subType = "subType";
	java.lang.String contentDefinition = "contentDefinition";
	java.lang.String term = "term";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String relevantHistory = "relevantHistory";
	java.lang.String signer = "signer";
	java.lang.String friendly = "friendly";
	java.lang.String legal = "legal";
	java.lang.String rule = "rule";
	java.lang.String legallyBindingAttachment = "legallyBindingAttachment";
	java.lang.String legallyBindingReference = "legallyBindingReference";

	@Description("Unique identifier for this Contract or a derivative that references a Source Contract.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Legal states of the formation of a legal instrument, which is a formally executed written document that can be formally attributed to its author, records and formally expresses a legally enforceable act, process, or contractual duty, obligation, or right, and therefore evidences that act, process, or agreement.")
	@Mandatory
	fhir.CodeableConcept getLegalState();
	void setLegalState(fhir.CodeableConcept legalState);
	@Description("The URL pointing to a FHIR-defined Contract Definition that is adhered to in whole or part by this Contract.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInstantiatesCanonical();
	void setInstantiatesCanonical(com.braintribe.model.generic.GenericEntity instantiatesCanonical);
	@Description("The minimal content derived from the basal information source at a specific stage in its lifecycle.")
	@Mandatory
	fhir.CodeableConcept getContentDerivative();
	void setContentDerivative(fhir.CodeableConcept contentDerivative);
	@Description("Relevant time or time-period when this Contract is applicable.")
	@Mandatory
	fhir.Period getApplies();
	void setApplies(fhir.Period applies);
	@Description("Event resulting in discontinuation or termination of this Contract instance by one or more parties to the contract.")
	@Mandatory
	fhir.CodeableConcept getExpirationType();
	void setExpirationType(fhir.CodeableConcept expirationType);
	@Description("The target entity impacted by or of interest to parties to the agreement.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthority();
	void setAuthority(java.util.List<com.braintribe.model.generic.GenericEntity> authority);

	@Description("Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDomain();
	void setDomain(java.util.List<com.braintribe.model.generic.GenericEntity> domain);

	@Description("Sites in which the contract is complied with,  exercised, or in force.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSite();
	void setSite(java.util.List<com.braintribe.model.generic.GenericEntity> site);

	@Description("The individual or organization that authored the Contract definition, derivative, or instance in any legal state.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("A selector of legal concerns for this Contract definition, derivative, or instance in any legal state.")
	@Mandatory
	fhir.CodeableConcept getScope();
	void setScope(fhir.CodeableConcept scope);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getTopicCodeableConcept();
	void setTopicCodeableConcept(fhir.CodeableConcept topicCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTopicReference();
	void setTopicReference(com.braintribe.model.generic.GenericEntity topicReference);
	@Description("A high-level category for the legal instrument, whether constructed as a Contract definition, derivative, or instance in any legal state.  Provides additional information about its content within the context of the Contract's scope to distinguish the kinds of systems that would be interested in the contract.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Sub-category for the Contract that distinguishes the kinds of systems that would be interested in the Contract within the context of the Contract's scope.")
	
	java.util.List<fhir.CodeableConcept> getSubType();
	void setSubType(java.util.List<fhir.CodeableConcept> subType);

	@Description("Precusory content developed with a focus and intent of supporting the formation a Contract instance, which may be associated with and transformable into a Contract.")
	@Mandatory
	fhir.ContractContentDefinition getContentDefinition();
	void setContentDefinition(fhir.ContractContentDefinition contentDefinition);
	@Description("One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.")
	
	java.util.List<fhir.ContractTerm> getTerm();
	void setTerm(java.util.List<fhir.ContractTerm> term);

	@Description("Information that may be needed by/relevant to the performer in their execution of this term action.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInfo();
	void setSupportingInfo(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInfo);

	@Description("Links to Provenance records for past versions of this Contract definition, derivative, or instance, which identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the Contract.  The Provence.entity indicates the target that was changed in the update. http://build.fhir.org/provenance-definitions.html#Provenance.entity.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRelevantHistory();
	void setRelevantHistory(java.util.List<com.braintribe.model.generic.GenericEntity> relevantHistory);

	@Description("Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.")
	
	java.util.List<fhir.ContractSigner> getSigner();
	void setSigner(java.util.List<fhir.ContractSigner> signer);

	@Description("The 'patient friendly language' versionof the Contract in whole or in parts. 'Patient friendly language' means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.")
	
	java.util.List<fhir.ContractFriendly> getFriendly();
	void setFriendly(java.util.List<fhir.ContractFriendly> friendly);

	@Description("List of Legal expressions or representations of this Contract.")
	
	java.util.List<fhir.ContractLegal> getLegal();
	void setLegal(java.util.List<fhir.ContractLegal> legal);

	@Description("List of Computable Policy Rule Language Representations of this Contract.")
	
	java.util.List<fhir.ContractRule> getRule();
	void setRule(java.util.List<fhir.ContractRule> rule);

	@Description("")
	@Mandatory
	fhir.Attachment getLegallyBindingAttachment();
	void setLegallyBindingAttachment(fhir.Attachment legallyBindingAttachment);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLegallyBindingReference();
	void setLegallyBindingReference(com.braintribe.model.generic.GenericEntity legallyBindingReference);
}
