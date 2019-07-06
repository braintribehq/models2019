/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProduct of the Data Model fhir.
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
{@link domain}, 
{@link combinedPharmaceuticalDoseForm}, 
{@link legalStatusOfSupply}, 
{@link additionalMonitoringIndicator}, 
{@link paediatricUseIndicator}, 
{@link productClassification}, 
{@link marketingStatus}, 
{@link pharmaceuticalProduct}, 
{@link packagedMedicinalProduct}, 
{@link attachedDocument}, 
{@link masterFile}, 
{@link contact}, 
{@link clinicalTrial}, 
{@link name}, 
{@link crossReference}, 
{@link manufacturingBusinessOperation}, 
{@link specialDesignation}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getDomain},
{@link getCombinedPharmaceuticalDoseForm},
{@link getLegalStatusOfSupply},
{@link getAdditionalMonitoringIndicator},
{@link getPaediatricUseIndicator},
{@link getProductClassification},
{@link getMarketingStatus},
{@link getPharmaceuticalProduct},
{@link getPackagedMedicinalProduct},
{@link getAttachedDocument},
{@link getMasterFile},
{@link getContact},
{@link getClinicalTrial},
{@link getName},
{@link getCrossReference},
{@link getManufacturingBusinessOperation},
{@link getSpecialDesignation},
{@link setIdentifier},
{@link setType},
{@link setDomain},
{@link setCombinedPharmaceuticalDoseForm},
{@link setLegalStatusOfSupply},
{@link setAdditionalMonitoringIndicator},
{@link setPaediatricUseIndicator},
{@link setProductClassification},
{@link setMarketingStatus},
{@link setPharmaceuticalProduct},
{@link setPackagedMedicinalProduct},
{@link setAttachedDocument},
{@link setMasterFile},
{@link setContact},
{@link setClinicalTrial},
{@link setName},
{@link setCrossReference},
{@link setManufacturingBusinessOperation},
{@link setSpecialDesignation},
 */

@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProduct extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProduct> T = EntityTypes.T(MedicinalProduct.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String domain = "domain";
	java.lang.String combinedPharmaceuticalDoseForm = "combinedPharmaceuticalDoseForm";
	java.lang.String legalStatusOfSupply = "legalStatusOfSupply";
	java.lang.String additionalMonitoringIndicator = "additionalMonitoringIndicator";
	java.lang.String paediatricUseIndicator = "paediatricUseIndicator";
	java.lang.String productClassification = "productClassification";
	java.lang.String marketingStatus = "marketingStatus";
	java.lang.String pharmaceuticalProduct = "pharmaceuticalProduct";
	java.lang.String packagedMedicinalProduct = "packagedMedicinalProduct";
	java.lang.String attachedDocument = "attachedDocument";
	java.lang.String masterFile = "masterFile";
	java.lang.String contact = "contact";
	java.lang.String clinicalTrial = "clinicalTrial";
	java.lang.String name = "name";
	java.lang.String crossReference = "crossReference";
	java.lang.String manufacturingBusinessOperation = "manufacturingBusinessOperation";
	java.lang.String specialDesignation = "specialDesignation";

	@Description("Business identifier for this product. Could be an MPID.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Regulatory type, e.g. Investigational or Authorized.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("If this medicine applies to human or veterinary uses.")
	@Mandatory
	fhir.Coding getDomain();
	void setDomain(fhir.Coding domain);
	@Description("The dose form for a single part product, or combined form of a multiple part product.")
	@Mandatory
	fhir.CodeableConcept getCombinedPharmaceuticalDoseForm();
	void setCombinedPharmaceuticalDoseForm(fhir.CodeableConcept combinedPharmaceuticalDoseForm);
	@Description("The legal status of supply of the medicinal product as classified by the regulator.")
	@Mandatory
	fhir.CodeableConcept getLegalStatusOfSupply();
	void setLegalStatusOfSupply(fhir.CodeableConcept legalStatusOfSupply);
	@Description("Whether the Medicinal Product is subject to additional monitoring for regulatory reasons.")
	@Mandatory
	fhir.CodeableConcept getAdditionalMonitoringIndicator();
	void setAdditionalMonitoringIndicator(fhir.CodeableConcept additionalMonitoringIndicator);
	@Description("If authorised for use in children.")
	@Mandatory
	fhir.CodeableConcept getPaediatricUseIndicator();
	void setPaediatricUseIndicator(fhir.CodeableConcept paediatricUseIndicator);
	@Description("Allows the product to be classified by various systems.")
	
	java.util.List<fhir.CodeableConcept> getProductClassification();
	void setProductClassification(java.util.List<fhir.CodeableConcept> productClassification);

	@Description("Marketing status of the medicinal product, in contrast to marketing authorizaton.")
	
	java.util.List<fhir.MarketingStatus> getMarketingStatus();
	void setMarketingStatus(java.util.List<fhir.MarketingStatus> marketingStatus);

	@Description("Pharmaceutical aspects of product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPharmaceuticalProduct();
	void setPharmaceuticalProduct(java.util.List<com.braintribe.model.generic.GenericEntity> pharmaceuticalProduct);

	@Description("Package representation for the product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPackagedMedicinalProduct();
	void setPackagedMedicinalProduct(java.util.List<com.braintribe.model.generic.GenericEntity> packagedMedicinalProduct);

	@Description("Supporting documentation, typically for regulatory submission.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAttachedDocument();
	void setAttachedDocument(java.util.List<com.braintribe.model.generic.GenericEntity> attachedDocument);

	@Description("A master file for to the medicinal product (e.g. Pharmacovigilance System Master File).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getMasterFile();
	void setMasterFile(java.util.List<com.braintribe.model.generic.GenericEntity> masterFile);

	@Description("A product specific contact, person (in a role), or an organization.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContact();
	void setContact(java.util.List<com.braintribe.model.generic.GenericEntity> contact);

	@Description("Clinical trials or studies that this product is involved in.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getClinicalTrial();
	void setClinicalTrial(java.util.List<com.braintribe.model.generic.GenericEntity> clinicalTrial);

	@Description("The product's name, including full name and possibly coded parts.")
	
	java.util.List<fhir.MedicinalProductName> getName();
	void setName(java.util.List<fhir.MedicinalProductName> name);

	@Description("Reference to another product, e.g. for linking authorised to investigational product.")
	
	java.util.List<fhir.Identifier> getCrossReference();
	void setCrossReference(java.util.List<fhir.Identifier> crossReference);

	@Description("An operation applied to the product, for manufacturing or adminsitrative purpose.")
	
	java.util.List<fhir.MedicinalProductManufacturingBusinessOperation> getManufacturingBusinessOperation();
	void setManufacturingBusinessOperation(java.util.List<fhir.MedicinalProductManufacturingBusinessOperation> manufacturingBusinessOperation);

	@Description("Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.")
	
	java.util.List<fhir.MedicinalProductSpecialDesignation> getSpecialDesignation();
	void setSpecialDesignation(java.util.List<fhir.MedicinalProductSpecialDesignation> specialDesignation);

}
