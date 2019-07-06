/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationMoiety of the Data Model fhir.
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
{@link role}, 
{@link identifier}, 
{@link stereochemistry}, 
{@link opticalActivity}, 
{@link amountQuantity}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link getIdentifier},
{@link getStereochemistry},
{@link getOpticalActivity},
{@link getAmountQuantity},
{@link setRole},
{@link setIdentifier},
{@link setStereochemistry},
{@link setOpticalActivity},
{@link setAmountQuantity},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationMoiety extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationMoiety> T = EntityTypes.T(SubstanceSpecificationMoiety.class);

	/* Constants for each property name. */
	java.lang.String role = "role";
	java.lang.String identifier = "identifier";
	java.lang.String stereochemistry = "stereochemistry";
	java.lang.String opticalActivity = "opticalActivity";
	java.lang.String amountQuantity = "amountQuantity";

	@Description("Role that the moiety is playing.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
	@Description("Identifier by which this moiety substance is known.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Stereochemistry type.")
	@Mandatory
	fhir.CodeableConcept getStereochemistry();
	void setStereochemistry(fhir.CodeableConcept stereochemistry);
	@Description("Optical activity type.")
	@Mandatory
	fhir.CodeableConcept getOpticalActivity();
	void setOpticalActivity(fhir.CodeableConcept opticalActivity);
	@Description("")
	@Mandatory
	fhir.Quantity getAmountQuantity();
	void setAmountQuantity(fhir.Quantity amountQuantity);
}
