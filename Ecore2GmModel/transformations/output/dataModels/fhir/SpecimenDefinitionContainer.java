/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenDefinitionContainer of the Data Model fhir.
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
{@link material}, 
{@link type}, 
{@link cap}, 
{@link capacity}, 
{@link minimumVolumeQuantity}, 
{@link additive}, 

* It provides of then following operations (getters and setters)
{@link getMaterial},
{@link getType},
{@link getCap},
{@link getCapacity},
{@link getMinimumVolumeQuantity},
{@link getAdditive},
{@link setMaterial},
{@link setType},
{@link setCap},
{@link setCapacity},
{@link setMinimumVolumeQuantity},
{@link setAdditive},
 */

@Description("A kind of specimen with associated set of requirements.")

public interface SpecimenDefinitionContainer extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenDefinitionContainer> T = EntityTypes.T(SpecimenDefinitionContainer.class);

	/* Constants for each property name. */
	java.lang.String material = "material";
	java.lang.String type = "type";
	java.lang.String cap = "cap";
	java.lang.String capacity = "capacity";
	java.lang.String minimumVolumeQuantity = "minimumVolumeQuantity";
	java.lang.String additive = "additive";

	@Description("The type of material of the container.")
	@Mandatory
	fhir.CodeableConcept getMaterial();
	void setMaterial(fhir.CodeableConcept material);
	@Description("The type of container used to contain this kind of specimen.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Color of container cap.")
	@Mandatory
	fhir.CodeableConcept getCap();
	void setCap(fhir.CodeableConcept cap);
	@Description("The capacity (volume or other measure) of this kind of container.")
	@Mandatory
	fhir.Quantity getCapacity();
	void setCapacity(fhir.Quantity capacity);
	@Description("")
	@Mandatory
	fhir.Quantity getMinimumVolumeQuantity();
	void setMinimumVolumeQuantity(fhir.Quantity minimumVolumeQuantity);
	@Description("Substance introduced in the kind of container to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA.")
	
	java.util.List<fhir.SpecimenDefinitionAdditive> getAdditive();
	void setAdditive(java.util.List<fhir.SpecimenDefinitionAdditive> additive);

}
