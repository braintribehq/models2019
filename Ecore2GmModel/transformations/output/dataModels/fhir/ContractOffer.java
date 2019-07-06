/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractOffer of the Data Model fhir.
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
{@link party}, 
{@link topic}, 
{@link type}, 
{@link decision}, 
{@link decisionMode}, 
{@link answer}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getParty},
{@link getTopic},
{@link getType},
{@link getDecision},
{@link getDecisionMode},
{@link getAnswer},
{@link setIdentifier},
{@link setParty},
{@link setTopic},
{@link setType},
{@link setDecision},
{@link setDecisionMode},
{@link setAnswer},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractOffer extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractOffer> T = EntityTypes.T(ContractOffer.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String party = "party";
	java.lang.String topic = "topic";
	java.lang.String type = "type";
	java.lang.String decision = "decision";
	java.lang.String decisionMode = "decisionMode";
	java.lang.String answer = "answer";

	@Description("Unique identifier for this particular Contract Provision.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Offer Recipient.")
	
	java.util.List<fhir.ContractParty> getParty();
	void setParty(java.util.List<fhir.ContractParty> party);

	@Description("The owner of an asset has the residual control rights over the asset: the right to decide all usages of the asset in any way not inconsistent with a prior contract, custom, or law (Hart, 1995, p. 30).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTopic();
	void setTopic(com.braintribe.model.generic.GenericEntity topic);
	@Description("Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Type of choice made by accepting party with respect to an offer made by an offeror/ grantee.")
	@Mandatory
	fhir.CodeableConcept getDecision();
	void setDecision(fhir.CodeableConcept decision);
	@Description("How the decision about a Contract was conveyed.")
	
	java.util.List<fhir.CodeableConcept> getDecisionMode();
	void setDecisionMode(java.util.List<fhir.CodeableConcept> decisionMode);

	@Description("Response to offer text.")
	
	java.util.List<fhir.ContractAnswer> getAnswer();
	void setAnswer(java.util.List<fhir.ContractAnswer> answer);

}
