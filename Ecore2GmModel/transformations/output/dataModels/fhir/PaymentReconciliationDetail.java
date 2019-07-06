/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PaymentReconciliationDetail of the Data Model fhir.
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
{@link predecessor}, 
{@link type}, 
{@link request}, 
{@link submitter}, 
{@link response}, 
{@link responsible}, 
{@link payee}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPredecessor},
{@link getType},
{@link getRequest},
{@link getSubmitter},
{@link getResponse},
{@link getResponsible},
{@link getPayee},
{@link getAmount},
{@link setIdentifier},
{@link setPredecessor},
{@link setType},
{@link setRequest},
{@link setSubmitter},
{@link setResponse},
{@link setResponsible},
{@link setPayee},
{@link setAmount},
 */

@Description("This resource provides the details including amount of a payment and allocates the payment items being paid.")

public interface PaymentReconciliationDetail extends GenericEntity, fhir.BackboneElement {

	EntityType<PaymentReconciliationDetail> T = EntityTypes.T(PaymentReconciliationDetail.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String predecessor = "predecessor";
	java.lang.String type = "type";
	java.lang.String request = "request";
	java.lang.String submitter = "submitter";
	java.lang.String response = "response";
	java.lang.String responsible = "responsible";
	java.lang.String payee = "payee";
	java.lang.String amount = "amount";

	@Description("Unique identifier for the current payment item for the referenced payable.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Unique identifier for the prior payment item for the referenced payable.")
	@Mandatory
	fhir.Identifier getPredecessor();
	void setPredecessor(fhir.Identifier predecessor);
	@Description("Code to indicate the nature of the payment.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A resource, such as a Claim, the evaluation of which could lead to payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The party which submitted the claim or financial transaction.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubmitter();
	void setSubmitter(com.braintribe.model.generic.GenericEntity submitter);
	@Description("A resource, such as a ClaimResponse, which contains a commitment to payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResponse();
	void setResponse(com.braintribe.model.generic.GenericEntity response);
	@Description("A reference to the individual who is responsible for inquiries regarding the response and its payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResponsible();
	void setResponsible(com.braintribe.model.generic.GenericEntity responsible);
	@Description("The party which is receiving the payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPayee();
	void setPayee(com.braintribe.model.generic.GenericEntity payee);
	@Description("The monetary amount allocated from the total payment to the payable.")
	@Mandatory
	fhir.Money getAmount();
	void setAmount(fhir.Money amount);
}
