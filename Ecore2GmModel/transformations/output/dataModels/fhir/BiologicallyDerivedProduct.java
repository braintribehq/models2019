/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BiologicallyDerivedProduct of the Data Model fhir.
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
{@link productCode}, 
{@link request}, 
{@link parent}, 
{@link collection}, 
{@link processing}, 
{@link manipulation}, 
{@link storage}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getProductCode},
{@link getRequest},
{@link getParent},
{@link getCollection},
{@link getProcessing},
{@link getManipulation},
{@link getStorage},
{@link setIdentifier},
{@link setProductCode},
{@link setRequest},
{@link setParent},
{@link setCollection},
{@link setProcessing},
{@link setManipulation},
{@link setStorage},
 */

@Description("A material substance originating from a biological entity intended to be transplanted or infusedinto another (possibly the same) biological entity.If the element is present, it must have either a @value, an @id, or extensions")

public interface BiologicallyDerivedProduct extends GenericEntity, fhir.FhirDomainResource {

	EntityType<BiologicallyDerivedProduct> T = EntityTypes.T(BiologicallyDerivedProduct.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String productCode = "productCode";
	java.lang.String request = "request";
	java.lang.String parent = "parent";
	java.lang.String collection = "collection";
	java.lang.String processing = "processing";
	java.lang.String manipulation = "manipulation";
	java.lang.String storage = "storage";

	@Description("This records identifiers associated with this biologically derived product instance that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A code that identifies the kind of this biologically derived product (SNOMED Ctcode).")
	@Mandatory
	fhir.CodeableConcept getProductCode();
	void setProductCode(fhir.CodeableConcept productCode);
	@Description("Procedure request to obtain this biologically derived product.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRequest();
	void setRequest(java.util.List<com.braintribe.model.generic.GenericEntity> request);

	@Description("Parent product (if any).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getParent();
	void setParent(java.util.List<com.braintribe.model.generic.GenericEntity> parent);

	@Description("How this product was collected.")
	@Mandatory
	fhir.BiologicallyDerivedProductCollection getCollection();
	void setCollection(fhir.BiologicallyDerivedProductCollection collection);
	@Description("Any processing of the product during collection that does not change the fundamental nature of the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.")
	
	java.util.List<fhir.BiologicallyDerivedProductProcessing> getProcessing();
	void setProcessing(java.util.List<fhir.BiologicallyDerivedProductProcessing> processing);

	@Description("Any manipulation of product post-collection that is intended to alter the product.  For example a buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for infusion.")
	@Mandatory
	fhir.BiologicallyDerivedProductManipulation getManipulation();
	void setManipulation(fhir.BiologicallyDerivedProductManipulation manipulation);
	@Description("Product storage.")
	
	java.util.List<fhir.BiologicallyDerivedProductStorage> getStorage();
	void setStorage(java.util.List<fhir.BiologicallyDerivedProductStorage> storage);

}
