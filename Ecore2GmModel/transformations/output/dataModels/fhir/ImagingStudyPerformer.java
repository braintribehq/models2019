/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImagingStudyPerformer of the Data Model fhir.
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
{@link function}, 
{@link actor}, 

* It provides of then following operations (getters and setters)
{@link getFunction},
{@link getActor},
{@link setFunction},
{@link setActor},
 */

@Description("Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.")

public interface ImagingStudyPerformer extends GenericEntity, fhir.BackboneElement {

	EntityType<ImagingStudyPerformer> T = EntityTypes.T(ImagingStudyPerformer.class);

	/* Constants for each property name. */
	java.lang.String function = "function";
	java.lang.String actor = "actor";

	@Description("Distinguishes the type of involvement of the performer in the series.")
	@Mandatory
	fhir.CodeableConcept getFunction();
	void setFunction(fhir.CodeableConcept function);
	@Description("Indicates who or what performed the series.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getActor();
	void setActor(com.braintribe.model.generic.GenericEntity actor);
}
