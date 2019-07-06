/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefitAddItem of the Data Model fhir.
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
{@link provider}, 
{@link productOrService}, 
{@link modifier}, 
{@link programCode}, 
{@link servicedPeriod}, 
{@link locationCodeableConcept}, 
{@link locationAddress}, 
{@link locationReference}, 
{@link quantity}, 
{@link unitPrice}, 
{@link net}, 
{@link bodySite}, 
{@link subSite}, 
{@link adjudication}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getProvider},
{@link getProductOrService},
{@link getModifier},
{@link getProgramCode},
{@link getServicedPeriod},
{@link getLocationCodeableConcept},
{@link getLocationAddress},
{@link getLocationReference},
{@link getQuantity},
{@link getUnitPrice},
{@link getNet},
{@link getBodySite},
{@link getSubSite},
{@link getAdjudication},
{@link getDetail},
{@link setProvider},
{@link setProductOrService},
{@link setModifier},
{@link setProgramCode},
{@link setServicedPeriod},
{@link setLocationCodeableConcept},
{@link setLocationAddress},
{@link setLocationReference},
{@link setQuantity},
{@link setUnitPrice},
{@link setNet},
{@link setBodySite},
{@link setSubSite},
{@link setAdjudication},
{@link setDetail},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.")

public interface ExplanationOfBenefitAddItem extends GenericEntity, fhir.BackboneElement {

	EntityType<ExplanationOfBenefitAddItem> T = EntityTypes.T(ExplanationOfBenefitAddItem.class);

	/* Constants for each property name. */
	java.lang.String provider = "provider";
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String programCode = "programCode";
	java.lang.String servicedPeriod = "servicedPeriod";
	java.lang.String locationCodeableConcept = "locationCodeableConcept";
	java.lang.String locationAddress = "locationAddress";
	java.lang.String locationReference = "locationReference";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String net = "net";
	java.lang.String bodySite = "bodySite";
	java.lang.String subSite = "subSite";
	java.lang.String adjudication = "adjudication";
	java.lang.String detail = "detail";

	@Description("The providers who are authorized for the services rendered to the patient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getProvider();
	void setProvider(java.util.List<com.braintribe.model.generic.GenericEntity> provider);

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

	@Description("")
	@Mandatory
	fhir.Period getServicedPeriod();
	void setServicedPeriod(fhir.Period servicedPeriod);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getLocationCodeableConcept();
	void setLocationCodeableConcept(fhir.CodeableConcept locationCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Address getLocationAddress();
	void setLocationAddress(fhir.Address locationAddress);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocationReference();
	void setLocationReference(com.braintribe.model.generic.GenericEntity locationReference);
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
	@Description("Physical service site on the patient (limb, tooth, etc.).")
	@Mandatory
	fhir.CodeableConcept getBodySite();
	void setBodySite(fhir.CodeableConcept bodySite);
	@Description("A region or surface of the bodySite, e.g. limb region or tooth surface(s).")
	
	java.util.List<fhir.CodeableConcept> getSubSite();
	void setSubSite(java.util.List<fhir.CodeableConcept> subSite);

	@Description("The adjudication results.")
	
	java.util.List<fhir.ExplanationOfBenefitAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ExplanationOfBenefitAdjudication> adjudication);

	@Description("The second-tier service adjudications for payor added services.")
	
	java.util.List<fhir.ExplanationOfBenefitDetail1> getDetail();
	void setDetail(java.util.List<fhir.ExplanationOfBenefitDetail1> detail);

}
