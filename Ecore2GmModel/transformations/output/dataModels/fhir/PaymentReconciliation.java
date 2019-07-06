/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PaymentReconciliation of the Data Model fhir.
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
{@link period}, 
{@link paymentIssuer}, 
{@link request}, 
{@link requestor}, 
{@link paymentAmount}, 
{@link paymentIdentifier}, 
{@link detail}, 
{@link formCode}, 
{@link processNote}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPeriod},
{@link getPaymentIssuer},
{@link getRequest},
{@link getRequestor},
{@link getPaymentAmount},
{@link getPaymentIdentifier},
{@link getDetail},
{@link getFormCode},
{@link getProcessNote},
{@link setIdentifier},
{@link setPeriod},
{@link setPaymentIssuer},
{@link setRequest},
{@link setRequestor},
{@link setPaymentAmount},
{@link setPaymentIdentifier},
{@link setDetail},
{@link setFormCode},
{@link setProcessNote},
 */

@Description("This resource provides the details including amount of a payment and allocates the payment items being paid.If the element is present, it must have either a @value, an @id, or extensions")

public interface PaymentReconciliation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<PaymentReconciliation> T = EntityTypes.T(PaymentReconciliation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String period = "period";
	java.lang.String paymentIssuer = "paymentIssuer";
	java.lang.String request = "request";
	java.lang.String requestor = "requestor";
	java.lang.String paymentAmount = "paymentAmount";
	java.lang.String paymentIdentifier = "paymentIdentifier";
	java.lang.String detail = "detail";
	java.lang.String formCode = "formCode";
	java.lang.String processNote = "processNote";

	@Description("A unique identifier assigned to this payment reconciliation.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The period of time for which payments have been gathered into this bulk payment for settlement.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The party who generated the payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPaymentIssuer();
	void setPaymentIssuer(com.braintribe.model.generic.GenericEntity paymentIssuer);
	@Description("Original request resource reference.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The practitioner who is responsible for the services rendered to the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequestor();
	void setRequestor(com.braintribe.model.generic.GenericEntity requestor);
	@Description("Total payment amount as indicated on the financial instrument.")
	@Mandatory
	fhir.Money getPaymentAmount();
	void setPaymentAmount(fhir.Money paymentAmount);
	@Description("Issuer's unique identifier for the payment instrument.")
	@Mandatory
	fhir.Identifier getPaymentIdentifier();
	void setPaymentIdentifier(fhir.Identifier paymentIdentifier);
	@Description("Distribution of the payment amount for a previously acknowledged payable.")
	
	java.util.List<fhir.PaymentReconciliationDetail> getDetail();
	void setDetail(java.util.List<fhir.PaymentReconciliationDetail> detail);

	@Description("A code for the form to be used for printing the content.")
	@Mandatory
	fhir.CodeableConcept getFormCode();
	void setFormCode(fhir.CodeableConcept formCode);
	@Description("A note that describes or explains the processing in a human readable form.")
	
	java.util.List<fhir.PaymentReconciliationProcessNote> getProcessNote();
	void setProcessNote(java.util.List<fhir.PaymentReconciliationProcessNote> processNote);

}
