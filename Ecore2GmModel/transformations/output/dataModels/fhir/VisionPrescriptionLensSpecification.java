/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VisionPrescriptionLensSpecification of the Data Model fhir.
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
{@link product}, 
{@link prism}, 
{@link duration}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getProduct},
{@link getPrism},
{@link getDuration},
{@link getNote},
{@link setProduct},
{@link setPrism},
{@link setDuration},
{@link setNote},
 */

@Description("An authorization for the provision of glasses and/or contact lenses to a patient.")

public interface VisionPrescriptionLensSpecification extends GenericEntity, fhir.BackboneElement {

	EntityType<VisionPrescriptionLensSpecification> T = EntityTypes.T(VisionPrescriptionLensSpecification.class);

	/* Constants for each property name. */
	java.lang.String product = "product";
	java.lang.String prism = "prism";
	java.lang.String duration = "duration";
	java.lang.String note = "note";

	@Description("Identifies the type of vision correction product which is required for the patient.")
	@Mandatory
	fhir.CodeableConcept getProduct();
	void setProduct(fhir.CodeableConcept product);
	@Description("Allows for adjustment on two axis.")
	
	java.util.List<fhir.VisionPrescriptionPrism> getPrism();
	void setPrism(java.util.List<fhir.VisionPrescriptionPrism> prism);

	@Description("The recommended maximum wear period for the lens.")
	@Mandatory
	fhir.Quantity getDuration();
	void setDuration(fhir.Quantity duration);
	@Description("Notes for special requirements such as coatings and lens materials.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
