/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitDetail1 of the Data Model fhir.
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
{@link productOrService}, 
{@link modifier}, 
{@link quantity}, 
{@link unitPrice}, 
{@link net}, 
{@link adjudication}, 
{@link subDetail}, 

* It provides of then following operations (getters and setters)
{@link getProductOrService},
{@link getModifier},
{@link getQuantity},
{@link getUnitPrice},
{@link getNet},
{@link getAdjudication},
{@link getSubDetail},
{@link setProductOrService},
{@link setModifier},
{@link setQuantity},
{@link setUnitPrice},
{@link setNet},
{@link setAdjudication},
{@link setSubDetail},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitDetail1 extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitDetail1> T = EntityTypes.T(ExplanationOfBenefitDetail1.class);

	/* Constants for each property name. */
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String net = "net";
	java.lang.String adjudication = "adjudication";
	java.lang.String subDetail = "subDetail";

	@Description("When the value is a group code then this item collects a set of related claim details, otherwise this contains the product, service, drug or other billing code for the item.")
	@Mandatory
	fhir.CodeableConcept getProductOrService();
	void setProductOrService(fhir.CodeableConcept productOrService);
	@Description("Item typification or modifiers codes to convey additional context for the product or service.")
	
	java.util.List<fhir.CodeableConcept> getModifier();
	void setModifier(java.util.List<fhir.CodeableConcept> modifier);

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
	@Description("The adjudication results.")
	
	java.util.List<fhir.ExplanationOfBenefitAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ExplanationOfBenefitAdjudication> adjudication);

	@Description("The third-tier service adjudications for payor added services.")
	
	java.util.List<fhir.ExplanationOfBenefitSubDetail1> getSubDetail();
	void setSubDetail(java.util.List<fhir.ExplanationOfBenefitSubDetail1> subDetail);

}
