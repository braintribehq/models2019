/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VisionPrescription of the Data Model fhir.
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
{@link patient}, 
{@link encounter}, 
{@link prescriber}, 
{@link lensSpecification}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getEncounter},
{@link getPrescriber},
{@link getLensSpecification},
{@link setIdentifier},
{@link setPatient},
{@link setEncounter},
{@link setPrescriber},
{@link setLensSpecification},
 */

@Description("An authorization for the provision of glasses and/or contact lenses to a patient.If the element is present, it must have either a @value, an @id, or extensions")

public interface VisionPrescription extends GenericEntity, fhir.FhirDomainResource {

	EntityType<VisionPrescription> T = EntityTypes.T(VisionPrescription.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String encounter = "encounter";
	java.lang.String prescriber = "prescriber";
	java.lang.String lensSpecification = "lensSpecification";

	@Description("A unique identifier assigned to this vision prescription.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A resource reference to the person to whom the vision prescription applies.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("A reference to a resource that identifies the particular occurrence of contact between patient and health care provider during which the prescription was issued.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The healthcare professional responsible for authorizing the prescription.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPrescriber();
	void setPrescriber(com.braintribe.model.generic.GenericEntity prescriber);
	@Description("Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.")
	
	java.util.List<fhir.VisionPrescriptionLensSpecification> getLensSpecification();
	void setLensSpecification(java.util.List<fhir.VisionPrescriptionLensSpecification> lensSpecification);

}
