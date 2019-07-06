/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPackaged of the Data Model fhir.
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
{@link subject}, 
{@link legalStatusOfSupply}, 
{@link marketingStatus}, 
{@link marketingAuthorization}, 
{@link manufacturer}, 
{@link batchIdentifier}, 
{@link packageItem}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getSubject},
{@link getLegalStatusOfSupply},
{@link getMarketingStatus},
{@link getMarketingAuthorization},
{@link getManufacturer},
{@link getBatchIdentifier},
{@link getPackageItem},
{@link setIdentifier},
{@link setSubject},
{@link setLegalStatusOfSupply},
{@link setMarketingStatus},
{@link setMarketingAuthorization},
{@link setManufacturer},
{@link setBatchIdentifier},
{@link setPackageItem},
 */

@Description("A medicinal product in a container or package.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductPackaged extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductPackaged> T = EntityTypes.T(MedicinalProductPackaged.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String subject = "subject";
	java.lang.String legalStatusOfSupply = "legalStatusOfSupply";
	java.lang.String marketingStatus = "marketingStatus";
	java.lang.String marketingAuthorization = "marketingAuthorization";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String batchIdentifier = "batchIdentifier";
	java.lang.String packageItem = "packageItem";

	@Description("Unique identifier.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The product with this is a pack for.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubject();
	void setSubject(java.util.List<com.braintribe.model.generic.GenericEntity> subject);

	@Description("The legal status of supply of the medicinal product as classified by the regulator.")
	@Mandatory
	fhir.CodeableConcept getLegalStatusOfSupply();
	void setLegalStatusOfSupply(fhir.CodeableConcept legalStatusOfSupply);
	@Description("Marketing information.")
	
	java.util.List<fhir.MarketingStatus> getMarketingStatus();
	void setMarketingStatus(java.util.List<fhir.MarketingStatus> marketingStatus);

	@Description("Manufacturer of this Package Item.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getMarketingAuthorization();
	void setMarketingAuthorization(com.braintribe.model.generic.GenericEntity marketingAuthorization);
	@Description("Manufacturer of this Package Item.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturer();
	void setManufacturer(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturer);

	@Description("Batch numbering.")
	
	java.util.List<fhir.MedicinalProductPackagedBatchIdentifier> getBatchIdentifier();
	void setBatchIdentifier(java.util.List<fhir.MedicinalProductPackagedBatchIdentifier> batchIdentifier);

	@Description("A packaging item, as a contained for medicine, possibly with other packaging items within.")
	
	java.util.List<fhir.MedicinalProductPackagedPackageItem> getPackageItem();
	void setPackageItem(java.util.List<fhir.MedicinalProductPackagedPackageItem> packageItem);

}
