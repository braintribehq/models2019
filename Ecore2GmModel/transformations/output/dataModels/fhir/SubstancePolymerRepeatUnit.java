/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstancePolymerRepeatUnit of the Data Model fhir.
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
{@link orientationOfPolymerisation}, 
{@link amount}, 
{@link degreeOfPolymerisation}, 
{@link structuralRepresentation}, 

* It provides of then following operations (getters and setters)
{@link getOrientationOfPolymerisation},
{@link getAmount},
{@link getDegreeOfPolymerisation},
{@link getStructuralRepresentation},
{@link setOrientationOfPolymerisation},
{@link setAmount},
{@link setDegreeOfPolymerisation},
{@link setStructuralRepresentation},
 */

@Description("Todo.")

public interface SubstancePolymerRepeatUnit extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstancePolymerRepeatUnit> T = EntityTypes.T(SubstancePolymerRepeatUnit.class);

	/* Constants for each property name. */
	java.lang.String orientationOfPolymerisation = "orientationOfPolymerisation";
	java.lang.String amount = "amount";
	java.lang.String degreeOfPolymerisation = "degreeOfPolymerisation";
	java.lang.String structuralRepresentation = "structuralRepresentation";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getOrientationOfPolymerisation();
	void setOrientationOfPolymerisation(fhir.CodeableConcept orientationOfPolymerisation);
	@Description("Todo.")
	@Mandatory
	fhir.SubstanceAmount getAmount();
	void setAmount(fhir.SubstanceAmount amount);
	@Description("Todo.")
	
	java.util.List<fhir.SubstancePolymerDegreeOfPolymerisation> getDegreeOfPolymerisation();
	void setDegreeOfPolymerisation(java.util.List<fhir.SubstancePolymerDegreeOfPolymerisation> degreeOfPolymerisation);

	@Description("Todo.")
	
	java.util.List<fhir.SubstancePolymerStructuralRepresentation> getStructuralRepresentation();
	void setStructuralRepresentation(java.util.List<fhir.SubstancePolymerStructuralRepresentation> structuralRepresentation);

}
