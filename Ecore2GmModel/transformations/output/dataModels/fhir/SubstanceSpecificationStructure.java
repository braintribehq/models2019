/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationStructure of the Data Model fhir.
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
{@link stereochemistry}, 
{@link opticalActivity}, 
{@link isotope}, 
{@link molecularWeight}, 
{@link source}, 
{@link representation}, 

* It provides of then following operations (getters and setters)
{@link getStereochemistry},
{@link getOpticalActivity},
{@link getIsotope},
{@link getMolecularWeight},
{@link getSource},
{@link getRepresentation},
{@link setStereochemistry},
{@link setOpticalActivity},
{@link setIsotope},
{@link setMolecularWeight},
{@link setSource},
{@link setRepresentation},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationStructure extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationStructure> T = EntityTypes.T(SubstanceSpecificationStructure.class);

	/* Constants for each property name. */
	java.lang.String stereochemistry = "stereochemistry";
	java.lang.String opticalActivity = "opticalActivity";
	java.lang.String isotope = "isotope";
	java.lang.String molecularWeight = "molecularWeight";
	java.lang.String source = "source";
	java.lang.String representation = "representation";

	@Description("Stereochemistry type.")
	@Mandatory
	fhir.CodeableConcept getStereochemistry();
	void setStereochemistry(fhir.CodeableConcept stereochemistry);
	@Description("Optical activity type.")
	@Mandatory
	fhir.CodeableConcept getOpticalActivity();
	void setOpticalActivity(fhir.CodeableConcept opticalActivity);
	@Description("Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.")
	
	java.util.List<fhir.SubstanceSpecificationIsotope> getIsotope();
	void setIsotope(java.util.List<fhir.SubstanceSpecificationIsotope> isotope);

	@Description("The molecular weight or weight range (for proteins, polymers or nucleic acids).")
	@Mandatory
	fhir.SubstanceSpecificationMolecularWeight getMolecularWeight();
	void setMolecularWeight(fhir.SubstanceSpecificationMolecularWeight molecularWeight);
	@Description("Supporting literature.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSource();
	void setSource(java.util.List<com.braintribe.model.generic.GenericEntity> source);

	@Description("Molecular structural representation.")
	
	java.util.List<fhir.SubstanceSpecificationRepresentation> getRepresentation();
	void setRepresentation(java.util.List<fhir.SubstanceSpecificationRepresentation> representation);

}
