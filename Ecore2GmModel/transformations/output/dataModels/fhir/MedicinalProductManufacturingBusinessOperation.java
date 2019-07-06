/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductManufacturingBusinessOperation of the Data Model fhir.
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
{@link operationType}, 
{@link authorisationReferenceNumber}, 
{@link confidentialityIndicator}, 
{@link manufacturer}, 
{@link regulator}, 

* It provides of then following operations (getters and setters)
{@link getOperationType},
{@link getAuthorisationReferenceNumber},
{@link getConfidentialityIndicator},
{@link getManufacturer},
{@link getRegulator},
{@link setOperationType},
{@link setAuthorisationReferenceNumber},
{@link setConfidentialityIndicator},
{@link setManufacturer},
{@link setRegulator},
 */

@Description("Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).")

public interface MedicinalProductManufacturingBusinessOperation extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductManufacturingBusinessOperation> T = EntityTypes.T(MedicinalProductManufacturingBusinessOperation.class);

	/* Constants for each property name. */
	java.lang.String operationType = "operationType";
	java.lang.String authorisationReferenceNumber = "authorisationReferenceNumber";
	java.lang.String confidentialityIndicator = "confidentialityIndicator";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String regulator = "regulator";

	@Description("The type of manufacturing operation.")
	@Mandatory
	fhir.CodeableConcept getOperationType();
	void setOperationType(fhir.CodeableConcept operationType);
	@Description("Regulatory authorization reference number.")
	@Mandatory
	fhir.Identifier getAuthorisationReferenceNumber();
	void setAuthorisationReferenceNumber(fhir.Identifier authorisationReferenceNumber);
	@Description("To indicate if this proces is commercially confidential.")
	@Mandatory
	fhir.CodeableConcept getConfidentialityIndicator();
	void setConfidentialityIndicator(fhir.CodeableConcept confidentialityIndicator);
	@Description("The manufacturer or establishment associated with the process.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturer();
	void setManufacturer(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturer);

	@Description("A regulator which oversees the operation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRegulator();
	void setRegulator(com.braintribe.model.generic.GenericEntity regulator);
}
