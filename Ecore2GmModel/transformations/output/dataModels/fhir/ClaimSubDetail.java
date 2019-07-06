/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimSubDetail of the Data Model fhir.
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
{@link revenue}, 
{@link category}, 
{@link productOrService}, 
{@link modifier}, 
{@link programCode}, 
{@link quantity}, 
{@link unitPrice}, 
{@link net}, 
{@link udi}, 

* It provides of then following operations (getters and setters)
{@link getRevenue},
{@link getCategory},
{@link getProductOrService},
{@link getModifier},
{@link getProgramCode},
{@link getQuantity},
{@link getUnitPrice},
{@link getNet},
{@link getUdi},
{@link setRevenue},
{@link setCategory},
{@link setProductOrService},
{@link setModifier},
{@link setProgramCode},
{@link setQuantity},
{@link setUnitPrice},
{@link setNet},
{@link setUdi},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.")

public interface ClaimSubDetail extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimSubDetail> T = EntityTypes.T(ClaimSubDetail.class);

	/* Constants for each property name. */
	java.lang.String revenue = "revenue";
	java.lang.String category = "category";
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String programCode = "programCode";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String net = "net";
	java.lang.String udi = "udi";

	@Description("The type of revenue or cost center providing the product and/or service.")
	@Mandatory
	fhir.CodeableConcept getRevenue();
	void setRevenue(fhir.CodeableConcept revenue);
	@Description("Code to identify the general type of benefits under which products and services are provided.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("When the value is a group code then this item collects a set of related claim details, otherwise this contains the product, service, drug or other billing code for the item.")
	@Mandatory
	fhir.CodeableConcept getProductOrService();
	void setProductOrService(fhir.CodeableConcept productOrService);
	@Description("Item typification or modifiers codes to convey additional context for the product or service.")
	
	java.util.List<fhir.CodeableConcept> getModifier();
	void setModifier(java.util.List<fhir.CodeableConcept> modifier);

	@Description("Identifies the program under which this may be recovered.")
	
	java.util.List<fhir.CodeableConcept> getProgramCode();
	void setProgramCode(java.util.List<fhir.CodeableConcept> programCode);

	@Description("The number of repetitions of a service or product.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.")
	@Mandatory
	fhir.Money getUnitPrice();
	void setUnitPrice(fhir.Money unitPrice);
	@Description("The quantity times the unit price for an additional service or product or charge.")
	@Mandatory
	fhir.Money getNet();
	void setNet(fhir.Money net);
	@Description("Unique Device Identifiers associated with this line item.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getUdi();
	void setUdi(java.util.List<com.braintribe.model.generic.GenericEntity> udi);

}
