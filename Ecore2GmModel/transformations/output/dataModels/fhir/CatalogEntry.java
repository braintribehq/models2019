/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CatalogEntry of the Data Model fhir.
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
{@link referencedItem}, 
{@link additionalIdentifier}, 
{@link classification}, 
{@link validityPeriod}, 
{@link additionalCharacteristic}, 
{@link additionalClassification}, 
{@link relatedEntry}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getReferencedItem},
{@link getAdditionalIdentifier},
{@link getClassification},
{@link getValidityPeriod},
{@link getAdditionalCharacteristic},
{@link getAdditionalClassification},
{@link getRelatedEntry},
{@link setIdentifier},
{@link setType},
{@link setReferencedItem},
{@link setAdditionalIdentifier},
{@link setClassification},
{@link setValidityPeriod},
{@link setAdditionalCharacteristic},
{@link setAdditionalClassification},
{@link setRelatedEntry},
 */

@Description("Catalog entries are wrappers that contextualize items included in a catalog.If the element is present, it must have either a @value, an @id, or extensions")

public interface CatalogEntry extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CatalogEntry> T = EntityTypes.T(CatalogEntry.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String referencedItem = "referencedItem";
	java.lang.String additionalIdentifier = "additionalIdentifier";
	java.lang.String classification = "classification";
	java.lang.String validityPeriod = "validityPeriod";
	java.lang.String additionalCharacteristic = "additionalCharacteristic";
	java.lang.String additionalClassification = "additionalClassification";
	java.lang.String relatedEntry = "relatedEntry";

	@Description("Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The type of item - medication, device, service, protocol or other.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The item in a catalog or definition.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferencedItem();
	void setReferencedItem(com.braintribe.model.generic.GenericEntity referencedItem);
	@Description("Used in supporting related concepts, e.g. NDC to RxNorm.")
	
	java.util.List<fhir.Identifier> getAdditionalIdentifier();
	void setAdditionalIdentifier(java.util.List<fhir.Identifier> additionalIdentifier);

	@Description("Classes of devices, or ATC for medication.")
	
	java.util.List<fhir.CodeableConcept> getClassification();
	void setClassification(java.util.List<fhir.CodeableConcept> classification);

	@Description("The time period in which this catalog entry is expected to be active.")
	@Mandatory
	fhir.Period getValidityPeriod();
	void setValidityPeriod(fhir.Period validityPeriod);
	@Description("Used for examplefor Out of Formulary, or any specifics.")
	
	java.util.List<fhir.CodeableConcept> getAdditionalCharacteristic();
	void setAdditionalCharacteristic(java.util.List<fhir.CodeableConcept> additionalCharacteristic);

	@Description("User for example for ATC classification, or.")
	
	java.util.List<fhir.CodeableConcept> getAdditionalClassification();
	void setAdditionalClassification(java.util.List<fhir.CodeableConcept> additionalClassification);

	@Description("Used for example, to point to a substance, or to a device used to administer a medication.")
	
	java.util.List<fhir.CatalogEntryRelatedEntry> getRelatedEntry();
	void setRelatedEntry(java.util.List<fhir.CatalogEntryRelatedEntry> relatedEntry);

}
