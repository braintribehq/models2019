/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPharmaceutical of the Data Model fhir.
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
{@link administrableDoseForm}, 
{@link unitOfPresentation}, 
{@link ingredient}, 
{@link device}, 
{@link characteristics}, 
{@link routeOfAdministration}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getAdministrableDoseForm},
{@link getUnitOfPresentation},
{@link getIngredient},
{@link getDevice},
{@link getCharacteristics},
{@link getRouteOfAdministration},
{@link setIdentifier},
{@link setAdministrableDoseForm},
{@link setUnitOfPresentation},
{@link setIngredient},
{@link setDevice},
{@link setCharacteristics},
{@link setRouteOfAdministration},
 */

@Description("A pharmaceutical product described in terms of its composition and dose form.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductPharmaceutical extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductPharmaceutical> T = EntityTypes.T(MedicinalProductPharmaceutical.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String administrableDoseForm = "administrableDoseForm";
	java.lang.String unitOfPresentation = "unitOfPresentation";
	java.lang.String ingredient = "ingredient";
	java.lang.String device = "device";
	java.lang.String characteristics = "characteristics";
	java.lang.String routeOfAdministration = "routeOfAdministration";

	@Description("An identifier for the pharmaceutical medicinal product.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The administrable dose form, after necessary reconstitution.")
	@Mandatory
	fhir.CodeableConcept getAdministrableDoseForm();
	void setAdministrableDoseForm(fhir.CodeableConcept administrableDoseForm);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getUnitOfPresentation();
	void setUnitOfPresentation(fhir.CodeableConcept unitOfPresentation);
	@Description("Ingredient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getIngredient();
	void setIngredient(java.util.List<com.braintribe.model.generic.GenericEntity> ingredient);

	@Description("Accompanying device.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDevice();
	void setDevice(java.util.List<com.braintribe.model.generic.GenericEntity> device);

	@Description("Characteristics e.g. a products onset of action.")
	
	java.util.List<fhir.MedicinalProductPharmaceuticalCharacteristics> getCharacteristics();
	void setCharacteristics(java.util.List<fhir.MedicinalProductPharmaceuticalCharacteristics> characteristics);

	@Description("The path by which the pharmaceutical product is taken into or makes contact with the body.")
	
	java.util.List<fhir.MedicinalProductPharmaceuticalRouteOfAdministration> getRouteOfAdministration();
	void setRouteOfAdministration(java.util.List<fhir.MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration);

}
