/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractTerm of the Data Model fhir.
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
{@link applies}, 
{@link topicCodeableConcept}, 
{@link topicReference}, 
{@link type}, 
{@link subType}, 
{@link securityLabel}, 
{@link offer}, 
{@link asset}, 
{@link action}, 
{@link group}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getApplies},
{@link getTopicCodeableConcept},
{@link getTopicReference},
{@link getType},
{@link getSubType},
{@link getSecurityLabel},
{@link getOffer},
{@link getAsset},
{@link getAction},
{@link getGroup},
{@link setIdentifier},
{@link setApplies},
{@link setTopicCodeableConcept},
{@link setTopicReference},
{@link setType},
{@link setSubType},
{@link setSecurityLabel},
{@link setOffer},
{@link setAsset},
{@link setAction},
{@link setGroup},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractTerm extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractTerm> T = EntityTypes.T(ContractTerm.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String applies = "applies";
	java.lang.String topicCodeableConcept = "topicCodeableConcept";
	java.lang.String topicReference = "topicReference";
	java.lang.String type = "type";
	java.lang.String subType = "subType";
	java.lang.String securityLabel = "securityLabel";
	java.lang.String offer = "offer";
	java.lang.String asset = "asset";
	java.lang.String action = "action";
	java.lang.String group = "group";

	@Description("Unique identifier for this particular Contract Provision.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Relevant time or time-period when this Contract Provision is applicable.")
	@Mandatory
	fhir.Period getApplies();
	void setApplies(fhir.Period applies);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getTopicCodeableConcept();
	void setTopicCodeableConcept(fhir.CodeableConcept topicCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTopicReference();
	void setTopicReference(com.braintribe.model.generic.GenericEntity topicReference);
	@Description("A legal clause or condition contained within a contract that requires one or both parties to perform a particular requirement by some specified time or prevents one or both parties from performing a particular requirement by some specified time.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A specialized legal clause or condition based on overarching contract type.")
	@Mandatory
	fhir.CodeableConcept getSubType();
	void setSubType(fhir.CodeableConcept subType);
	@Description("Security labels that protect the handling of information about the term and its elements, which may be specifically identified..")
	
	java.util.List<fhir.ContractSecurityLabel> getSecurityLabel();
	void setSecurityLabel(java.util.List<fhir.ContractSecurityLabel> securityLabel);

	@Description("The matter of concern in the context of this provision of the agrement.")
	@Mandatory
	fhir.ContractOffer getOffer();
	void setOffer(fhir.ContractOffer offer);
	@Description("Contract Term Asset List.")
	
	java.util.List<fhir.ContractAsset> getAsset();
	void setAsset(java.util.List<fhir.ContractAsset> asset);

	@Description("An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place.")
	
	java.util.List<fhir.ContractAction> getAction();
	void setAction(java.util.List<fhir.ContractAction> action);

	@Description("Nested group of Contract Provisions.")
	
	java.util.List<fhir.ContractTerm> getGroup();
	void setGroup(java.util.List<fhir.ContractTerm> group);

}
