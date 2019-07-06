/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Invoice of the Data Model fhir.
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
{@link type}, 
{@link subject}, 
{@link recipient}, 
{@link participant}, 
{@link issuer}, 
{@link account}, 
{@link lineItem}, 
{@link totalPriceComponent}, 
{@link totalNet}, 
{@link totalGross}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getSubject},
{@link getRecipient},
{@link getParticipant},
{@link getIssuer},
{@link getAccount},
{@link getLineItem},
{@link getTotalPriceComponent},
{@link getTotalNet},
{@link getTotalGross},
{@link getNote},
{@link setIdentifier},
{@link setType},
{@link setSubject},
{@link setRecipient},
{@link setParticipant},
{@link setIssuer},
{@link setAccount},
{@link setLineItem},
{@link setTotalPriceComponent},
{@link setTotalNet},
{@link setTotalGross},
{@link setNote},
 */

@Description("Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.If the element is present, it must have either a @value, an @id, or extensions")

public interface Invoice extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Invoice> T = EntityTypes.T(Invoice.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String subject = "subject";
	java.lang.String recipient = "recipient";
	java.lang.String participant = "participant";
	java.lang.String issuer = "issuer";
	java.lang.String account = "account";
	java.lang.String lineItem = "lineItem";
	java.lang.String totalPriceComponent = "totalPriceComponent";
	java.lang.String totalNet = "totalNet";
	java.lang.String totalGross = "totalGross";
	java.lang.String note = "note";

	@Description("Identifier of this Invoice, often used for reference in correspondence about this invoice or for tracking of payments.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Type of Invoice depending on domain, realm an usage (e.g. internal/external, dental, preliminary).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The individual or set of individuals receiving the goods and services billed in this invoice.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The individual or Organization responsible for balancing of this invoice.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecipient();
	void setRecipient(com.braintribe.model.generic.GenericEntity recipient);
	@Description("Indicates who or what performed or participated in the charged service.")
	
	java.util.List<fhir.InvoiceParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.InvoiceParticipant> participant);

	@Description("The organizationissuing the Invoice.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIssuer();
	void setIssuer(com.braintribe.model.generic.GenericEntity issuer);
	@Description("Account which is supposed to be balanced with this Invoice.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAccount();
	void setAccount(com.braintribe.model.generic.GenericEntity account);
	@Description("Each line item represents one charge for goods and services rendered. Details such as date, code and amount are found in the referenced ChargeItem resource.")
	
	java.util.List<fhir.InvoiceLineItem> getLineItem();
	void setLineItem(java.util.List<fhir.InvoiceLineItem> lineItem);

	@Description("The total amount for the Invoice may be calculated as the sum of the line items with surcharges/deductions that apply in certain conditions.  The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the total price was calculated.")
	
	java.util.List<fhir.InvoicePriceComponent> getTotalPriceComponent();
	void setTotalPriceComponent(java.util.List<fhir.InvoicePriceComponent> totalPriceComponent);

	@Description("Invoice total , taxes excluded.")
	@Mandatory
	fhir.Money getTotalNet();
	void setTotalNet(fhir.Money totalNet);
	@Description("Invoice total, tax included.")
	@Mandatory
	fhir.Money getTotalGross();
	void setTotalGross(fhir.Money totalGross);
	@Description("Comments made about the invoice by the issuer, subject, or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
