/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PaymentNotice of the Data Model fhir.
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
{@link request}, 
{@link response}, 
{@link provider}, 
{@link payment}, 
{@link payee}, 
{@link recipient}, 
{@link amount}, 
{@link paymentStatus}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getRequest},
{@link getResponse},
{@link getProvider},
{@link getPayment},
{@link getPayee},
{@link getRecipient},
{@link getAmount},
{@link getPaymentStatus},
{@link setIdentifier},
{@link setRequest},
{@link setResponse},
{@link setProvider},
{@link setPayment},
{@link setPayee},
{@link setRecipient},
{@link setAmount},
{@link setPaymentStatus},
 */

@Description("This resource provides the status of the payment for goods and services rendered, and the request and response resource references.If the element is present, it must have either a @value, an @id, or extensions")

public interface PaymentNotice extends GenericEntity, fhir.FhirDomainResource {

	EntityType<PaymentNotice> T = EntityTypes.T(PaymentNotice.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String request = "request";
	java.lang.String response = "response";
	java.lang.String provider = "provider";
	java.lang.String payment = "payment";
	java.lang.String payee = "payee";
	java.lang.String recipient = "recipient";
	java.lang.String amount = "amount";
	java.lang.String paymentStatus = "paymentStatus";

	@Description("A unique identifier assigned to this payment notice.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Reference of resource for which payment is being made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("Reference of response to resource for which payment is being made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResponse();
	void setResponse(com.braintribe.model.generic.GenericEntity response);
	@Description("The practitioner who is responsible for the services rendered to the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("A reference to the payment which is the subject of this notice.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPayment();
	void setPayment(com.braintribe.model.generic.GenericEntity payment);
	@Description("The party who will receive or has received payment that is the subject of this notification.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPayee();
	void setPayee(com.braintribe.model.generic.GenericEntity payee);
	@Description("The party who is notified of the payment status.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecipient();
	void setRecipient(com.braintribe.model.generic.GenericEntity recipient);
	@Description("The amount sent to the payee.")
	@Mandatory
	fhir.Money getAmount();
	void setAmount(fhir.Money amount);
	@Description("A code indicating whether payment has been sent or cleared.")
	@Mandatory
	fhir.CodeableConcept getPaymentStatus();
	void setPaymentStatus(fhir.CodeableConcept paymentStatus);
}
