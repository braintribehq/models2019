/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityRequestItem of the Data Model fhir.
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
{@link category}, 
{@link productOrService}, 
{@link modifier}, 
{@link provider}, 
{@link quantity}, 
{@link unitPrice}, 
{@link facility}, 
{@link diagnosis}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getProductOrService},
{@link getModifier},
{@link getProvider},
{@link getQuantity},
{@link getUnitPrice},
{@link getFacility},
{@link getDiagnosis},
{@link getDetail},
{@link setCategory},
{@link setProductOrService},
{@link setModifier},
{@link setProvider},
{@link setQuantity},
{@link setUnitPrice},
{@link setFacility},
{@link setDiagnosis},
{@link setDetail},
 */

@Description("The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.")

public interface CoverageEligibilityRequestItem extends GenericEntity, fhir.BackboneElement {

	EntityType<CoverageEligibilityRequestItem> T = EntityTypes.T(CoverageEligibilityRequestItem.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String provider = "provider";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String facility = "facility";
	java.lang.String diagnosis = "diagnosis";
	java.lang.String detail = "detail";

	@Description("Code to identify the general type of benefits under which products and services are provided.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("This contains the product, service, drug or other billing code for the item.")
	@Mandatory
	fhir.CodeableConcept getProductOrService();
	void setProductOrService(fhir.CodeableConcept productOrService);
	@Description("Item typification or modifiers codes to convey additional context for the product or service.")
	
	java.util.List<fhir.CodeableConcept> getModifier();
	void setModifier(java.util.List<fhir.CodeableConcept> modifier);

	@Description("The practitioner who is responsible for the product or service to be rendered to the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("The number of repetitions of a service or product.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The amount charged to the patient by the provider for a single unit.")
	@Mandatory
	fhir.Money getUnitPrice();
	void setUnitPrice(fhir.Money unitPrice);
	@Description("Facility where the services will be provided.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFacility();
	void setFacility(com.braintribe.model.generic.GenericEntity facility);
	@Description("Patient diagnosis for which care is sought.")
	
	java.util.List<fhir.CoverageEligibilityRequestDiagnosis> getDiagnosis();
	void setDiagnosis(java.util.List<fhir.CoverageEligibilityRequestDiagnosis> diagnosis);

	@Description("The plan/proposal/order describing the proposed service in detail.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDetail();
	void setDetail(java.util.List<com.braintribe.model.generic.GenericEntity> detail);

}
